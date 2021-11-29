package addressBook_Workshop_Problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAddressBookSystem {
@Test
	public void TestAddressBookContact() {
		AddressBookContactModel rv = new AddressBookContactModel("Praveen","Kumar","AnnaNagar","Chennai","TamilNadu",636301,987654321,"abc@gmail.com");
		assertEquals("Praveen",rv.getFirstName());
		assertEquals("Kumar", rv.getLastName());
		assertEquals("AnnaNagar", rv.getAddress());
		assertEquals("Chennai", rv.getCity());
		assertEquals("TamilNadu", rv.getState());
		assertEquals(636301, rv.getZip());
		assertEquals(987654321, rv.getPhoneNumber());
		assertEquals("abc@gmail.com", rv.getEmail());
		
	}
}
