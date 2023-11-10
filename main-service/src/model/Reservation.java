package model;

public class Reservation {
    private long reservatiınId;
    private long flightNumber;
    private long payment;
    private Passenger passenger;

    public long getReservatiınId() {
        return reservatiınId;
    }

    public void setReservatiınId(long reservatiınId) {
        this.reservatiınId = reservatiınId;
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

    public Reservation(long reservatiınId, long flightNumber, long payment, Passenger passenger) {
        this.reservatiınId = reservatiınId;
        this.flightNumber = flightNumber;
        this.payment = payment;
        this.passenger = passenger;
    }

    public Reservation() {

    }
}

