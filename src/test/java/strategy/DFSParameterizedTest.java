package strategy;

import exception.InputDataNotValidException;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import main.Web_Crawler;
import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class DFSParameterizedTest {

    private Web_Crawler wb;
    private DFS dfs;

    private static Object[] ExtractorTestData(){
        return new Object[]{
                new Object[]{"Design"},
                new Object[]{"Clean"},
                new Object[]{"Martin"}
        };
    }

    /*DFS Test*/
    @Test
    @Parameters(method = "ExtractorTestData")
    public void extractorNotNullTest(String ExtractorTestData){
        dfs = new DFS();
        assertThat(dfs.Extractor(ExtractorTestData),notNullValue());
    }

    @Test
    @Parameters(method = "ExtractorTestData")
    public void extractorCorrectResultTest(String ExtractorTestData) throws InputDataNotValidException {
        dfs = new DFS();
        dfs.getPageLinks("http://localhost/sample_site_to_crawl/");
        assertThat(dfs.Extractor(ExtractorTestData),containsString(ExtractorTestData));
    }

    /*Web Crawler Test*/
    @Test
    @Parameters(method = "ExtractorTestData")
    public void CrawlNotNullTest(String ExtractorTestData) throws InputDataNotValidException {
        wb = new Web_Crawler();
        assertThat(wb.Crawl(ExtractorTestData),notNullValue());
    }

    @Test
    @Parameters(method = "ExtractorTestData")
    public void CrawlCorrectResultTest(String ExtractorTestData) throws InputDataNotValidException {
        wb = new Web_Crawler();
        assertThat(wb.Crawl(ExtractorTestData),containsString(ExtractorTestData));
    }

    @Test
    public void getPageLinksNotNullTest() throws InputDataNotValidException {
        dfs = new DFS();
        dfs.getPageLinks("http://localhost/sample_site_to_crawl/");
        assertThat(dfs.getLinks(),notNullValue());
        assertThat(dfs.getLinks(),not("[]"));
    }

    @Test
    public void getPageLinksCorrectResultTest() throws InputDataNotValidException {
        dfs = new DFS();
        dfs.getPageLinks("http://localhost/sample_site_to_crawl/");
        assertThat(dfs.getLinks().toString(),containsString("sample_site_to_crawl"));
    }
}