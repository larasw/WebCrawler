package main;

import org.json.JSONException;
import strategy.DFS;

import java.util.Scanner;

public class Web_Crawler {
    // The purpose of this comment is to check Jenkins Automated Test
    // Which is really important for our final project :)
    // Thank you
    public static void main(String[] args) {
        DFS bwc = new DFS();
        bwc.getPageLinks("http://localhost/sample_site_to_crawl/");
        Scanner s = new Scanner(System.in);
        String a = s.next();
        bwc.Extractor(a);
        bwc.jsonResult();
    }
}
