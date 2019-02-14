package banking;

public class CustomerDetails {
	String name;
	String id;
	AccountDetails acc;

	CustomerDetails() {
		this("new Customer", "AB-00", new Saving());

	}

	CustomerDetails(String name) {
		this(name, "AB-00", new Saving());
	}

	CustomerDetails(String name, String id) {
		this(name, id, new Saving());
	}

	CustomerDetails(String name, String id, AccountDetails acc) {
		this.name = name;
		this.id = id;
		this.acc = acc;

	}

	void Deposit(int m) {
		acc.getCredit(m);
	}

	void Withdrawl(int m) {
		acc.getdebit(m);
	}

	public void viewbalance() {
		acc.getviewbalance();
	}
}
