package model;

public class Music {
    /**
     * Variable to keep genre of the music
     */
    private String genre;
    /**
     * Variable to keep format of the music
     */
    private String format;
    /**
     * Variable to keep year of the music released
     */
    private String year;
    /**
     * Variable to keep the music artist.
     */
    private String Artist;

    /**
     *
     * @param genre
     * @param format
     * @param year
     * @param artist
     */
    public Music(String genre, String format, String year, String artist) {
        this.genre = genre;
        this.format = format;
        this.year = year;
        Artist = artist;
    }

    /**
     * Constructor
     */
    public Music(){

    }

    /**
     * Method to get the Genre of the music
     * @return
     */
    public String getGenre() {
        return genre;
    }
    public String setFormatWithReturn(String format){
        this.format = format;
        String formatfinal = format+" file";
        return "Add "+formatfinal+" done!";
    }

    /**
     * Method to set the genre of the music
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Method to get the format of the Music
     * @return
     */
    public String getFormat() {
        return format;
    }

    /**
     * Method to set the format of the music
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * Method to get the year of the music
     * @return
     */
    public String getYear() {
        return year;
    }

    /**
     * Method to set the year released of the music
     * @param year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * Method to get the artist name of the music
     * @return
     */
    public String getArtist() {
        return Artist;
    }

    /**
     * Method to set the artist name of the music
     * @param artist
     */
    public void setArtist(String artist) {
        Artist = artist;
    }
}
