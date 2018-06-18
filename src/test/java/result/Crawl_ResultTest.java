package result;

import model.Book;
import model.Movie;
import model.Music;
import org.junit.Test;
import org.mockito.Mockito.*;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.mock;

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
     * Set 0 as Result's ID. The set will be ignore because ID cannot be 0
     */
    @Test
    public void setZeroAsId() {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        result.setId(5);
        result.setId(0);
        int id = result.getId();

        // assert
        assertThat(id).isEqualTo(5);
    }

    /**
     * Set -1 as Result's ID. The set will be ignore because ID cannot be minus
     */
    @Test
    public void setMinusOneAsId() {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        result.setId(5);
        result.setId(-1);
        int id = result.getId();

        // assert
        assertThat(id).isEqualTo(5);
    }

    /**
     * Set -1 as Result's number of pages. The set will be ignore because pages cannot be minus
     */
    @Test
    public void setMinusOneAsNumberOfPages() {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        result.setNumberOfPages(5);
        result.setNumberOfPages(-1);
        int numberOfPages = result.getNumberOfPages();

        // assert
        assertThat(numberOfPages).isEqualTo(5);
    }

    /**
     * Set 0 as Result's time elapsed. The set will be ignore because time cannot be 0. If it's 0 means there are issue on the connection
     */
    @Test
    public void setTimeElapsedToZero() {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        result.setTimeElapsed(10);
        result.setTimeElapsed(0);
        long timeResult = result.getTimeElapsed();

        // assert
        assertThat(timeResult).isEqualTo(10);

    }

    /**
     * Set -1 as Result's time elapsed. The set will be ignore because time cannot be minus
     */
    @Test
    public void setTimeElapsedAsMinusOne() {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        result.setTimeElapsed(10);
        result.setTimeElapsed(-1);
        long timeResult = result.getTimeElapsed();

        // assert
        assertThat(timeResult).isEqualTo(10);
    }
}