package demo;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApplicaion {

	public static void main(String[] args) {
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("config.xml");
		BankApp bankApp = (BankApp)springContainer.getBean("bk");
		List<Bank> banks=bankApp.getBanks();
		Set<Bank> bankSet=bankApp.getbankss();
		System.out.println(banks);
		System.out.println(bankSet);
	}
}
