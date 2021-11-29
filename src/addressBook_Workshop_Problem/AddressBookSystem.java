package addressBook_Workshop_Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookSystem {
	private static ArrayList<AddressBookContactModel> list = new ArrayList<AddressBookContactModel>();

// AddressBook contact =>	
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
		details.displayAddressBook();
		return list;
	}

//Edit the existing contacts in AddressBook =>
	private void editExistingContact() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter firstname to edit contact : ");
		String name = userInput.nextLine();
		for (AddressBookContactModel search : list) {
			if (name.equalsIgnoreCase(search.getFirstName())) {
				System.out.println("Enter the updated first name : ");
				String firstName = userInput.next();
				search.setFirstName(firstName);
				System.out.println("Enter the updated last name : ");
				String lastName = userInput.next();
				search.setLastName(lastName);
				System.out.println("Enter the updated address : ");
				String address = userInput.next();
				search.setAddress(address);
				System.out.println("Enter the updated city : ");
				String city = userInput.next();
				search.setCity(city);
				System.out.println("Enter the updated state : ");
				String state = userInput.next();
				search.setState(state);
				System.out.println("Enter the updated zipcode : ");
				int zip = userInput.nextInt();
				search.setZip(zip);
				System.out.println("Enter the updated phoneNumber : ");
				long phoneNumber = userInput.nextInt();
				search.setPhoneNumber(phoneNumber);
				System.out.println("Enter the updated emailID : ");
				String email = userInput.next();
				search.setEmail(email);
				search.displayAddressBook();
			} else {
				System.out.println("Give proper name");
			}
		}
	}

//Delete the existing contacts in AddressBook =>
	private void deleteExistingContact() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter firstname to Delete Contact : ");
		String name = userInput.nextLine();
		for (AddressBookContactModel search : list) {
			if (name.equalsIgnoreCase(search.getFirstName())) {
				System.out.println("Given name is found in Address Book, deleting contact");
				list.remove(search);
			} else {
				System.out.println("Give proper name");
			}
		}
	}

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		HashMap<String, AddressBookContactModel> myaddressBooks = new HashMap<>();
		AddressBookSystem bookOne = new AddressBookSystem();
		AddressBookSystem bookTwo = new AddressBookSystem();
		System.out.println("Choose your Address Book : AddressBook-> 1 / AddressBook-> 2");
		int chooseAddressBook = userInput.nextInt();
		System.out.println("Choose your Address Book : Add/Edit/Delete");
		while (chooseAddressBook >= 1) {
			System.out.println("Enter Your Choice : Add Contacts(1)/Edit Contacts(2)/Delete Contacts(3)");
			int choice = userInput.nextInt();
			switch (chooseAddressBook) {
			case 1:
				if (choice == 1) {
					bookOne.AddContactsDetails();
				} else if (choice == 2) {
					bookOne.editExistingContact();
				}else if (choice == 3) {
					bookOne.deleteExistingContact();
				}
				break;
			case 2:
				if (choice == 1) {
					bookTwo.AddContactsDetails();
				} else if (choice == 2) {
					bookTwo.editExistingContact();
				}else if (choice == 3) {
					bookOne.deleteExistingContact();
				}
				break;

			default:
				System.out.println("Give proper input");
				break;
			}
			System.out.println("1) AddressBook 1");
			System.out.println("2) AddressBook 2");
			System.out.println("3) AddressBook 3");
			System.out.println("0) Exit");
		}

	}
}