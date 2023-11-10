package model;

public class Reservation {
    private long reservatiınId;
    private long flightNumber;
    private long payment;
    private Passenger passanger;

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

    public Passenger getPassanger() {
        return passanger;
    }

    public void setPassanger(Passenger passanger) {
        this.passanger = passanger;
    }

    public Reservation(long reservatiınId, long flightNumber, long payment, Passenger pasanger) {
        this.reservatiınId = reservatiınId;
        this.flightNumber = flightNumber;
        this.payment = payment;
        this.passanger = pasanger;
    }

    public Reservation() {

    }
}
