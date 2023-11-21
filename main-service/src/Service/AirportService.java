package Service;

import model.AirPort;

import java.util.List;

public interface AirportService {
    String createAirport(AirPort airport);
    List<AirPort> getAirport();
    String getAirport(Long id);
    String updateAirport(String companyName, AirPort updatedAirport) ;
    String deleteAirport(Long id);
}
