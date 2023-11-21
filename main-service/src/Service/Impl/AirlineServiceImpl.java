package Service.Impl;

import Service.AirlineService;
import model.Airline;
import model.Flight;

import java.util.ArrayList;
import java.util.List;

public class AirlineServiceImpl implements AirlineService {

    private List<Airline> airlineList;

    public AirlineServiceImpl() {
        this.airlineList = new ArrayList<>();
    }

    // CREAT
    @Override
    public String addAirline(Airline airline) {
        if (airlineList.contains(airline)) {
            return "Airline already exists: " + airline.getCompanyName();
        }

        airlineList.add(airline);
        return "Airline added: " + airline.getCompanyName();
    }

    // UPDATE
    @Override
    public String updateAirline(String companyName, Airline updatedAirline) {
        for (Airline airline : airlineList) {
            if (airline.getCompanyName().equals(companyName)) {
                airline.setFlightList(updatedAirline.getFlightList());
                return "Airline updated: " + airline.getCompanyName();
            }
        }
        return "Airline not found: " + companyName;
    }

    // READ
    @Override
    public String queryAirlines() {
        if (airlineList.isEmpty()) {
            return "No airlines available.";
        } else {
            StringBuilder result = new StringBuilder("Airline List:\n");
            for (Airline airline : airlineList) {
                result.append("Company Name: ").append(airline.getCompanyName()).append("\n");
            }
            return result.toString();
        }
    }

    // CREAT FLİGHT
    @Override
    public String addFlight(String companyName, Flight flight) {
        for (Airline airline : airlineList) {
            if (airline.getCompanyName().equals(companyName)) {
                List<Flight> flights = airline.getFlightList();
                flights.add(flight);
                airline.setFlightList(flights);
                return "Flight added to " + airline.getCompanyName() + ": " + flight.getFlightId();
            }
        }
        return "Airline not found: " + companyName;
    }

    @Override
    public String deleteAirline(Long id) {
        for (Airline airline : airlineList) {
            if (airline.getAirlineId().equals(id)) {
                airlineList.remove(airline);
                return "Airline deleted: " + airline.getCompanyName();
            }
        }
        return "Airline not found with ID: " + id;
    }

}
