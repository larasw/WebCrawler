package strategy;

import org.junit.Test;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;

public class DFSTest {

    @Test
    public void getPageLinksNotNullTest() {
        DFS dfs = new DFS();
        dfs.getPageLinks("http://localhost/sample_site_to_crawl/");
        assertThat(dfs.getLinks(),notNullValue());
        assertThat(dfs.getLinks(),not("[]"));
        assertThat(dfs.getLinks().toString(),containsString("sample_site_to_crawl"));
    }

    @Test
    public void extractorNotNullandCorrectResultTest() {
        DFS dfs = new DFS();
        dfs.extractor("Design");
        assertThat(dfs.getExtractResult().toString(),containsString("lala"));
    }

    @Test
    public void jsonResult() {
    }
}