package datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CreditCardStatmentTestAPP {

	public static void main(String[] args) {

		List<String[]> transactions = new ArrayList<String[]>();

		String fileName = "D:\\tutorial links\\ccstatements.csv";
		String dataRow;
		double balance = 0; 
		DecimalFormat df = new DecimalFormat("#.##"); 
		//df.setRoundingMode(RoundingMode.CEILING); 
		
		try {
			// Open the file
			BufferedReader br = new BufferedReader(new FileReader(fileName));

			// Read data as long as it's not empty

			while ((dataRow = br.readLine()) != null) {
				// Parse the data by commas
				String[] line = dataRow.split(",");

				// Add the data to the collection

				transactions.add(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String[] transaction : transactions) {
		String date = transaction[0];
		String type = transaction[1];
		String vendor = transaction[2];
	
		double amount = Double.parseDouble(transaction [3]); 
		
		System.out.print(date + " " + type + " " + vendor + " $" + amount);
		
		if (type.equalsIgnoreCase("credit")) {
			System.out.println(" Add to balance");
			balance = balance + amount; 
		}
		else if (type.equalsIgnoreCase("debit")) {
			System.out.println(" Subtract from balace");
			balance = balance - amount; 
		} else {
			System.out.println(" Some other transaction");
			balance = balance - amount; 
		}
		System.out.println("NEW BALANCE: " + (df.format(balance)) + "\n ");
		}
		
		if(balance > 0) {
			System.out.println("Your balance is " + (df.format(balance)));
			double fee = balance * .10; 
			
			System.out.println("10% fee charge " + (df.format(fee)));
			
			System.out.println("BALANCE: " + (df.format(balance - fee)));
		}
		
		else if (balance < 0) {
			System.out.println("Thaks for your payments.");
			System.out.println("You have a overpaiment of -" + balance);
		} else {
			System.out.println("Thanks for you payment");
		}
	}

}
