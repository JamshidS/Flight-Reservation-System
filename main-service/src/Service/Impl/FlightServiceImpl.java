package Service.Impl;

import Service.FlightService;
import model.Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FlightServiceImpl implements FlightService {

    private List<Flight> flights = new ArrayList<>();



    @Override
    public String addFlight(Flight flight) {
        flights.add(flight);
        return "Flight has been created with FlightID:" + flight.getFlightId();

    }

    @Override
    public Flight getFlightById(Long flightId) {
        for (Flight flight : flights) {
            if (flight.getFlightId() == flightId) {
                return flight;
            }

        }
        return null;
    }

    @Override
    public String deleteFlight(Long flightId) {
        String response = "Flight id not found FlightID: " +flightId;
        for (Flight flight : flights) {
            if (flight.getFlightId() == flightId) {
                flights.remove(flight);
                response = "Flight has been deleted successfully";
                break;
            }
        }
        return response;
    }

    @Override
    public String updateFlight(Long flightId, String departureDateTime) {
        String response = "Flight id not found FlightID: " +flightId;
        for(Flight flight : flights) {
            if (flight.getFlightId() == flightId) {
                int index = flights.indexOf(flight);
                flight.setDepartureDateTime(departureDateTime);
                flights.set(index,flight);
                response="Flight has been updated";
            }
        }
        return response;
    }

    @Override
    public List<Flight> getAllFlight() {
       return flights;

    }
}
