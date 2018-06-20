package result;

import exception.InputDataNotValidException;
import model.Book;
import model.Movie;
import model.Music;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito.*;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Crawl_ResultTest {
    /**
     * Test instantiation of books ArrayList when constructor is being executed
     */
    @Test
    public void constructorToInstantiateBooksArrayListTest() {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        int total = result.getBooks().size();

        // assert
        assertThat(total).isEqualTo(0);
    }

    /**
     * Test instantiation of movies ArrayList when constructor is being executed
     */
    @Test
    public void constructorToInstantiateMoviesArrayListTest() {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        int total = result.getMovies().size();

        // assert
        assertThat(total).isEqualTo(0);
    }

    /**
     * Test instantiation of music ArrayList when constructor is being executed
     */
    @Test
    public void constructorToInstantiateMusicsArrayListTest() {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        int total = result.getMusic().size();

        // assert
        assertThat(total).isEqualTo(0);
    }

    /**
     * Test add 1 book to books ArrayList
     */
    @Test
    public void add1BookTest() {
        // arrange
        Crawl_Result result = new Crawl_Result();
        Book book = mock(Book.class);

        // act
        result.AddBook(book);
        int total = result.getBooks().size();

        // assert
        assertThat(total).isEqualTo(1);
    }

    /**
     * Test add 1 movie to movies ArrayList
     */
    @Test
    public void add1MovieTest() {
        // arrange
        Crawl_Result result = new Crawl_Result();
        Movie movie = mock(Movie.class);

        // act
        result.AddMovie(movie);
        int total = result.getMovies().size();

        // assert
        assertThat(total).isEqualTo(1);
    }

    /**
     * Test add 1 music to music ArrayList
     */
    @Test
    public void add1MusicTest() {
        // arrange
        Crawl_Result result = new Crawl_Result();
        Music music = mock(Music.class);

        // act
        result.AddMusic(music);
        int total = result.getMusic().size();

        // assert
        assertThat(total).isEqualTo(1);
    }

    /**
     * Set 0 as Result's ID. InputDataNotValidException would be thrown because ID cannot be 0
     * @throws InputDataNotValidException
     */
    @Test(expected = InputDataNotValidException.class)
    public void setZeroAsId() throws InputDataNotValidException {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        result.setId(5);
        result.setId(0);
        int id = result.getId();

        // assert
        //assertThat(id).isEqualTo(5);
    }

    /**
     * Set -1 as Result's ID. InputDataNotValidException would be thrown because ID cannot be minus
     * @throws InputDataNotValidException
     */
    @Test(expected = InputDataNotValidException.class)
    public void setMinusOneAsId() throws InputDataNotValidException {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        result.setId(5);
        result.setId(-1);
        int id = result.getId();

        // assert
        //assertThat(id).isEqualTo(5);
    }

    /**
     * Set 5 as Result's ID. 5 is not violate the rule of ID's input, so InputDataNotValidException would not be thrown
     * @throws InputDataNotValidException
     */
    @Test
    public void setFiveAsId() throws InputDataNotValidException {
        // arrange
        int id = 5;
        Crawl_Result result = new Crawl_Result();

        // act
        result.setId(id);
        int getId = result.getId();

        // assert
        assertThat(getId).isEqualTo(id);
    }

    /**
     * Set -1 as Result's number of pages. InputDataNotValidException would be thrown because pages cannot be minus
     * @throws InputDataNotValidException
     */
    @Test (expected = InputDataNotValidException.class)
    public void setMinusOneAsNumberOfPages() throws InputDataNotValidException {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        result.setNumberOfPages(5);
        result.setNumberOfPages(-1);
        int numberOfPages = result.getNumberOfPages();

        // assert
        //assertThat(numberOfPages).isEqualTo(5);
    }

    /**
     * Set 5 as Result's Number of pages. 5 is not violate the rule of number of pages's input, so InputDataNotValidException would not be thrown
     * @throws InputDataNotValidException
     */
    @Test
    public void setFiveAsNumberOfPages() throws InputDataNotValidException {
        // arrange
        int numberOfPages = 5;
        Crawl_Result result = new Crawl_Result();

        // act
        result.setNumberOfPages(5);
        int getNumberOfPages = result.getNumberOfPages();

        // assert
        assertThat(getNumberOfPages).isEqualTo(numberOfPages);
    }

    /**
     * Set 0 as Result's time elapsed. InputDataNotValidException would be thrown because time cannot be 0. If it's 0 means there are issue on the connection
     * @throws InputDataNotValidException
     */
    @Test(expected = InputDataNotValidException.class)
    public void setTimeElapsedToZero() throws InputDataNotValidException {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        result.setTimeElapsed(10);
        result.setTimeElapsed(0);
        long timeResult = result.getTimeElapsed();

        // assert
        //assertThat(timeResult).isEqualTo(10);

    }

    /**
     * Set -1 as Result's time elapsed. InputDataNotValidException would be thrown because time cannot be minus
     * @throws InputDataNotValidException
     */
    @Test (expected = InputDataNotValidException.class)
    public void setTimeElapsedAsMinusOne() throws InputDataNotValidException {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        result.setTimeElapsed(10);
        result.setTimeElapsed(-1);
        long timeResult = result.getTimeElapsed();

        // assert
        //assertThat(timeResult).isEqualTo(10);
    }

    /**
     * Set 10 as Result's TIme elapsed. 10 is not violate the rule of time elapsed's input, so InputDataNotValidException would not be thrown
     * @throws InputDataNotValidException
     */
    @Test
    public void setTenAsTimeElapsed() throws InputDataNotValidException {
        // arrange
        long timeElapsed = 10;
        Crawl_Result result = new Crawl_Result();

        // act
        result.setTimeElapsed(10);
        long getTimeElapsed = result.getTimeElapsed();

        // assert
        assertThat(getTimeElapsed).isEqualTo(timeElapsed);
    }

    @Test
    public void addBookAuthorMockitoTest() {
        // arrange
        String author = "Demogorgon";
        String expected = "Successfully add "+author+" as the author";
        Crawl_Result result = new Crawl_Result();
        Book book = mock(Book.class);

        // STUB
        when(book.AddAuthor(author)).thenReturn(expected);

        // act
        result.AddBook(book);
        String addResult = result.AddAuthorBook(0,author);

        // assert
        Assert.assertEquals("Author has failed to add", expected, addResult);

        // verify
        verify(book).AddAuthor(author);
    }

    @Test
    public void addMovieWriterMockitoTest() {
        // arrange
        String writer = "Bag shop";
        String expected = "Successfully add "+writer+" as the writer";
        Crawl_Result result = new Crawl_Result();
        Movie movie = mock(Movie.class);

        // STUB
        when(movie.addWriter(writer)).thenReturn(expected);

        // act
        result.AddMovie(movie);
        String addResult = result.AddWriterMovie(0,writer);

        // assert
        Assert.assertEquals("Writer has failed to add", expected, addResult);

        // verify
        verify(movie).addWriter(writer);
    }

    @Test
    public void addMovieStarMockitoTest() {
        // arrange
        String star = "Asa Butterfield";
        String expected = "Successfully add "+star+" as the star";
        Crawl_Result result = new Crawl_Result();
        Movie movie = mock(Movie.class);

        // STUB
        when(movie.addStar(star)).thenReturn(expected);

        // act
        result.AddMovie(movie);
        String addResult = result.AddStarMovie(0,star);

        // assert
        Assert.assertEquals("Star has failed to add", expected, addResult);

        // verify
        verify(movie).addStar(star);
    }
}