package qa.com.account.account_application;

import java.util.Map;

import com.google.gson.Gson;

class AccountsJSON{

	private Gson gson;
	private Service service;
	
	public AccountsJSON(Service service){
		this.gson = new Gson();
		this.service = service;
	}
	
	public String outputJSON() {
		String output = "";
		for(Account acc : this.service.getListOfAccounts().values()) {
			output += this.gson.toJson(acc);
		}
		return output;
	}
}
