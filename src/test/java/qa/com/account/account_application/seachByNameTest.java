package qa.com.account.account_application;

import static org.junit.Assert.*;

import org.junit.Test;

public class seachByNameTest {

	@Test
	public void test() {
		Service service = new Service();
		Account accountTest = new Account("Nawid", "Mujadidi", 33333333);
		service.addAccount(accountTest);
		int count = service.getNumberOfOccurrences("Nawid");
	}

}
