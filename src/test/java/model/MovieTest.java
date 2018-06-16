package model;

import org.junit.Test;

import java.util.ArrayList;

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
        movie.setGenre(setgrenre);
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
        Movie movie = new Movie();
        String setformat = "MKV";
        movie.setFormat(setformat);
        String format = movie.getFormat();
        assertEquals("Format is not "+setformat, "MKV", format);
    }

    @Test
    public void getYearNotEmpty() {
        Movie movie = new Movie();
        String year = movie.getYear();
        assertEquals("Year is not empty", null, year);
    }

    @Test
    public void setYear() {
        Movie movie = new Movie();
        String setYear = "2016";
        movie.setYear(setYear);
        String year = movie.getYear();
        assertEquals("Year is not "+setYear, "2016", year);
    }

    @Test
    public void getDirectorNotZero() {
        Movie movie = new Movie();
        String director = movie.getDirector();
        assertEquals("Director is not empty", null, director);
    }

    @Test
    public void setDirector() {
        Movie movie = new Movie();
        String setDirector = "Stephen Spielberg";
        movie.setDirector(setDirector);
        String director = movie.getDirector();
        assertEquals("Director is not "+setDirector, "Stephen Spielberg", director);
    }

    @Test
    public void getWriters() {
        Movie movie = new Movie();
        ArrayList<String> writers = movie.getWriters();
        assertEquals("Writers not null", null, writers);

    }

    @Test
    public void setWritersAmount2() {
        Movie movie = new Movie();
        ArrayList<String> writers = new ArrayList<>();
        writers.add("James");
        writers.add("Laras");
        movie.setWriters(writers);
        int amount = movie.getWriters().size();
        assertEquals("Amount is not 2", 2, amount);
    }

    @Test
    public void getStars() {
    }

    @Test
    public void setStars() {
    }
}