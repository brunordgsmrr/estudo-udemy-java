package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;

	public Account() {
	}

	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.holder = name;
		deposit(initialDeposit);
	}

	public Account(int number, String name) {
		this.number = number;
		this.holder = name;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return holder;
	}

	public void setName(String name) {
		this.holder = name;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double value) {
		this.balance -= (value + 5.0);
	}

	public void deposit(double value) {
		this.balance += value;
	}

	public String toString() {
		return "Account " 
				+ getNumber() 
				+ ", Holder: " 
				+ getName() 
				+ ", Balance $ " 
				+ getBalance();
	}

}
