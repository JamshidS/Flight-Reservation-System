package Service;

import model.Airline;
import model.Flight;

public interface AirlineService {
    String addAirline  (Airline airline);
    String updateAirline(String companyName, Airline updatedAirline);
    String queryAirlines();
    String addFlight(String companyName, Flight flight) ;
    String deleteAirline(Long id);
}
