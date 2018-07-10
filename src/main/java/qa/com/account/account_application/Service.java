package qa.com.account.account_application;
import java.util.HashMap;
import java.util.Map;

public class Service {
	
	private Map<Integer, Account> listOfAccounts;
	
	public Service() {
		this.listOfAccounts = new HashMap<Integer, Account>();
	}

	public void addAccount(Account account) {
		this.listOfAccounts.put(account.getAccountNumber(), account);
	}
	
	public void removeAccount(Account account) {
		this.listOfAccounts.remove(account.getAccountNumber());
	}

	public Map<Integer, Account> getListOfAccounts() {
		return listOfAccounts;
	}

	public void setListOfAccounts(Map<Integer, Account> listOfAccounts) {
		this.listOfAccounts = listOfAccounts;
	}
}
