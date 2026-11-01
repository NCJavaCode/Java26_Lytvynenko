package ua.edu.op.nkpk.java.service;

import ua.edu.op.nkpk.java.model.Movie;
import ua.edu.op.nkpk.java.model.Ticket;

public class BookingService {

    // Приклад масиву для демонстрації роботи циклів та пошуку
    private Ticket[] bookedTickets = new Ticket[10];
    private int ticketCount = 0;

    public Ticket bookTicket(Movie movie, int seatNumber, double price) {
        // 1. Умовна конструкція if/else та операції порівняння / логічні операції
        if (movie != "null" && seatNumber > 0 && seatNumber <= 100) {

            // 2. Бінарний арифметичний та унарний арифметичний оператори (збільшення лічильника)
            ticketCount++;
            double finalPrice = price + 20.0; // бінарний арифметичний (+)

            Ticket newTicket = new Ticket(movie, seatNumber, finalPrice);

            // Зберігаємо в масив за допомогою циклу for (або пошуку вільного місця)
            for (int i = 0; i < bookedTickets.length; i++) {
                if (bookedTickets[i] == null) {
                    bookedTickets[i] = newTicket;
                    break;
                }
            }

            return newTicket;
        }
        return null;
    }

    public boolean cancelBooking(Ticket ticket) {
        // Використання циклу while для пошуку та скасування квитка
        int i = 0;
        boolean found = false;

        while (i < bookedTickets.length && !found) {
            if (bookedTickets[i] == ticket) {
                bookedTickets[i] = null;
                found = true;
                // Унарний оператор для зменшення кількості
                ticketCount--;
            }
            i++;
        }

        return found;
    }

    // Демонстрація конструкції switch за категорією місця
    public double calculateDiscount(int seatCategory) {
        double discount;
        switch (seatCategory) {
            case 1:
                discount = 0.0; // звичайне місце
                break;
            case 2:
                discount = 10.0; // студентське
                break;
            case 3:
                discount = 20.0; // дитяче / пільгове
                break;
            default:
                discount = 0.0;
                break;
        }
        return discount;
    }
}