package main;

import strategy.DFS;

import java.util.Scanner;

public class Web_Crawler {
    // The purpose of this comment is to check Jenkins Automated Test
    // Which is really important for our final project :)
    // Thank you
    public static void main(String[] args){
        DFS bwc = new DFS();
        bwc.getPageLinks("http://localhost/site/");
        Scanner s = new Scanner(System.in);
        String a = s.next();
        bwc.extractor(a);
        bwc.jsonResult();
    }
}
