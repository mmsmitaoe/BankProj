package demo;

public class SBI implements Bank {
	String branch;
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}


	@Override
	public String toString() {
		return "SBI [branch=" + branch + ", acc=" + acc + "]";
	}


	Account acc;

	public Account getAcc() {
		return acc;
	}

	public SBI(Account acc) {
		this.acc=acc;
		System.out.println("inside Constructor of  SBI bank");
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}

	@Override
	public int openAccount(int amount) {
		System.out.println("Account opened in sbi");
		return 100;

	}

	@Override
	public int withdraw(int amount) {
		return 500;
	}
}
