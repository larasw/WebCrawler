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
        dfs.getPageLinks("");
        assertThat(dfs.getLinks(),null);
    }

    @Test
    public void extractor() {
    }

    @Test
    public void jsonResult() {
    }
}