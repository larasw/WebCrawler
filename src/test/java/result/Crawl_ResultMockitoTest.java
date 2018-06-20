package result;

import model.Book;
import model.Movie;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Crawl_ResultMockitoTest {
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
}
