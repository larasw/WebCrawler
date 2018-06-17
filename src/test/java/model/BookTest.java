package model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BookTest {

    /**
     * This is test for Constructor in Book Class
     */
    @Test
    public void constructorBookTest(){
        // arrange
        String genre = "Fairytale";
        String format = "pdf";
        String year = "2016";
        String publisher = "Airlangga";
        String ISBN = "978-3-16-148410-0";

        ArrayList<String> authors = new ArrayList<>();
        Book book = new Book(genre, format, year, authors, publisher, ISBN);

        // act
        authors.add("Donald Trumps");
        authors.add("Jane Jennweda");
        int totalAuthors = authors.size();

        // Assert
        assertEquals("Genre is not fairytale", genre, book.getGenre());
        assertEquals("format is not pdf", format, book.getFormat());
        assertEquals("year is not 2016", year, book.getYear());
        assertEquals("Amount of authors is not 2", totalAuthors, book.getAuthors().size());
        assertEquals("Publisher is not Airlangga", publisher, book.getPublisher());
    }

    /**
     * This is test for get genre when its null
     */
    @Test
    public void getGenre() {
        Book book = new Book();

        String genre = book.getGenre();

        assertEquals("Genre not empty", null,genre);
    }

    /**
     * Test to set the genre
     */
    @Test
    public void setGenre() {
        Book book = new Book();

        String setGenre = "Love";
        book.setGenre(setGenre);
        String genre = book.getGenre();

        assertEquals("Genre is not Love", setGenre, genre);
    }

    /**
     * Test to get the Format when its null
     */
    @Test
    public void getFormat() {
        Book book = new Book();

        String format = book.getFormat();

        assertEquals("Format is not empty", null, format);
    }

    /**
     * Test to set the Format
     */
    @Test
    public void setFormat() {
        Book book = new Book();

        String setFormat = "pdf";
        book.setFormat(setFormat);
        String format = book.getFormat();

        assertEquals("Format is not pdf", setFormat, format);
    }

    /**
     * Test to get the year when its null
     */
    @Test
    public void getYear() {
        Book book = new Book();

        String year = book.getYear();

        assertEquals("Year is not empty", null, year);
    }

    /**
     * Test to set the year
     */
    @Test
    public void setYear() {
        Book book = new Book();

        String year = "1996";
        book.setYear(year);
        String getyear = book.getYear();

        assertEquals("Year is not 1996", year, getyear);
    }

    /**
     * Test to get the authors when null
     */
    @Test
    public void getAuthors() {
        Book book = new Book();

        ArrayList<String> author = book.getAuthors();

        assertEquals("Authot is not Empty", null, author);
    }

    /**
     * Test to set the authors
     */
    @Test
    public void setAuthors() {
        Book book = new Book();

        ArrayList<String> authors = new ArrayList<>();
        authors.add("James Burton");
        book.setAuthors(authors);

        assertEquals("Amount of authors not 1", 1, book.getAuthors().size());
    }

    /**
     * Test to get the publisher when null
     */
    @Test
    public void getPublisher() {
        Book book = new Book();

        String publisher = book.getPublisher();

        assertEquals("publisher not empty", null, publisher);
    }

    /**
     * Test to set the publisher
     */
    @Test
    public void setPublisher() {
        Book book = new Book();

        String setpublisher = "Airlangga";
        book.setPublisher(setpublisher);
        String publisher = book.getPublisher();
        assertEquals("publsher is not Airlangga", setpublisher, publisher);
    }

    /**
     * Test to get the publisher when null
     */
    @Test
    public void getISBN() {
        Book book = new Book();

        String isbn = book.getISBN();

        assertEquals("ISBN is not empty", null, isbn);
    }

    /**
     * Test to set the ISBN for the book
     */
    @Test
    public void setISBN() {
        Book book = new Book();

        String setISBN = "12121212";
        book.setISBN(setISBN);
        String ISBN = book.getISBN();

        assertEquals("ISBn is not 12121212", setISBN, ISBN);
        //assertEquals();
    }
}