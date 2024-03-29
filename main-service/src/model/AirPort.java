package model;

import java.util.List;

public class AirPort {

    private Long id;
    private String companyName;
    private String countryName;
    private String cityName;
    private String capacity;
    private String communicationInformation;
    private List<String> flights;  //String should be Flight class

    public AirPort(String companyName, String countryName,
                   String cityName, String capacity,
                   String communicationInformation, List<String> flights) {
        this.companyName = companyName;
        this.countryName = countryName;
        this.cityName = cityName;
        this.capacity = capacity;
        this.communicationInformation = communicationInformation;
        this.flights = flights;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getCommunicationInformation() {
        return communicationInformation;
    }

    public void setCommunicationInformation(String communicationInformation) {
        this.communicationInformation = communicationInformation;
    }

    public List<String> getFlights() {
        return flights;
    }

    public void setFlights(List<String> flights) {
        this.flights = flights;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
