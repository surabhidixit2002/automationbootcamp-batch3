package week1assignments;

public class PersonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Object 1
		Person surabhiPerson = new Person();

		surabhiPerson.name = "Surabhi";
		surabhiPerson.gender = "Female";
		surabhiPerson.email = "surabhi@gmail.com";
		surabhiPerson.age = 30;

		surabhiPerson.print();

		// Object 2
		Person satyarthPerson = new Person();

		satyarthPerson.name = "Satyarth";
		satyarthPerson.gender = "Male";
		satyarthPerson.email = "satyarth@gmail.com";
		satyarthPerson.age = 6;

		satyarthPerson.print();

		// Object 3
		Person rcbPerson = new Person();

		rcbPerson.name = "Ramesh";
		rcbPerson.gender = "Male";
		rcbPerson.email = "Ramesh@gmail.com";
		rcbPerson.age = 75;

		rcbPerson.print();

	}

}
