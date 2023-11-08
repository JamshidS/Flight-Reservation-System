package model;

public class Passenger {
    private String passengerName;
    private int passengerAge;
    private String gender;
    private String reservationNumber;
    private String seatNumber;
    private String flightNumber;
    private String passportNumber;

    public Passenger(String passengerName, int passengerAge, String gender, String reservationNumber, String seatNumber, String flightNumber, String passportNumber) {
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.gender = gender;
        this.reservationNumber = reservationNumber;
        this.seatNumber = seatNumber;
        this.flightNumber = flightNumber;
        this.passportNumber = passportNumber;
    }

    // Getter ve setter metotları
    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}