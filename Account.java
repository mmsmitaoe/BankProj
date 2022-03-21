package demo;

public class Account {
	String name;
	int id;
	int balance;

	public Account() {
		super();

	}

	public Account(String name, int id, int balance) {
		super();
		this.name = name;
		this.id = id;
		this.balance = balance;
		System.out.println("inside Constructor of Account class");
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", id=" + id + ", balance=" + balance + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
