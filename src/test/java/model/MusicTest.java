package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class MusicTest {
    @Test
    public void ArtistIsEmpty() {
        Music music = new Music();

        String name = music.getArtist();

        assertEquals("Data is not empty",null, name);
    }

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
    }

    @Test
    public void getArtist() {
    }

    @Test
    public void setArtist() {
    }
}