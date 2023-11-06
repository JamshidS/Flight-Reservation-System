import java.util.List;
import java.util.Objects;

public class Promotion {
    private long flightNumber;
    private int discountRate;
    private List<Object> Users;

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
        return Users;
    }

    public void setUsers(List<Object> users) {
        Users = users;
    }
}
