package models;

import java.io.Serializable;
import java.time.LocalDate;

public class Album implements Serializable {
    private long id;
    private String artist;
    private String song;
    private double sales;
    private int release_date;
    private String genre;
    public Album(){};

    public Album(long id, String artist, String song, double sales, int release_date, String genre) {
        this.id = id;
        this.artist = artist;
        this.song = song;
        this.sales = sales;
        this.release_date = release_date;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
