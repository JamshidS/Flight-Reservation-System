package Service;

import model.Flight;

import java.util.List;

public interface FlightService {


    String addFlight  (Flight flight);
    Flight getFlightById (Long flightId);
    String deleteFlight (Long flightId);
    String updateFlight(Long flightId, String departureDateTime);
    List<Flight> getAllFlight();

}
