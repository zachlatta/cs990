import java.util.ArrayList;

;

public class PhoneBookEntryDemo {
	public static void main(String[] args) {
		// The ArrayList object
		ArrayList<PhoneBookEntry> phonebook = new ArrayList<PhoneBookEntry>();

		// The PhoneBookEntry objects
		PhoneBookEntry paul = new PhoneBookEntry("Paul Jones", "535-4902");
		PhoneBookEntry polly = new PhoneBookEntry("Polly Jones", "234-2042");
		PhoneBookEntry jamie = new PhoneBookEntry("Jamie Jillings", "434-392");
		PhoneBookEntry larry = new PhoneBookEntry("Larry Smith", "420-4926");
		PhoneBookEntry jimmy = new PhoneBookEntry("Jimmy Stone", "444-4444");

		// Adds objects
		phonebook.add(paul);
		phonebook.add(polly);
		phonebook.add(jamie);
		phonebook.add(larry);
		phonebook.add(jimmy);

		// Displays contents of objects
		for (int index = 0; index < phonebook.size(); index++) {
			System.out.println(phonebook.get(index).toString());
		}
	}
}