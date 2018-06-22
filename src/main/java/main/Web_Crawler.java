package main;

import exception.InputDataNotValidException;
import org.json.JSONException;
import strategy.DFS;
import strategy.IStrategy;

import java.util.Scanner;

public class Web_Crawler {
    // The purpose of this comment is to check Jenkins Automated Test
    // Which is really important for our final project :)
    // Thank you
    private IStrategy strategy;

    public  void setStrategy(DFS strategy){
        this.strategy = strategy;
    }
    public String Crawl(String search) throws InputDataNotValidException {
        strategy.getPageLinks("http://localhost/sample_site_to_crawl/");
        return strategy.Extractor(search);
    }

    public Web_Crawler(){
        this.setStrategy(new DFS());
    }

    public static void main(String[] args) throws InputDataNotValidException {
        Web_Crawler crawler = new Web_Crawler();
//        crawler.setStrategy(new DFS());
        Scanner s = new Scanner(System.in);
        String a = s.next();
        System.out.println(crawler.Crawl(a));
    }
}
