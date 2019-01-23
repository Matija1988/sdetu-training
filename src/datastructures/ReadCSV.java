package datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		// This method will read data from a CSV file
		
		List<String[]> data = new ArrayList<String[]>(); 
		
		String fileName = "D:\\tutorial links\\accounts.csv"; 
		String dataRow; 
	  try {
		  // Open the file
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		// Read data as long as it's not empty
		
		while ((dataRow = br.readLine()) != null) {
			// Parse the data by commas
			String[] line = dataRow.split(","); 
			
			// Add the data to the collection
			
			data.add(line); 
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  for(String[] accounts : data) {
		  System.out.print("[ ");
		  for (String field : accounts) {
			  System.out.print(field);
		  }
		  System.out.println(" ]");
	  }

	}

}
