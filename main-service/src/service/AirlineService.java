package service;

import model.Airline;
import model.Flight;

import java.util.ArrayList;
import java.util.List;

public class AirlineService {


    private List<Airline> airlineList;

    public AirlineService() {
        this.airlineList = new ArrayList<>();
    }

    // CREAT
    public String addAirline(Airline airline) {
        if (airlineList.contains(airline)) {
            return "Airline already exists: " + airline.getCompanyName();
        }

        airlineList.add(airline);
        return "Airline added: " + airline.getCompanyName();
    }

    // UPDATE
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
    public String addFlight(String companyName, Flight flight) {
        for (Airline airline : airlineList) {
            if (airline.getCompanyName().equals(companyName)) {
                List<Flight> flights = airline.getFlightList();
                flights.add(flight);
                airline.setFlightList(flights);
                return "Flight added to " + airline.getCompanyName() + ": " + flight.getFlightNo();
            }
        }
        return "Airline not found: " + companyName;
    }


    //I should add other functions too. for example reservation and ticket management
    // this time I'm so busy bacause a have exams


}
