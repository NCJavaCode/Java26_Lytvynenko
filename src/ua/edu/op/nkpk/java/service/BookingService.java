package ua.edu.op.nkpk.java.service;

import ua.edu.op.nkpk.java.model.Movie;
import ua.edu.op.nkpk.java.model.Ticket;

public class BookingService {

    public Ticket bookTicket(Movie movie, int seatNumber, double price) {
        return new Ticket(movie, seatNumber, price);
    }

    public boolean cancelBooking(Ticket ticket) {
        return ticket != null;
    }
}