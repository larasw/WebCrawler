package result;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class Crawl_ResultTest {
    @Test
    public void constructorToInstantiateBooksArrayListTest() {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        int total = result.getBooks().size();

        // assert
        assertThat(total).isEqualTo(0);
    }
}