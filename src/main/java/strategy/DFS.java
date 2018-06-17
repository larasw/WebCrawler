package strategy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.time.StopWatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DFS {
    private ArrayList<String> links;
    private int depth=0;
    private int search_depth=0;
    private int pages_exp=0;
    private StopWatch stopWatch = new StopWatch();

    JSONObject jsonObj = new JSONObject();
    JSONObject jo = new JSONObject();
    JSONArray manyInfo = new JSONArray();
    JSONArray search_details = new JSONArray();
    JSONObject jsonResults = new JSONObject();

    public DFS() {
        links = new ArrayList<>();
    }

    public void getPageLinks(String URL) {
        if (URL.contains("sample_site_to_crawl")){
            if (!links.contains(URL)) {
                try {
                    if (links.add(URL)) {
//                        System.out.println("Depth: "+depth+ " ["+URL+"]");
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

    private void extractinfo(Elements mediaDetails, String x)  {
        pages_exp++;
        String Category = null;
        Elements Title = mediaDetails.select("h1");
        String ObjectTitle = Title.text();
        try {
            jo.put("Name",ObjectTitle);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Elements tinfo = mediaDetails.select("th");
        Elements tvalue = mediaDetails.select("td");
        try {
            jo.put("id",x.substring(x.indexOf("id=")+3,x.length()));
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
                    jo.put(info,manyInfo);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                manyInfo = new JSONArray(new ArrayList<String>());
            }
            else {
                try {
                    jo.put(info,value);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            jsonObj.append(Category,jo);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        jo = new JSONObject();
    }

    public void extractor(String search){
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
        search_details.put("Time_elapsed: "+stopWatch);
        search_details.put("Pages_explored: "+pages_exp);
        search_details.put("Search_depth: "+search_depth);
        search_details.put(jsonObj);
        try {
            jsonResults.put("Results for: "+search,search_details);
        } catch (JSONException e) {
            System.err.println("Fail to put results into final");
            e.printStackTrace();
        }
    }

    public void jsonResult(){

    }

    public ArrayList<String> getLinks() {
        return links;
    }

    public JSONObject getExtractResult(){
        return jsonResults;
    }
}
