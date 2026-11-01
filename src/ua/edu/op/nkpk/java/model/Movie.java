package ua.edu.op.nkpk.java.model;

public class Movie {
    private String title;
    private int durationMinutes;
    private String genre;

    public Movie() {
    }

    public Movie(String title, int durationMinutes, String genre) {
        this.title = title;
        this.durationMinutes = durationMinutes;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}