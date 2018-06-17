package model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MusicTest {

    /**
     * Test to add data use constructor
     */
    @Test
    public void DataAddedThroughConstructor(){
        Music music = new Music("pop", "iTunes", "2018", "bruno mars");
        String genre = music.getGenre();
        String format = music.getFormat();
        String artist = music.getArtist();
        String year = music.getYear();

        assertNotEquals("Genre should not be zero", null, genre);
        assertNotEquals("Format should not be zero", null, format);
        assertNotEquals("Year should not be zero", null, year);
        assertNotEquals("Artist should not be zero", null, artist);
    }

    /**
     * Test get genre when its null
     */
    @Test
    public void GenreIsEmpty() {
        Music music = new Music();

        String genre = music.getGenre();

        assertEquals("Data is not empty",null, genre);
    }

    /**
     * Test get the format when its null
     */
    @Test
    public void FormatIsEmpty() {
        Music music = new Music();

        String format = music.getFormat();

        assertEquals("Data is not empty",null, format);
    }

    /**
     * Test to set the genre value
     */
    @Test
    public void setGenre() {
        Music music = new Music();

        String genre = "rock";
        music.setGenre(genre);
        String getgenre = music.getGenre();

        assertEquals("Genre is not "+genre, "rock", getgenre);
    }

    /**
     * Test to set the value of music format
     */
    @Test
    public void setFormat() {
        Music music = new Music();

        String format = "mp3";
        music.setFormat(format);
        String getformat = music.getFormat();

        assertEquals("Format is not "+format, "mp3", getformat);
    }

    /**
     * Test to get the year when its null
     */
    @Test
    public void getYearisEmpty() {
        Music music = new Music();

        String year;
        year = music.getYear();

        assertEquals("Data is not empty", null, year);

    }

    /**
     * test to set the  year value
     */
    @Test
    public void setYear() {
        Music music = new Music();

        String year = "1996";
        music.setYear(year);
        String getyear = music.getYear();

        assertEquals("Year is not 1996", "1996", getyear);
    }

    /**
     * Test to get the artist name when its null
     */
    @Test
    public void getArtist() {
        Music music = new Music();

        String artist;
        artist = music.getArtist();

        assertEquals("Artist is not Empty", null, artist);
    }

    /**
     * Test to set thea artist name
     */
    @Test
    public void setArtist() {
        Music music = new Music();

        String artist = "rihanna";
        music.setArtist(artist);
        String getartist = music.getArtist();

        assertEquals("Artist not "+artist, "rihanna", getartist);
    }

}