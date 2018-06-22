package model;

import org.junit.Assert;
import org.junit.Test;
import result.Crawl_Result;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MockitoTest {
    /**
     * Mockito Testing for Set Music Format
     */
    @Test
    public void SetFormatMusicMockitoTest() {
        // arrange
        String format = "MKV";
        String expected = "Add "+format+" file"+" done!";
        TestMockito motest = new TestMockito();
        Music musicmock = mock(Music.class);

        // STUB
        when(musicmock.setFormatWithReturn(format)).thenReturn(expected);

        // act
        motest.setMusic(musicmock);
        String addMusic = motest.setMusicFormat(format);

        // assert
        Assert.assertEquals("Set format to Music class failed", expected, addMusic);

        // verify
        verify(musicmock).setFormatWithReturn(format);

        //Caesar
    }

    /**
     * Mockito testing for add movie star
     */
    @Test
    public void AddMovieStar() {
        // arrange
        String star = "James Bond";
        String expected = "Successfully add "+star+" as the star";
        TestMockito motest = new TestMockito();
        Movie moviemock = mock(Movie.class);

        // STUB
        when(moviemock.addStar(star)).thenReturn(expected);

        // act
        motest.setMovie(moviemock);
        String result = motest.addMovieStar(star);

        // assert
        Assert.assertEquals("Add star to movie mock failed", expected, result);

        // verify
        verify(moviemock).addStar(star);
    }

    /**
     * Mockito testing for remove movie star
     */
    @Test
    public void RemoveMovieStar() {
        // arrange
        int i = 2;
        String expected = "Successfully remove "+i+"th Star from the star";
        TestMockito motest = new TestMockito();
        Movie moviemock = mock(Movie.class);

        // STUB
        when(moviemock.removeStar(i)).thenReturn(expected);

        // act
        motest.setMovie(moviemock);
        String result = motest.removeMovieStar(i);

        // assert
        Assert.assertEquals("Remove star from movie mock failed", expected, result);

        // verify
        verify(moviemock).removeStar(i);
    }

    /**
     * Exeption Test when take data from arraylist which doesnt exist
     */
    @Test (expected = IndexOutOfBoundsException.class)
    public void setArraylistMovieStars(){
        Movie movie = new Movie();
        ArrayList<String> stars = new ArrayList<>();
        stars.add("Maria Berkeley");
        stars.add("Maria saparova");

        movie.setStars(stars);
        String star2 = movie.getStars().get(2);
    }

    /**
     * Exeption Test when remove data from arraylist which doesnt exist
     */
    @Test (expected = IndexOutOfBoundsException.class)
    public void setAuthorsBookTest(){
        Book book = new Book();

        ArrayList<String> authors = new ArrayList<>();
        authors.add("Jeffrey Harvard");
        book.setAuthors(authors);

        book.getAuthors().remove(1);
    }

    /**
     * Exeption Test when remove data from arraylist which doesnt exist at all
     */
    @Test (expected = NullPointerException.class)
    public void removeMovieStars(){
        Movie movie = new Movie();

        movie.getStars().remove(1);
    }
}
