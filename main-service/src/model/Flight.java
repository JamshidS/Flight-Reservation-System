/** Class Name : Flight
 * @author TARIK
 * Uçuş hakkındaki bilgileri tutmak için oluşturulmuştur.
 */


package model;

public class Flight {

   private Long  flightNo;
   private String departureAirport;
   private String arrivalAirport;
   private String departureDateTime;
   private Long totalSeatCount;
   private Long emptySeat;
   private Long tickedPrice;

    public Long getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(Long flightNo) {
        this.flightNo = flightNo;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public Long getTotalSeatCount() {
        return totalSeatCount;
    }

    public void setTotalSeatCount(Long totalSeatCount) {
        this.totalSeatCount = totalSeatCount;
    }

    public Long getEmptySeat() {
        return emptySeat;
    }

    public void setEmptySeat(Long emptySeat) {
        this.emptySeat = emptySeat;
    }

    public Long getTickedPrice() {
        return tickedPrice;
    }

    public void setTickedPrice(Long tickedPrice) {
        this.tickedPrice = tickedPrice;
    }
}
