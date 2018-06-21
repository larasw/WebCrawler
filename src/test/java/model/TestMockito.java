package model;

public class TestMockito {

    Music music;
    Movie movie;

    public void setMusic(Music music){
        this.music = music;
    }
    public String setMusicFormat(String format){
        String result;
        result = this.music.setFormatWithReturn(format);
        return result;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }

    public String addMovieStar(String star){
        this.movie.addStar(star);
        return "Successfully add "+star+" as the star";
    }
    public String removeMovieStar(int i){
        this.movie.removeStar(i);
        return "Successfully remove "+i+"th Star from the star";
    }
}
