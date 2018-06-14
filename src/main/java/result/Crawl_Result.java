package result;

import model.Book;
import model.Movie;
import model.Music;

import java.util.ArrayList;

public class Crawl_Result {
    private int Id, numberOfPages;
    private String timeElapsed;
    private ArrayList<Book> books;
    private ArrayList<Movie> movies;
    private ArrayList<Music> music;

    public Crawl_Result() {
        books = new ArrayList<>();
    }

    public void AddBook(Book book){

    }

    public void AddMovie(Movie movie){

    }

    public void AddMusic(Music music){

    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
