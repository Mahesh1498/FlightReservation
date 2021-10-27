package com.company;

public class Main {

    public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket("12345","Malaysia","Dubai","DepatureDateTime","ArrivalDateTime","5D","6000","false","null","null","lunch");
        Ticket touristTicket = new TouristTicket("12312","India","Europe","DepatureDateTime","ArrivalDateTime","8F","10000","false","null","null",new String[]{""},"Hotel");


        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);

    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

}
