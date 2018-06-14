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
    public void setGenre() {
        Music music = new Music();

        String genre = "Rock";
        music.setGenre(genre);

        
    }

    @Test
    public void getFormat() {
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
    public void getArtist() {
    }

    @Test
    public void setArtist() {
    }
}