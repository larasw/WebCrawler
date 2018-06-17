package model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MovieTest {

    /**
     * Method to test the constructor method from Movie class
     */
    @Test
    public void getdatafromconstructor(){
        ArrayList<String> stars = new ArrayList<>();
        stars.add("Jeniffer");
        stars.add("Jim Carey");
        ArrayList<String> writers = new ArrayList<>();
        writers.add("Bob Burton");
        writers.add("Yogesh");
        writers.add("Hela");
        String genre = "comedy";
        String format = "mkv";
        String year = "1996";
        String director = "Adam Driver";
        Movie movie = new Movie(genre, format, year, director, writers, stars);
        int amountstars = movie.getStars().size();
        int amountwriters = movie.getWriters().size();
        String takegenre = movie.getGenre();
        String takeformat = movie.getFormat();
        String takeyear = movie.getYear();
        String takedirector = movie.getDirector();
        assertEquals("Amount starts not 2", 2, amountstars);
        assertEquals("Amount writers not 3", 3, amountwriters);
        assertEquals("Genre not commedy", "comedy", takegenre);
        assertEquals("Format not MKV", "mkv", takeformat);
        assertEquals("Year is not 1996", "1996", takeyear);
        assertEquals("Director is not adam driver", "Adam Driver", takedirector);
    }

    /**
     * Test to get the genre from the movie while its empty
     */
    @Test
    public void getGenreShouldEmpty() {
        Movie movie = new Movie();

        String genre = movie.getGenre();

        assertEquals("Genre not empty", null, genre);
    }

    /**
     * Test to set the genre to the movie
     */
    @Test
    public void setGenre() {
        Movie movie = new Movie();
        String setgrenre = "Horror";
        movie.setGenre(setgrenre);
        String genre = movie.getGenre();
        assertEquals("Genre is not "+setgrenre, "Horror", genre);
    }

    /**
     * Test to get the format of the movie while its empty
     */
    @Test
    public void getFormatShouldEmpty() {
        Movie movie = new Movie();
        String format = movie.getFormat();
        assertEquals("Format is not empty", null, format);
    }

    /**
     * test to set the movie format
     */
    @Test
    public void setFormat() {
        Movie movie = new Movie();
        String setformat = "MKV";
        movie.setFormat(setformat);
        String format = movie.getFormat();
        assertEquals("Format is not "+setformat, "MKV", format);
    }

    /**
     * Test to get the year while its empty
     */
    @Test
    public void getYearNotEmpty() {
        Movie movie = new Movie();
        String year = movie.getYear();
        assertEquals("Year is not empty", null, year);
    }

    /**
     * Test to set the year to the movie
     */
    @Test
    public void setYear() {
        Movie movie = new Movie();
        String setYear = "2016";
        movie.setYear(setYear);
        String year = movie.getYear();
        assertEquals("Year is not "+setYear, "2016", year);
    }

    /**
     * Test to get the director name while its empty
     */
    @Test
    public void getDirectorNotZero() {
        Movie movie = new Movie();
        String director = movie.getDirector();
        assertEquals("Director is not empty", null, director);
    }

    /**
     * Test to set the director name to the movie
     */
    @Test
    public void setDirector() {
        Movie movie = new Movie();
        String setDirector = "Stephen Spielberg";
        movie.setDirector(setDirector);
        String director = movie.getDirector();
        assertEquals("Director is not "+setDirector, "Stephen Spielberg", director);
    }

    /**
     * Test to get the writers list while its null
     */
    @Test
    public void getWriters() {
        Movie movie = new Movie();
        ArrayList<String> writers = movie.getWriters();
        assertEquals("Writers not null", null, writers);

    }

    /**
     * Test to set the writers and count the amount
     */
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

    /**
     * Test to get the stars list while its empty
     */
    @Test
    public void getStarsShouldEmpty() {
        Movie movie = new Movie();
        ArrayList<String> stars = new ArrayList<>();

        stars = movie.getStars();
        assertEquals("Stars is not empty", null, stars);
    }

    /**
     * Test to set the stars list and take the last entry
     */
    @Test
    public void setStarsTakeLast() {
        Movie movie = new Movie();
        ArrayList<String> stars = new ArrayList<>();
        stars.add("The Rock");
        stars.add("Daniel Radclife");
        movie.setStars(stars);
        String laststar = movie.getStars().get(movie.getStars().size()-1);
        assertEquals("Last star is not Daniel Radclife", "Daniel Radclife", laststar);
    }
}