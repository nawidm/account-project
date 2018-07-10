package qa.com.account.account_application;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceTest {
	
	Service service;
	
	@Test
	public void testAdd() {
		service = new Service();
		Account accountTest = new Account("Nawid", "Mujadidi", 33333333);
		service.addAccount(accountTest);
		assertTrue(service.getListOfAccounts().containsValue(accountTest));
	}

	@Test
	public void testRemove() {
		service = new Service();
		Account accountTest = new Account("Nawid", "Mujadidi", 33333333);
		service.addAccount(accountTest);
		service.removeAccount(accountTest);
		assertTrue(!service.getListOfAccounts().containsValue(accountTest));
	}
	
	@Test
	public void testJSON() {
		service = new Service();
		Account accountTest = new Account("Nawid","Mujadidi",33333333);
		service.addAccount(accountTest);
		AccountsJSON test = new AccountsJSON(service);
		System.out.println(test.outputJSON());
	}
}
