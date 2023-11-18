package model;

import java.util.List;

public class Airline {
    private String companyName;
    private List<Flight> flightList;

    public Airline() {
    }

    public Airline(String companyName, List<Flight> flightList) {
        this.companyName = companyName;
        this.flightList = flightList;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }
}
