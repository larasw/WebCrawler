package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void getGenreShouldEmpty() {
        Movie movie = new Movie();

        String genre = movie.getGenre();

        assertEquals("Genre not empty", null, genre);
    }

    @Test
    public void setGenre() {
        Movie movie = new Movie();
        String setgrenre = "Horror";
        movie.setGenre("Horror");
        String genre = movie.getGenre();
        assertEquals("Genre is not "+setgrenre, "Horror", genre);
    }

    @Test
    public void getFormatShouldnotEmpty() {
        Movie movie = new Movie();
        String format = movie.getFormat();
        assertEquals("Format is empty", null, format);
    }

    @Test
    public void setFormat() {
    }

    @Test
    public void getYear() {
    }

    @Test
    public void setYear() {
    }

    @Test
    public void getDirector() {
    }

    @Test
    public void setDirector() {
    }

    @Test
    public void getWriters() {
    }

    @Test
    public void setWriters() {
    }

    @Test
    public void getStars() {
    }

    @Test
    public void setStars() {
    }
}