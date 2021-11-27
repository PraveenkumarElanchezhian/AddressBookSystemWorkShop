package addressBook_Workshop_Problem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {
	private static ArrayList<AddressBookContactModel> list = new ArrayList<AddressBookContactModel>();

	public ArrayList<AddressBookContactModel> AddContactsDetails() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the First Name :");
		String firstName = userInput.nextLine();
		System.out.println("Enter the Last Name :");
		String lastName = userInput.nextLine();
		System.out.println("Enter the Address :");
		String address = userInput.nextLine();
		System.out.println("Enter the City :");
		String city = userInput.nextLine();
		System.out.println("Enter the State :");
		String state = userInput.nextLine();
		System.out.println("Enter the Zip Code :");
		int zip = userInput.nextInt();
		System.out.println("Enter the Phone Number :");
		long phoneNumber = userInput.nextLong();
		System.out.println("Enter the Email :");
		String email = userInput.nextLine();
		email = userInput.nextLine();
		AddressBookContactModel details = new AddressBookContactModel(firstName, lastName, address, city, state, zip,
				phoneNumber, email);
		list.add(details);
		return list;
	}

	public static void main(String[] args) {
		AddressBookSystem myAddressBookSystem = new AddressBookSystem();
		myAddressBookSystem.AddContactsDetails();

	}

}
