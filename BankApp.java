package demo;

import java.util.List;
import java.util.Set;

public class BankApp {

	List<Bank> banks;
	Set<Bank> bankss;
	public BankApp(List<Bank> banks) {
		super();
		this.banks = banks;
	}
	public Set<Bank> getbankss() {
		return bankss;
	}
	public void setBankss(Set<Bank> bankss) {
		this.bankss = bankss;
	}
	
	public List<Bank> getBanks() {
		return banks;
	}
	
	public void setBanks(List<Bank> banks) {
		this.banks = banks;
	}
	@Override
	public String toString() {
		return "BankApp [banks=" + banks + ", bankss=" + bankss + "]";
	}
}
