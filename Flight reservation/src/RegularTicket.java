public class RegularTicket extends Ticket {
    private String specialService;

    public RegularTicket(String pnr, String from, String to, String depatureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, Flight flight, Passenger passenger, String specialService) {
        super(pnr, from, to, depatureDateTime, arrivalDateTime, seatNo, price, cancelled, flight, passenger);
        this.specialService = specialService;
    }

    public String getSpecialService() {

        return specialService;
    }

    public void setSpecialService(String specialService) {

        this.specialService = specialService;
    }
}


