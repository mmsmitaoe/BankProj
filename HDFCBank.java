package demo;

public class HDFCBank implements Bank {
	Account acc;
	String branch;
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Account getAcc() {
		return acc;
	}

	public HDFCBank(Account acc) {
		this.acc = acc;
		System.out.println("inside Constructor of  hdfc bank");
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	@Override
	public int openAccount(int amount) {
		System.out.println("Account opened in hdfc Bank");
		return 100;

	}



	@Override
	public String toString() {
		return "HDFCBank [acc=" + acc + ", branch=" + branch + "]";
	}

	@Override
	public int withdraw(int amount) {
		return 500;
	}

}
