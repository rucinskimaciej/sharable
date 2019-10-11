public class ContactList {
	public static void main(String[] args) {
	
		int numberOfContacts = 5;	// How many contacts the contact list has.

		Contact contact[] = new Contact[numberOfContacts];
// ---------------------------------------------------------------------------------
		contact[0] = new Contact("Maciej", "Rucinski", 123456789, "Mokotowska");
		contact[1] = new Contact("Jan", "Kowalski", 951384897, "Miodowa");
		contact[2] = new Contact("Ania", "Lewandowska", 674356829, "Dluga");
		contact[3] = new Contact("Agnieszka", "Senderowska-Rucinska", 888230944, "Ringelbluma");
		contact[4] = new Contact("Brawurka", "Rucinska", 43919, "Ringelbluma");
// ---------------------------------------------------------------------------------		

		int contactNo = 0; // Which contact from the list should be presented?
		String nameSurname = contact[contactNo].getNameSurname();
		int number = contact[contactNo].getNumber();
		String address = contact[contactNo].getAddress();

		Contact.result(nameSurname, number, address);
				
	}
}

class Contact{

	String name, surname, address;
	int number;

	String getNameSurname() {
		return this.name + " " + this.surname;
	}
	
	int getNumber() {
		return this.number;
	}
	
	String getAddress() {
		return this.address;		
	}
	
	void setContactDetails(String name, String surname, int number, String address) {
		this.name = name;
		this.surname = name;
		this.number = number;
		this.address = address;
	}

		Contact(String name, String surname, int number, String address){
			this.name = name;
			this.surname = surname;
			this.number = number;
			this.address = address;			
		}
	
	static void result(String nameSurname, int number, String address) {
		System.out.println("");
		System.out.println("Name: " + nameSurname);
		System.out.println("Phone number: " + number);
		System.out.println("Address: " + address);
	}

}