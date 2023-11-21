package model;

public class Reservation {
    private long reservationId;
    private long flightNumber;
    private long payment;
    private Passenger passenger;

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public long getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(long flightNumber) {
        this.flightNumber = flightNumber;
    }

    public long getPayment() {
        return payment;
    }

    public void setPayment(long payment) {
        this.payment = payment;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Reservation(long reservationId, long flightNumber, long payment, Passenger passenger) {
        this.reservationId = reservationId;
        this.flightNumber = flightNumber;
        this.payment = payment;
        this.passenger = passenger;
    }

    public Reservation() {

    }


}
