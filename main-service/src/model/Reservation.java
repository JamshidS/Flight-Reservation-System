package model;

public class Reservation {
    private long reservatiınId;
    private long flightNumber;
    private long payment;
    private Pasanger pasanger;

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

    public Pasanger getPasanger() {
        return pasanger;
    }

    public void setPasanger(Pasanger pasanger) {
        this.pasanger = pasanger;
    }

    public Reservation(long reservatiınId, long flightNumber, long payment, Pasanger pasanger) {
        this.reservatiınId = reservatiınId;
        this.flightNumber = flightNumber;
        this.payment = payment;
        this.pasanger = pasanger;
    }

    public Reservation() {

    }
}
