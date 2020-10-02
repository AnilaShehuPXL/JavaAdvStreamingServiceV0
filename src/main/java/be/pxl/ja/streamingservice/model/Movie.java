package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable{
    public static final int LONG_PLAYING_TIME = 2 * 60 + 15;

    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;


    //constructor
    public Movie(String title, Rating mtr) {
        super(title, mtr);
    }

    //getters en setters
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) { this.genre = genre;    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void Play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void Pause() {
        System.out.println("Paused " + this);
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    //methods
    @Override
    public String toString() {
        String returnString = getTitle();
        if (releaseDate != null){
            returnString += " (" + releaseDate.getYear() + ")";
        }
        return returnString;
    }

    public boolean isLongPlayingTime(){
        return duration >= LONG_PLAYING_TIME;
    }
}
