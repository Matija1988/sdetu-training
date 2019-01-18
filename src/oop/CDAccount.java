package oop;

public class CDAccount extends BankAccount implements IRate {

	String intrestRate;
	
	void Compound() {
		System.out.println("Compounding intreset");
	}
	
}
