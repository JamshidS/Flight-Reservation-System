import java.util.ArrayList;
import java.util.List;

public class PassengerService {
    private List<Passenger> passengers;

    public PassengerService() {
        passengers = new ArrayList<>();
    }

    // Yolcu eklemek için
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    // Belirli bir yolcuyu bulmak için
    public Passenger findPassengerByReservationNumber(String reservationNumber) {
        for (Passenger passenger : passengers) {
            if (passenger.getReservationNumber().equals(reservationNumber)) {
                return passenger;
            }
        }
        return null;
    }

    // Belirli bir yolcuyu silmek için
    public void deletePassenger(String reservationNumber) {
        Passenger passengerToDelete = findPassengerByReservationNumber(reservationNumber);
        if (passengerToDelete != null) {
            passengers.remove(passengerToDelete);
        }
    }

    // Yolcuları listelemek için
    public List<Passenger> listPassengers() {
        return passengers;
    }
}

