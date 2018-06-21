package model;

import java.util.ArrayList;

public class Movie {
    /**
     * Variable contain genre of the movie
     */
    private String genre;
    /**
     * Variable contain format of the movie
     */
    private String format;
    /**
     * Variable contain the year release of the movie
     */
    private String year;
    /**
     * Variable contain the director name of the movie
     */
    private String director;
    /**
     * Arraylisst contain the list of Writers for the movie
     */
    private ArrayList<String> Writers;
    /**
     * The list of stars inside the movie
     */
    private ArrayList<String> Stars;

    /**
     *
     * @param genre
     * @param format
     * @param year
     * @param director
     * @param writers
     * @param stars
     */
    public Movie(String genre, String format, String year, String director, ArrayList<String> writers, ArrayList<String> stars) {
        this.genre = genre;
        this.format = format;
        this.year = year;
        this.director = director;
        Writers = writers;
        Stars = stars;
    }

    /**
     * Constructor
     */
    public Movie() {

    }


    /**
     * Method to get the genre for the movie
     * @return
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Method to set the Genre of the movie
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Method to get the format of the movie
     * @return
     */
    public String getFormat() {
        return format;
    }

    /**
     * Method to set the format for the movie
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * Method to get the year of the movie
     * @return
     */
    public String getYear() {
        return year;
    }

    /**
     * Method to set the year release of the movie
     * @param year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * Method to get the director name of the movie
     * @return
     */
    public String getDirector() {
        return director;
    }

    /**
     * Method to set the director name to the movie
     * @param director
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Method to get the list of the Writers for the movie
     * @return
     */
    public ArrayList<String> getWriters() {
        return Writers;
    }

    /**
     * Method to set the writers list for the movie
     * @param writers
     */
    public void setWriters(ArrayList<String> writers) {
        Writers = writers;
    }

    /**
     * Method to get the stars list inside the movie
     * @return
     */
    public ArrayList<String> getStars() {
        return Stars;
    }

    /**
     * Method to set the stars names inside the movie
     * @param stars
     */
    public void setStars(ArrayList<String> stars) {
        Stars = stars;
    }
    public String addWriter(String writer){
        Writers.add(writer);
        return "Successfully add "+writer+" as the writer";
    }
    public String addStar(String star){
        Stars.add(star);
        return "Successfully add "+star+" as the star";
    }

    public String removeStar(int i){
        Stars.remove(i);
        return "Successfully remove "+i+"th Star from the star";
    }
}
