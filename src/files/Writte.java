package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writte {

	public static void main(String[] args) {

		// 1. Define the path that we want to write

		String filename = "D:\\tutorial links\\FileToWrite.txt";
		String message = "Nesto za datoteku";

		// 2. Create the file in Java

		File file = new File(filename);

		// 3. Open the file

		try {
			FileWriter fw = new FileWriter(file);

			// 4. Write to file

			fw.write(message);
			// 5. Close the resources

			fw.close();

		} catch (IOException e) {
		System.out.println("ERROR: Could not write to file" + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Closing the file writer" );
		}

	}

}
