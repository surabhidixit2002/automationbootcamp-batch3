package week1assignments;

public class SearchHotel {
	String hotelName;// *
	String startDate;// (format: dd/mm/yyyy) *
	int noOfNights;// *
	int totalAdult;// *
	int totalChildren;// *
	String roomType;
	String withBreakfast;

	public SearchHotel(String hotelName, String startDate, int noOfNights, int totalAdult, int totalChildren) {
		this.hotelName = hotelName;
		this.startDate = startDate;
		this.noOfNights = noOfNights;
		this.totalAdult = totalAdult;
		this.totalChildren = totalChildren;

	}

	public void print(String roomType, String withBreakfast) {
		System.out.println("Hotel Name: " + hotelName);
		System.out.println("Start Date: " + startDate);
		System.out.println(" Number of Nights : " + noOfNights);
		System.out.println("Total Adults: " + totalAdult);
		System.out.println("Total Children: " + totalChildren);
		System.out.println("Room Type: " + roomType);
		System.out.println("With Breakfast? " + withBreakfast);
		System.out.println("---------------------------------------");

	}

}
