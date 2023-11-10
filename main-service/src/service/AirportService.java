package service;

import model.AirPort;

import java.util.ArrayList;
import java.util.List;

public class AirportService {   //CRUD OPERATIONS
    private ArrayList<AirPort> airportList;

    public AirportService() {
        this.airportList = new ArrayList<>();
    }

    // CREATE
    public String addAirport(AirPort airport) {
        if (airportList.contains(airport)) {
            return "Airport already exists: " + airport.getCompanyName();
        }

        airportList.add(airport);
        return "Airport added: " + airport.getCompanyName();
    }

    // READ
    public String displayAirports() {
        if (airportList.isEmpty()) {
            return "No airports available.";
        } else {
            StringBuilder result = new StringBuilder("Airport List:\n");
            for (AirPort airport : airportList) {
                result.append("Company Name: ").append(airport.getCompanyName())
                        .append(", Country Name: ").append(airport.getCountryName())
                        .append(", City Name: ").append(airport.getCityName()).append("\n");
            }
            return result.toString();
        }
    }

    // UPDATE
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
        return "Airport not found: " + companyName;
    }

    // DELETE
    public String deleteAirport(String companyName) {
        for (AirPort airport : airportList) {
            if (airport.getCompanyName().equals(companyName)) {
                airportList.remove(airport);
                return "Airport deleted: " + airport.getCompanyName();
            }
        }
        return "Airport not found: " + companyName;
    }
}
