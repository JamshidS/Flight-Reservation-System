public class Ticket {
    private long ticketNo;
    private long price;
    private String reservation;
    // String will change to Reservation after the Reservation class merged. (also its getter&setter methods)

    public Ticket() {
    }

    public Ticket(long ticketNo, long price, String reservation) {
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

    public String getReservation() {
        return reservation;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }
}
