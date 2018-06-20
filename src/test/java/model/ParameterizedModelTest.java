package model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedModelTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"Haha","Haha"}, {"Hehe","Hehe"},{"Hoho","Hoho"}
        });
    }

    private String input;
    private String expected;

    public ParameterizedModelTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void movieGenreTest() {
        // arrange
        Movie movie = new Movie();

        // act
        movie.setGenre(input);
        String result = movie.getGenre();

        // assert
        assertEquals(expected, result);
    }

    @Test
    public void musicGenreTest() {
        // arrange
        Music music = new Music();

        // act
        music.setGenre(input);
        String result = music.getGenre();

        // assert
        assertEquals(expected, result);
    }

    @Test
    public void bookGenreTest() {
        // arrange
        Book book = new Book();

        // act
        book.setGenre(input);
        String result = book.getGenre();

        // assert
        assertEquals(expected, result);
    }
}
