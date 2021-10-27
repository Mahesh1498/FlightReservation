public class TouristTicket extends Ticket{
    private String touristLocation;
    private String hotelAddress;


    public TouristTicket(String pnr, String from, String to, String depatureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, Flight flight, Passenger passenger,String touristlocation,String hotelAddress) {
        super(pnr, from, to, depatureDateTime, arrivalDateTime, seatNo, price, cancelled, flight, passenger);
        this.touristLocation=touristlocation;
        this.hotelAddress=hotelAddress;
    }
    public String getTouristLocation(){
        return touristLocation;
    }

    public void setTouristLocation(String touristLocation) {
        this.touristLocation = touristLocation;
    }
    public String getHotelAddress(){
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
}
