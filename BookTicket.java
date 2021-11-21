package week1assignments;

public class BookTicket {

	static int bookingCounter;
	String flyingFrom;
	String flyingTo;
	String startDate;

	public BookTicket(String flyingFrom, String flyingTo, String startDate) {
		System.out.println(flyingFrom);
		System.out.println(flyingTo);
		System.out.println(startDate);
		System.out.println("----------------------------");
		bookingCounter++;
	}
}
