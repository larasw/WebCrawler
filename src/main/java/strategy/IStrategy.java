package strategy;

import exception.InputDataNotValidException;
import result.Crawl_Result;

import java.util.ArrayList;

public interface IStrategy {
//    Crawl_Result search(String keyword);
//    void deserialize(String result);
//    ArrayList<Crawl_Result> getCrawlResult();
    void getPageLinks(String URL) throws InputDataNotValidException;
    String Extractor(String search);

}
