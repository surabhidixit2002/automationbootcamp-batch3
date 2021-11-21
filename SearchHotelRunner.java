package week1assignments;

public class SearchHotelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchHotel radissonSearchHotel = new SearchHotel("Radisson", "21/12/2021", 2, 2, 1);
		radissonSearchHotel.print("", "");
		SearchHotel shrretonSearchHotel = new SearchHotel("Shrreton", "21/12/2021", 2, 2, 1);
		shrretonSearchHotel.print("Suite", "Yes");
	}

}
