package strategy;

import org.junit.Test;
import result.Crawl_Result;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.*;

public class IStrategyTest {
    @Test
    public void searchTestToGetSameCrawl_ResultObject() {
        // arrange
        String keyword = "KEYWORD";
        IStrategy strategy = mock(IStrategy.class);
        Crawl_Result crawl_result = mock(Crawl_Result.class);

        // STUB
        when(strategy.search(keyword)).thenReturn(crawl_result);

        // assert
        assertThat(strategy.search(keyword)).isEqualTo(crawl_result);

    }
}