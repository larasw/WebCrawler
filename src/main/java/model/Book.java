package model;

public class Book {
    private String genre;
    private String format;
    private String year;
    private String[] authors;
    private String Publisher;
    private String ISBN;

    public Book(String genre, String format, String year, String[] authors, String publisher, String ISBN) {
        this.genre = genre;
        this.format = format;
        this.year = year;
        this.authors = authors;
        Publisher = publisher;
        this.ISBN = ISBN;
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

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
