package result;

import exception.InputDataNotValidException;
import model.Book;
import model.Movie;
import model.Music;

import java.util.ArrayList;

public class Crawl_Result {
    /**
     * Result's ID
     */
    private int Id;

    /**
     * Total number of pages that is found through crawl process
     */
    private int numberOfPages;

    /**
     * Time elapsed to finish crawl process
     */
    private long timeElapsed;

    /**
     * List of books object that found through crawl process
     */
    private ArrayList<Book> books;

    /**
     * List of movies object that found through crawl process
     */
    private ArrayList<Movie> movies;

    /**
     * List of musics object that found through crawl process
     */
    private ArrayList<Music> musics;

    /**
     * Constructor of this class
     * Without any @param
     * instantiate variable that use ArrayList
     * variables: books, movies, and musics
     */
    public Crawl_Result() {
        books = new ArrayList<>();
        movies = new ArrayList<>();
        musics = new ArrayList<>();
    }

    /**
     * Add book to books ArrayList
     * @param book Book Object that will be added to books
     */
    public void AddBook(Book book){
        books.add(book);
    }

    /**
     * Add movie to movies ArrayList
     * @param movie Movie object that will be added to movies
     */
    public void AddMovie(Movie movie){
        movies.add(movie);
    }

    /**
     * Add music to musics ArrayList
     * @param music Music object that will be added to musics
     */
    public void AddMusic(Music music){
        musics.add(music);
    }

    /**
     * Get the content of books ArrayList
     * @return list of books
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * Get the content of movies ArrayList
     * @return list of movies
     */
    public ArrayList<Movie> getMovies() {
        return movies;
    }

    /**
     * Get the content of musics ArrayList
     * @return list of musics
     */
    public ArrayList<Music> getMusic() {
        return musics;
    }

    /**
     * Get current Result's ID
     * @return id
     */
    public int getId() {
        return Id;
    }

    /**
     * Set the Result's ID
     * ID cannot be 0 or below
     * @param id int that will be the ID
     */
    public void setId(int id) throws InputDataNotValidException {
        if(id > 0)
            Id = id;
        else
            throw new InputDataNotValidException();
    }

    /**
     * Get the total of pages that is found through the crawl process
     * Can be 0 if nothing is found
     * @return number of pages
     */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Set the total of pages that is found through the crawl process
     * Can be 0 if nothing is found
     * @param numberOfPages int total of pages
     */
    public void setNumberOfPages(int numberOfPages) throws InputDataNotValidException {
        if(numberOfPages >= 0)
            this.numberOfPages = numberOfPages;
        else
            throw new InputDataNotValidException("Number of pages cannot be below 0");
    }

    /**
     * Get the time elapsed to finish the crawl process
     * @return long time elapsed contain decimal for seconds
     */
    public long getTimeElapsed() {
        return timeElapsed;
    }

    /**
     * Set the time elapsed to finish the crawl process
     * Cannot be 0, if 0 means access failed or denied
     * @param timeElapsed contain decimal for seconds
     */
    public void setTimeElapsed(long timeElapsed) throws InputDataNotValidException {
        if(timeElapsed > 0)
            this.timeElapsed = timeElapsed;
        else{
            throw new InputDataNotValidException("Time elapsed must be more than 0", new Throwable());
        }
    }

    /**
     * Adding new author to book based on the book's index
     * @param index
     * @param author
     * @return
     */
    public String AddAuthorBook(int index, String author){
        return books.get(index).AddAuthor(author);
    }
    public String AddWriterMovie(int index, String writer){
        return movies.get(index).addWriter(writer);
    }

    public String AddStartMoview(int index, String star){
        return movies.get(index).addStar(star);
    }
}
