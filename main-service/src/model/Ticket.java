package model;

public class Ticket {
    private long ticketNo;
    private long price;
    private Reservation reservation;
    private Flight flight;

    public Ticket() {
    }

    public Ticket(long ticketNo, long price, Reservation reservation) {
        this.ticketNo = ticketNo;
        this.price = price;
        this.reservation = reservation;
    }

    public long getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(long ticketNo) {
        this.ticketNo = ticketNo;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
