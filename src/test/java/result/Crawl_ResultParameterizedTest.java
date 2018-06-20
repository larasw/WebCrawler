package result;

import exception.InputDataNotValidException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static java.lang.Math.toIntExact;

@RunWith(Parameterized.class)
public class Crawl_ResultParameterizedTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 }, { 5, 5 }, { 6, 6 }
        });
    }

    private int input;
    private int expected;
    public Crawl_ResultParameterizedTest(int input, int expected){
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void parameterizedIDTest() throws InputDataNotValidException {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        result.setId(input);
        int resultId = result.getId();

        // assert
        assertThat(resultId, is(equalTo(expected)));
    }

    @Test
    public void parameterizedNumberOfPagesTest() throws InputDataNotValidException {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        result.setNumberOfPages(input);
        int resultNumberOfPages = result.getNumberOfPages();

        // assert
        assertThat(resultNumberOfPages, is(equalTo(expected)));
    }

    @Test
    public void parameterizedTimeElapsedTest() throws InputDataNotValidException {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        result.setTimeElapsed(input);
        int resultTimeElapsed = toIntExact(result.getTimeElapsed());

        // assert
        assertThat(resultTimeElapsed, is(equalTo(expected)));
    }
}
