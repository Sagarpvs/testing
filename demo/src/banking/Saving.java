package banking;

public class Saving extends AccountDetails {
	private int balance;

	public Saving() {
		balance = 1000;

	}

	public void getCredit(int amount) {
		balance = balance + amount;
		System.out.println("balance after credited " + balance);
	}

	public void getdebit(int amount) {
		balance = balance - amount;
		System.out.println("balance after debited " + balance);
	}

	public void getviewbalance() {
		System.out.println("total balance: " + balance);
	}

}