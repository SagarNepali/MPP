package prob4E.launch;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;

	private List<Account> accounts;

	Employee(String name){
		this.name = name;
		accounts = new ArrayList<>();

	}

	public String getName(){
		return name;
	}

	public void addAccount(Account account){
		accounts.add(account);

	}

	public double computeUpdatedBalanceSum() {
		return accounts.stream().mapToDouble(r -> r.computeUpdatedBalance()).sum();
	}
}
