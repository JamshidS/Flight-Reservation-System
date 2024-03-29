package model;

import java.util.List;
import java.util.Objects;

public class Promotion {
    private long flightNumber;
    private int discountRate;
    private List<Object> users;

    public long getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(long flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public List<Object> getUsers() {
        return users;
    }

    public void setUsers(List<Object> users) {
        this.users = users;
    }
}
