package model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MusicTest {

    @Test
    public void GenreIsEmpty() {
        Music music = new Music();

        String genre = music.getGenre();

        assertEquals("Data is not empty",null, genre);
    }

    @Test
    public void FormatIsEmpty() {
        Music music = new Music();

        String format = music.getFormat();

        assertEquals("Data is not empty",null, format);
    }

    @Test
    public void setGenre() {
        Music music = new Music();

        String genre = "rock";
        music.setGenre(genre);
        String getgenre = music.getGenre();

        assertEquals("Genre is not "+genre, "rock", getgenre);
    }

    @Test
    public void setFormat() {
        Music music = new Music();

        String format = "mp3";
        music.setFormat(format);
        String getformat = music.getFormat();

        assertEquals("Format is not "+format, "mp3", getformat);
    }

    @Test
    public void getYearisEmpty() {
        Music music = new Music();

        String year;
        year = music.getYear();

        assertEquals("Data is not empty", null, year);

    }

    @Test
    public void setYear() {
        Music music = new Music();

        String year = "1996";
        music.setYear(year);
        String getyear = music.getYear();

        assertEquals("Year is not 1996", "1996", getyear);
    }

    @Test
    public void getArtist() {
        Music music = new Music();

        String artist;
        artist = music.getArtist();

        assertEquals("Artist is not Empty", null, artist);
    }

    @Test
    public void setArtist() {
        Music music = new Music();

        String artist = "rihanna";
        music.setArtist(artist);
        String getartist = music.getArtist();

        assertEquals("Artist not "+artist, "rihanna", getartist);
    }

}