package ua.edu.op.nkpk.java.model;

/**
 * Клас Movie імітує поведінку сутності "Фільм" у кінотеатрі.
 * Містить інформацію про назву, тривалість та жанр фільму.
 *
 * @author Yelyzaveta Lytvynenko
 * @version 1.0
 */
public class Movie {
    private String title;
    private int durationMinutes;
    private String genre;

    /**
     * Конструктор за замовчуванням для створення порожнього об'єкта фільму.
     */
    public Movie() {
    }

    /**
     * Створення об'єкта Фільм із заданими параметрами.
     *
     * @param title назва фільму
     * @param durationMinutes тривалість фільму у хвилинах
     * @param genre жанр фільму
     */
    public Movie(String title, int durationMinutes, String genre) {
        this.title = title;
        this.durationMinutes = durationMinutes;
        this.genre = genre;
    }

    /**
     * Повертає назву фільму.
     *
     * @return назва фільму
     */
    public String getTitle() {
        return title;
    }

    /**
     * Встановлює нову назву фільму.
     *
     * @param title нова назва фільму
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Повертає тривалість фільму у хвилинах.
     *
     * @return тривалість фільму
     */
    public int getDurationMinutes() {
        return durationMinutes;
    }

    /**
     * Встановлює тривалість фільму у хвилинах.
     *
     * @param durationMinutes тривалість фільму
     */
    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    /**
     * Повертає жанр фільму.
     *
     * @return жанр фільму
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Встановлює жанр фільму.
     *
     * @param genre жанр фільму
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
}