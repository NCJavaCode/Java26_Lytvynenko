package ua.edu.op.nkpk.java.model;

/**
 * Клас Ticket імітує сутність "Квиток" на сеанс у кінотеатрі.
 * Містить інформацію про фільм, місце та ціну квитка.
 *
 * @author Yelyzaveta Lytvynenko
 * @version 1.0
 */
public class Ticket {
    private Movie movie;
    private int seat;
    private double price;

    /**
     * Конструктор за замовчуванням для створення квитка.
     */
    public Ticket() {
    }

    /**
     * Створює новий квиток із заданими параметрами фільму, місця та ціни.
     *
     * @param movie фільм, на який купується квиток
     * @param seat номер місця
     * @param price вартість квитка
     */
    public Ticket(Movie movie, int seat, double price) {
        this.movie = movie;
        this.seat = seat;
        this.price = price;
    }

    /**
     * Повертає фільм.
     *
     * @return об'єкт фільму
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * Встановлює фільм.
     *
     * @param movie об'єкт фільму
     */
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    /**
     * Повертає номер місця.
     *
     * @return номер місця
     */
    public int getSeat() {
        return seat;
    }

    /**
     * Встановлює номер місця.
     *
     * @param seat номер місця
     */
    public void setSeat(int seat) {
        this.seat = seat;
    }

    /**
     * Повертає вартість квитка.
     *
     * @return вартість квитка
     */
    public double getPrice() {
        return price;
    }

    /**
     * Встановлює вартість квитка.
     *
     * @param price вартість квитка
     */
    public void setPrice(double price) {
        this.price = price;
    }
}