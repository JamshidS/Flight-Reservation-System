package Service.Impl;

import Service.AirportService;
import model.AirPort;
import model.Airline;

import java.util.ArrayList;
import java.util.List;

public class AirportServiceImpl implements AirportService {

    private List<AirPort> airportList;

    public AirportServiceImpl() {
        this.airportList = new ArrayList<>();
    }
    @Override
    public String createAirport(AirPort airport) {
        if (airportList.contains(airport)) {
            return "Airport already exists: " + airport.getCompanyName();
        }

        airportList.add(airport);
        return "Airport created: " + airport.getCompanyName();    }

    @Override
    public List<AirPort> getAirport() {
        return airportList;
    }

    @Override
    public String getAirport(Long id) {
        for (AirPort airport : airportList) {
            if (airport.getId().equals(id)) {
                return "Airport found: " + airport.getCompanyName();
            }
        }
        return "Airport not found with ID: " + id;    }

    @Override
    public String updateAirport(String companyName, AirPort updatedAirport) {
        for (AirPort airport : airportList) {
            if (airport.getCompanyName().equals(companyName)) {
                airport.setCountryName(updatedAirport.getCountryName());
                airport.setCityName(updatedAirport.getCityName());
                airport.setCapacity(updatedAirport.getCapacity());
                airport.setCommunicationInformation(updatedAirport.getCommunicationInformation());
                airport.setFlights(updatedAirport.getFlights());
                return "Airport updated: " + airport.getCompanyName();
            }
        }
        return "Airport not found: " + companyName; }

    @Override
    public String deleteAirport(Long id) {
        for (AirPort airport : airportList) {
            if (airport.getId().equals(id)) {
                airportList.remove(airport);
                return "Airport deleted: " + airport.getCompanyName();
            }
        }
        return "Airport not found with ID: " + id;    }
}
