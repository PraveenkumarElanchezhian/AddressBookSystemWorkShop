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
				System.out.println("Given name found in Address Book, deleting contact");
				list.remove(search);
			} else {
				System.out.println("Give proper name");
			}
		}
	}

// Duplicate entry checking in AddressBook =>
	private void checkDuplicateEntry() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter firstname to Check duplicate entry Contact: ");
		String name = userInput.nextLine();
		for (AddressBookContactModel search : list) {
			if (name.equalsIgnoreCase(search.getFirstName())) {
				System.out.println("Given name found in the Address Book");
			} else {
				System.out.println("Give proper name");
			}
		}
	}

// Search person in AddressBook =>
	private void searchPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city to search person entry in Contact: ");
		String city = sc.nextLine();
		for (AddressBookContactModel search : list) {
			if (city.equalsIgnoreCase(search.getCity())) {
				System.out.println("Entered city found in the Address Book");
				search.displayAddressBook();
			} else {
				System.out.println("Entered city not found in the Address Book");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		Scanner userInput = new Scanner(System.in);
		HashMap<String, AddressBookSystem> addressBooks = new HashMap<>();
		AddressBookSystem bookOne = new AddressBookSystem();
		AddressBookSystem bookTwo = new AddressBookSystem();
		AddressBookSystem bookThree = new AddressBookSystem();
		addressBooks.put("AddressBook", bookOne);
		addressBooks.put("AddressBook2", bookTwo);
		addressBooks.put("AddressBook3", bookThree);
		System.out.println(" ");
		System.out.println("Choose your AddressBook : "+"  ");
		System.out.print("Enter 1 -> AddressBookOne"+" || ");
		System.out.print("Enter 2 -> AddressBookTwo"+" || ");
		System.out.print("Enter 3 -> AddressBookThree"+"  ");
		System.out.println(" ");
		int chooseAddressBook = userInput.nextInt();
		System.out.println("Choose your Address Book : ");
		System.out.println("Add || Edit || Delete || DuplicateEntry || SearchPerson ");
		System.out.println(" ");
		while (chooseAddressBook >= 1) {
			System.out.println("Enter Your Choice : ");
			System.out.println("1 -> Add Contacts ");
			System.out.println("2 -> Edit Contacts ");
			System.out.println("3 -> Delete Contacts ");
			System.out.println("4 -> Check Duplicate Entry ");
			System.out.println("5 -> Search person ");
			int choice = userInput.nextInt();
			switch (chooseAddressBook) {
			
			case 1:
				if (choice == 1) {
					bookOne.AddContactsDetails();
				} else if (choice == 2) {
					bookOne.editExistingContact();
				} else if (choice == 3) {
					bookOne.deleteExistingContact();
				} else if (choice == 4) {
					bookOne.checkDuplicateEntry();
				} else if (choice == 5) {
					bookOne.searchPerson();
				}
				break;
				
			case 2:
				if (choice == 1) {
					bookTwo.AddContactsDetails();
				} else if (choice == 2) {
					bookTwo.editExistingContact();
				} else if (choice == 3) {
					bookTwo.deleteExistingContact();
				} else if (choice == 4) {
					bookTwo.checkDuplicateEntry();
				} else if (choice == 5) {
					bookTwo.searchPerson();
				}
				break;
				
			case 3:
				if (choice == 1) {
					bookTwo.AddContactsDetails();
				} else if (choice == 2) {
					bookTwo.editExistingContact();
				} else if (choice == 3) {
					bookTwo.deleteExistingContact();
				} else if (choice == 4) {
					bookTwo.checkDuplicateEntry();
				} else if (choice == 5) {
					bookTwo.searchPerson();
				}
				break;
				
			default:
				System.out.println("Give proper input");
				break;
			}
			System.out.println(" 1 -> AddressBook 1");
			System.out.println(" 2 -> AddressBook 2");
			System.out.println(" 3 -> AddressBook 3");
			System.out.println(" 0 -> Exit");
		}
	}
}