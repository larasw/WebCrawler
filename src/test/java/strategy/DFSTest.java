package strategy;

import exception.InputDataNotValidException;
import org.json.JSONException;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class DFSTest {

    @Test
    public void getPageLinksNotNullTest() throws InputDataNotValidException {
        DFS dfs = new DFS();
        dfs.getPageLinks("http://localhost/sample_site_to_crawl/");
        assertThat(dfs.getLinks(),notNullValue());
        assertThat(dfs.getLinks(),not("[]"));
    }

    @Test
    public void getPageLinksCorrectResultTest() throws InputDataNotValidException {
        DFS dfs = new DFS();
        dfs.getPageLinks("http://localhost/sample_site_to_crawl/");
        assertThat(dfs.getLinks().toString(),containsString("sample_site_to_crawl"));
    }

    @Test
    public void extractorNotNullandCorrectResultTest() throws JSONException {
        DFS dfs = new DFS();
        dfs.Extractor("Design");
        assertThat(dfs.getExtractResult().toString(),containsString("Design"));
    }

    @Test
    public void extractorExceptionTest() throws JSONException {
        DFS dfs = new DFS();
        dfs.Extractor("Design");
        assertThat(dfs.jsonResults.toString(),containsString("Design"));
    }

    @Test
    public void jsonResult() {
        DFS dfs = new DFS();
    }
}