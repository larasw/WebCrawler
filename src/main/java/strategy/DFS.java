package strategy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.time.StopWatch;
import org.assertj.core.internal.bytebuddy.dynamic.scaffold.FieldLocator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes .Element;
import org.jsoup.select.Elements;

public class DFS implements IStrategy{
    private ArrayList<String> links;
    private int depth=0;
    private int search_depth=0;
    private int pages_exp=0;
    private StopWatch stopWatch = new StopWatch();

    JSONObject item = new JSONObject();
    JSONObject item_details = new JSONObject();
    JSONObject jsonResults = new JSONObject();
    JSONObject FinalResults = new JSONObject();

    JSONArray manyInfo = new JSONArray();
    JSONArray search_details = new JSONArray();


    public DFS() {
        links = new ArrayList<>();
    }

    /*
    * This method is used to crawl through the website
    *
    * @param used String type as URL base of the website to be crawled
    * */
    @Override
    public void getPageLinks(String URL) {
        if (URL.contains("sample")){
            if (!links.contains(URL)) {
                try {
                    if (links.add(URL)) {
                        System.out.println("Depth: "+depth+ " ["+URL+"]");
                    }

                    Document document = Jsoup.connect(URL).get();
                    Elements linksOnPage = document.select("a[href]");

                    depth++;
                    for (Element page : linksOnPage) {
                        getPageLinks(page.attr("abs:href"));
                    }
                } catch (IOException e) {
                    System.err.println("For '" + URL + "': " + e.getMessage());
                }
            }
        }
    }

    /*
    * This method is used to extract the information from the selected link
    * also created to minimalize code redundant
    *
    * @param Elements mediaDetails is an element that used in the extractor
    * for filtering and selecting media details. String x is a parameter used
    * to send the selected link that the information need to be extracted
    *
    * */
    private void extractinfo(Elements mediaDetails, String x)  {
        pages_exp++;
        String Category = null;
        Elements Title = mediaDetails.select("h1");
        String ObjectTitle = Title.text();
        try {
            item_details.put("Name",ObjectTitle);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Elements tinfo = mediaDetails.select("th");
        Elements tvalue = mediaDetails.select("td");
        try {
            item_details.put("id",x.substring(x.indexOf("id=")+3,x.length()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        for(int i = 0; i<tinfo.size();i++){
            String info = tinfo.get(i).text();
            String value = tvalue.get(i).text();
            if(tinfo.first().text().equals("Category")){
                Category = tvalue.first().text();
            }
            if(info.endsWith("s")){
                String[] temp = value.split(",");
                List<String> tempList = new ArrayList<>(Arrays.asList(temp));
                for(int j = 0;j<tempList.size();j++){
                    manyInfo.put(temp[j]);
                }
                try {
                    item_details.put(info,manyInfo);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                manyInfo = new JSONArray(new ArrayList<String>());
            }
            else {
                try {
                    item_details.put(info,value);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            item.append(Category,item_details);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        item_details = new JSONObject();
    }

    /*
    * This method is an extractor, used to find the asked information throughout
    * the links stored
    *
    * @param String search is an input from user asking for specific search or
    * all
    * */
    @Override
    public String Extractor(String search){
        stopWatch.start();
        System.out.println(search);
        links.forEach(x -> {
            Document document;
            try {
                document = Jsoup.connect(x).get();
                Elements mediaDetails = document.select("div[class^=\"media-details\"]");
                search_depth++;
                if(search.equals("all")|equals("All")){
                    if (mediaDetails.text().matches("^.*?(Books|Music|Movies).*$")) {
                        extractinfo(mediaDetails,x);
                    }
                }
                else if (mediaDetails.text().matches("^.*?("+search+").*$")|
                        x.matches("^.*?("+search+").*$")) {
                    extractinfo(mediaDetails,x);
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        });
        try {
            jsonResults.put("Result",item);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        search_details.put("Time_elapsed: "+stopWatch);
        search_details.put("Pages_explored: "+pages_exp);
        search_details.put("Search_depth: "+search_depth);
        search_details.put(jsonResults);
        try {
            FinalResults.put("Search Details",search_details);
        } catch (JSONException e) {
            e.printStackTrace();
        }
//        System.out.println(FinalResults);
        return FinalResults.toString();
    }

    public ArrayList<String> getLinks() {
        return links;
    }

    public String getExtractResult(){
        return jsonResults.toString();
    }
}
