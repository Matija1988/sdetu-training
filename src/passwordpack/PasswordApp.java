package passwordpack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordApp {

	public static void main(String[] args) {

		String passwords = "D:\\tutorial links\\password.txt";

		File passwordList = new File(passwords);
		String[] passwordInput = new String[13];

		try {
			BufferedReader br = new BufferedReader(new FileReader(passwordList));
			for (int i = 0; i < passwordInput.length; i++) {
				passwordInput[i] = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FILE NOT FOUND");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR COULD NOT READ FILE");
			e.printStackTrace();
		}

		for (String passwordOutput : passwordInput) {
			System.out.println(passwordOutput);
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecialChar = false;
			boolean hasInvalidChar = false;

			for (int a = 0; a < passwordOutput.length(); a++) {
				if ("0123456789".contains(passwordOutput.substring(a, a + 1))) {
					hasNumber = true;
					System.out.println("Position " + a + " contains a number");
				} else if ("abcedfghijklmopqestuvwyz".contains(passwordOutput.substring(a, a + 1))) {
					hasLetter = true;
					System.out.println("Position " + a + " contains a leter");
				} else if ("!@#${}*+=/[](),._&".contains(passwordOutput.substring(a, a + 1))) {
					hasSpecialChar = true;
					System.out.println("Position " + a + " contains a special character");
				} else {
			
					try {
						throw new InvalidCharacterException(passwordOutput.substring(a, a + 1)); 
					} catch (InvalidCharacterException e) {
						e.toString();					
					}
				}
			}
			 if (!hasNumber || !hasLetter || !hasSpecialChar) {
				System.out.println("Missing criterea"); 
			}
			else {
				System.out.println("Valid password");
			}
		}

	}
	class InvalidCharacterException extends Exception  {
		String ch;
		public InvalidCharacterException (String ch) {
			this.ch = ch; 
		}
		public String toString() {
			return "InvalidCharacterException: " + ch;  
		}
	}
}
