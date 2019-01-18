package StudentAPPLab;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private String SSN;
	private String email =  "@gmail.com";
	private static int iD = 1000; 
	private String phone;
	private String city;
	private String state;
	private String StudentID;
	private String EmailID;
	private String courses; 
	private int balance = 0; 
	private int costOfCourse = 500; 
	private int debt; 

	public Student() {
		
		setFirstName(firstName);
		setLastName(lastName); 
		setSSN();	
		setStudentID(); 
		setEmail(); 
		setCity(); 
		setState();
		setPhone(); 
		enroll();
		pay(); 
		checkBalance(); 
		showCourses(); 
		toString(); 
	}
	
	private void setFirstName(String firstName) {
		Scanner in = new Scanner(System.in); 
		System.out.println("STUDENT FIRST NAME: ");
		this.firstName = in.nextLine(); 
		
		
	}
	
	public String getFirstName() {
		return firstName; 
	}
	
	private void setLastName(String lastName) {
		Scanner in = new Scanner(System.in); 
		System.out.println("STUDENT LAST NAME: ");
		this.lastName = in.nextLine(); 
		
		
	}
	
	public String getLastName() {
		return lastName; 
	}
	
	
	private void setSSN() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER YOUR SSN: "); 
		this.SSN = in.nextLine();
		
		if(SSN == null || SSN.trim().length() !=11) {
			System.out.println("YOUR SSN IS NOT VALID ____ MUST HAVE 11 NUMBERS");
		} 
		
}
		public String getSSN() {
			return SSN; 
		}
	
	private void setStudentID() {
		iD++;
		int random = (int) (Math.random() * 10000); 
		this.StudentID = iD + "" + random + SSN.substring(7,11);
		System.out.println(StudentID);
	}
	
	public int getStudentID() {
		return iD; 
	}

	private void setEmail() {
		this.email = firstName.toLowerCase() + lastName.toLowerCase() + email; 
		System.out.println("NEW STUDENT EMAIL: " + email);
	}
	public String getEmail() {
		return email; 
	}
	private void setCity() {
		Scanner in = new Scanner(System.in);
		System.out.println("CITY: ");
		this.city = in.nextLine(); 
	}
	public String getCity() {
		return city; 
	}
	private void setState() {
		Scanner in = new Scanner(System.in); 
		System.out.println("STATE: ");
		this.state = in.nextLine(); 
	}
	public String getState() {
		return state; 
	}
	private void setPhone() {
		Scanner in = new Scanner(System.in); 
		System.out.println("PHONE NUMBER: ");
		this.phone = in.nextLine(); 
	}
	public String getPhone() {
		return phone; 
	}

	public void enroll() {
		
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n " + course; 
				balance = balance - costOfCourse; 
			}
			else {break;}
			}while (1 !=0);
			
	}
	
	public void showCourses() {
		System.out.println("STUDENT COURSES: " + courses);
	}
	public void pay() {
		checkBalance(); 
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt(); 
		balance = balance + payment; 
		System.out.println(firstName + " " + lastName + " thank you for your payment of $" + payment);
		checkBalance(); 
	}
	
	public void checkBalance() {
		System.out.println("Your balance is: $" + balance);
	}
	public String toString() {
		return "STUDENT NAME: " + firstName + " " + lastName 
				+ "\nSTUDNET SSN: " + SSN + "\nSTUDENT GENERATED ID: " + iD 
				+ "\nSTUDENT GENERATED EMAIL: " + email + "\nGENERAL STUDENT DATA: " + city + ", " + state + ", " + phone 
				+ "\nSTUDENT COURSES: " + courses + "\nSTUDENT BALANCE: " + balance; 
	}
}