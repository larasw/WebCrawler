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

/**
 * A test class that perform only for parameterized test
 */
@RunWith(Parameterized.class)
public class Crawl_ResultParameterizedTest {
    /**
     * List of Data that will be used as the input and expected value on each test method
     * @return
     */
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 }, { 5, 5 }, { 6, 6 }
        });
    }

    /**
     * Variable of input to store current parameterized input that will be use on each test method
     */
    private int input;

    /**
     * Variable of expected to store current parameterized expected that will be use on each test method
     */
    private int expected;

    /**
     * Constructor of Parameterized Test class that set the input and expected variable by both parameter
     * @param input as the parameter for input variable
     * @param expected as the parameter for expected variable
     */
    public Crawl_ResultParameterizedTest(int input, int expected){
        this.input = input;
        this.expected = expected;
    }

    /**
     * Parameterized Test of ID using Collection of Objects data list
     * @throws InputDataNotValidException
     */
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

    /**
     * Parameterized Test of Number of Pages using Collection of Objects data list
     * @throws InputDataNotValidException
     */
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

    /**
     * Parameterized Test of Time elapsed using Collection of Objects data list
     * @throws InputDataNotValidException
     */
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
