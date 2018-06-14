package model;

public class Music {
    private String genre;
    private String format;
    private String year;
    private String Artist;

    public Music(String genre, String format, String year, String artist) {
        this.genre = genre;
        this.format = format;
        this.year = year;
        Artist = artist;
    }

    public Music(){

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }
}
