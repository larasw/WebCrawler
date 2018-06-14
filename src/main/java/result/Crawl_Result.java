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
    private ArrayList<Music> musics;

    public Crawl_Result() {
        books = new ArrayList<>();
        movies = new ArrayList<>();
        musics = new ArrayList<>();
    }

    public void AddBook(Book book){
        books.add(book);
    }

    public void AddMovie(Movie movie){
        movies.add(movie);
    }

    public void AddMusic(Music music){
        musics.add(music);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public ArrayList<Music> getMusic() {
        return musics;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        if(id != 0){
            Id = id;
        }
    }
}
