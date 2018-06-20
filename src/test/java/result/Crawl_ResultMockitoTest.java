package result;

import model.Book;
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

    
}
