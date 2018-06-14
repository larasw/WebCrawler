package result;

import model.Book;
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
}