public class Main {

    public static void main(String[] args) {


        Ticket regularTicket = new RegularTicket("5638274687", "Rajahmundry",
                "Hyderabad", "DepartureDateTime", "ArrivalDateTime",
                "3D", 10000, false, null, null, "lunch");

        Ticket touristTicket = new TouristTicket("6387687334", "India", "USA",
                "DepartureDateTime", "ArrivalDateTIme",
                "4F", 22000, false, null, null,
                "NewYork Hotel", new String[]{""});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }
    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

}
