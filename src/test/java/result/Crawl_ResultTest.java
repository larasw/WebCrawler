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
    @Test
    public void constructorToInstantiateBooksArrayListTest() {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        int total = result.getBooks().size();

        // assert
        assertThat(total).isEqualTo(0);
    }

    @Test
    public void constructorToInstantiateMoviesArrayListTest() {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        int total = result.getMovies().size();

        // assert
        assertThat(total).isEqualTo(0);
    }

    @Test
    public void constructorToInstantiateMusicsArrayListTest() {
        // arrange
        Crawl_Result result = new Crawl_Result();

        // act
        int total = result.getMusic().size();

        // assert
        assertThat(total).isEqualTo(0);
    }

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
    
}