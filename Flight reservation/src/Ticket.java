public abstract class Ticket {
    private String pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private float price;
    private boolean cancelled;
    private Flight flight;
    private Passenger passenger;

    public Ticket(String pnr, String from, String to, String depatureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, Flight flight, Passenger passenger) {
    }

    public String getPnr(){

        return pnr;
    }
    public void setPnr(String pnr){

        this.pnr=pnr;
    }
    public String getFrom(){

        return from;
    }
    public void setFrom(String from){

        this.from=from;
    }
    public String getTo(){

        return to;
    }
    public void setTo(String to){

        this.to=to;
    }
    public String getDepartureDateTime(){

        return departureDateTime;
    }
    public void setDepartureDateTime(String departureDateTime){

        this.departureDateTime=departureDateTime;
    }
    public String getArrivalDateTime(){

        return arrivalDateTime;
    }
    public void setArrivalDateTime(String arrivalDateTime){

        this.arrivalDateTime=arrivalDateTime;
    }
    public String getSeatNo(){
        return seatNo;
    }
    public void setSeatNo(String seatNo){
        this.seatNo = seatNo;
    }
    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price=price;
    }
    public boolean isCancelled(){
        return cancelled;
    }
    public void setCancelled(boolean cancelled){
        this.cancelled=cancelled;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public String checkStatus(){
        return cancelled ? "Cancelled" : "Confirmed";
    }
    public void cancel(){
        cancelled = true;
    }
}
