package week1assignments;

public class BookTicketRunner {
	public static void main(String[] args) {

		BookTicket idrToDel = new BookTicket("Indore", "Delhi", "21/12/2021");
		BookTicket delToGoa = new BookTicket("Delhi", "Goa", "22/12/2021");
		BookTicket GoaToDel = new BookTicket("Goa", "Delhi", "28/12/2021");
		System.out.println("Total Flights Booked: " + BookTicket.bookingCounter);
	}

}
