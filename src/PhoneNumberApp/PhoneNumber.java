package PhoneNumberApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumber {

	public static void main(String[] args) {

		// This will read a text file and will retrieve a phone number
		

		String filename = "D:\\tutorial links\\phonenumbers.txt";
		File file = new File(filename);
		String[] phoneNums = new String[6];
		String phoneNum = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
		for (int i = 0; i < phoneNums.length; i++) {
	
			phoneNums[i] = br.readLine();
		}
		br.close(); 
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FILE NOT FOUND");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR COULD NOT READ FILE");
			e.printStackTrace();
		}
		
		
		// valid phone number:
				// 10 digits long
				// there is 112
				// area code cannot start in 0 or 9
		for (int i = 0; i < phoneNums.length; i++) {
			
			phoneNum = phoneNums[i]; 
		
		try {
			if (phoneNum.length() != 10) {
			throw new TenDigitsException(phoneNum); 
			}
			if ((phoneNum.substring(0,1).equals(0)) || phoneNum.substring(0,1).equals(9)) {
				throw new AreaCodeException (phoneNum); 
			}
			for (int n = 0; n < phoneNum.length() - 2; n++) {
				if (phoneNum.substring(n, (n+1)).equals("9")) {
					if (phoneNum.substring(n+1, n+3).equals("11")) {
						throw new EmergencyException(phoneNum); 
					}
				}
			}
		System.out.println(phoneNum);
		} catch (TenDigitsException e){
			System.out.println("ERROR - PHONE NUMBER IS NOT IN VALID FORMAT");
			System.out.println(e.toString());
		} catch (AreaCodeException e) {
			System.out.println("ERROR - PHONE NUMBER HAS INVALID AREA CODE");
		} catch (EmergencyException e) {
			System.out.println("ERROR - INVALID 911");
			System.out.println(e.toString());
		}
	}
	}
}

class TenDigitsException extends Exception {
	String num; 
	TenDigitsException(String num) {
		this.num = num; 
	}
	public String toString() {
		return ("TenDigitsException: " + num); 
	}
}

class AreaCodeException extends Exception {
	String num; 
	AreaCodeException(String num) {
		this.num = num; 
	}
	public String toString() {
		return ("Area Code Exception: " + num); 
	}
}

class EmergencyException extends Exception {
	String num; 
	EmergencyException(String num) {
		this.num = num; 
	}
	public String toString() {
		return ("Emergency Exception: " + num); 
	}
}


