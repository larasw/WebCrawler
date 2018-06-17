package strategy;

import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DFS {
    private ArrayList<String> links;
    private int depth=0;

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

    public void extractor(String search){

    }

    public void jsonResult(){

    }

    public ArrayList<String> getLinks() {
        return links;
    }

    public JSONObject getExtractResult(){
        return null;
    }
}
