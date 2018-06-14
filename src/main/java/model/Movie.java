package model;

import java.util.ArrayList;

public class Movie {
    private String genre;
    private String format;
    private String year;
    private String director;
    private ArrayList<String> Writers;
    private ArrayList<String> Stars;

    public Movie(String genre, String format, String year, String director, ArrayList<String> writers, ArrayList<String> stars) {
        this.genre = genre;
        this.format = format;
        this.year = year;
        this.director = director;
        Writers = writers;
        Stars = stars;
    }

    public Movie() {

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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getWriters() {
        return Writers;
    }

    public void setWriters(ArrayList<String> writers) {
        Writers = writers;
    }

    public ArrayList<String> getStars() {
        return Stars;
    }

    public void setStars(ArrayList<String> stars) {
        Stars = stars;
    }
}
