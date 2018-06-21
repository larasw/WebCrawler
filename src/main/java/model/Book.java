package model;

import java.util.ArrayList;

public class Book {
    /**
     * contains genre of the book
     */
    private String genre;
    /**
     * contains file format of the book
     */
    private String format;
    /**
     * Year of the book released
     */
    private String year;
    /**
     * Contains list of authors of the book
     */
    private ArrayList<String> authors;
    /**
     * Publisher of the book
     */
    private String Publisher;
    /**
     * International standard book number that used worldwide to identify the book
     */
    private String ISBN;

    /**
     *
     * @param genre
     * @param format
     * @param year
     * @param authors
     * @param publisher
     * @param ISBN
     */
    public Book(String genre, String format, String year, ArrayList<String> authors, String publisher, String ISBN) {
        this.genre = genre;
        this.format = format;
        this.year = year;
        this.authors = authors;
        Publisher = publisher;
        this.ISBN = ISBN;
    }

    public Book(){

    }

    public void removeAuthor(int i){
        this.authors.remove(i);
    }

    /**
     * This method return the genre of the book
     * @return
     */
    public String getGenre() {
        return genre;
    }

    /**
     * This method set the genre of the book
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * This method get the format for the book
     * @return
     */
    public String getFormat() {
        return format;
    }

    /**
     * This method set the format of the book
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * This method get the year of the book
     * @return
     */
    public String getYear() {
        return year;
    }

    /**
     * This method set the year release for the book
     * @param year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * This method return the list of authors
     * @return
     */
    public ArrayList<String> getAuthors() {
        return authors;
    }

    /**
     * This method set the authors list into the book
     * @param authors
     */
    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    /**
     * This method return publisher from the book
     * @return
     */
    public String getPublisher() {
        return Publisher;
    }

    /**
     * This method set the publisher of the book
     * @param publisher
     */
    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    /**
     * This method return the ISBN number of the book
     * @return
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * This method set the ISBN number for the book
     * @param ISBN
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String AddAuthor(String author){
        authors.add(author);
        return "Successfully add "+author+" as the author";
    }
}
