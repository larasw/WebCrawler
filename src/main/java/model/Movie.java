package model;

public class Movie {
    private String genre;
    private String format;
    private String year;
    private String director;
    private String[] Writers;
    private String[] Stars;

    public Movie(String genre, String format, String year, String director, String[] writers, String[] stars) {
        this.genre = genre;
        this.format = format;
        this.year = year;
        this.director = director;
        Writers = writers;
        Stars = stars;
    }


}
