package oop;

public class BankAccount implements IRate {
	// define variables
	String accountNumber;
	private static final String routingNumber = "012313"; 
	String rountingNumber;
	private String name; 
	private String ssn; 
	String accountType;
	double balance = 0; 

	// Constructor definitions : unique methods 
		//1. They are used to define / setup / initialize properties of an object
		//2. Constructors are IMPLICITLY called upon INSTANTIATION 
		//3. The same as the class itself
		//4. Constructors have NO return type
	
	// define methods
	
	BankAccount() {
		System.out.println("New bank account created");
	}
	
	// Overloading : call same method name with different arguments 
	
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		System.out.println("INITIAL DEPOSIT OF: " + initDeposit);
		String Msg = null; 
		if(initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least 1,000$";
			
		} else {
			Msg = ("Thanks for your initial deposit of: $" + initDeposit);
		}
		System.out.println(Msg);
		balance =  initDeposit; 
	}
	
	void deposit(double amount) {
		
		balance = balance + amount;
		showActivity("Deposit"); 
		
	}
	void withdraw(double amount) {
		
		balance = balance - amount; 
		showActivity("withdraw"); 
		
	}
	
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $ " + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance:"  + balance);
		
	}
	void getStatus() {
		
	}
	@Override
	public String toString() {
		return "[ NAME: " + name + ". ACCOUNT# " + accountNumber + 
				". ROUTING# " + routingNumber + " BALANCE: $ " + balance + " ]"; 
	}
	
	// getters / setters
	
	// allow the user to define the name
	
	public void setName(String name) {
		this.name = "Mr." + name; 
	}
	public String getName() {
		return name; 
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// Interface methods
	
	public void setRate() {
		System.out.println("Setting rate");
	}
	
	public void increaseRate() {
		System.out.println("Increasing rate");
	}
	
	
}
