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
               return "Passenger found: " + passenger.toString();
            }
        }
        return "Passenger not found for reservation number: " + reservationNumber;
    }

    // Belirli bir yolcuyu silmek için
    public void deletePassenger(String reservationNumber) {
        Passenger passengerToDelete = findPassengerByReservationNumber(reservationNumber);
        if (passengerToDelete != null) {
      return "Passenger with reservation number " + reservationNumber + " successfully deleted.";
    } else {
        return "Passenger with reservation number " + reservationNumber + " not found. Deletion failed.";
    }
}
    // Yolcuları listelemek için
    public List<Passenger> listPassengers() {
        return passengers;
    }
}

