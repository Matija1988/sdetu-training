package datastructures;

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet = { "a", "b", "c", "d", "e" };

		System.out.println("the old fashioned way");
		for (int i = 0; i < 5; i++) {
			System.out.print(alphabet[i] + " ");
		}
		System.out.println("\nusing the length variable");

		int size = alphabet.length;

		for (int n = 0; n < size; n++) {
			System.out.print(alphabet[n] + " ");
		}

		System.out.println("\n\nUsing the For-Each method");

		for (String letter : alphabet) {
			System.out.print(letter + " ");
		}

		String[][] users = { { "Jhon", "Wiliams", "jw@gmail.com", "343433" },
				{ "Sarah", "Jackson", "sj@gmail.com", " 312333" }, { "Rachel", "Wallace", "rc@gmail.com", "324355" } };

		// Get the size of array

		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("\nNumber of users: " + numOfUsers);
		System.out.println("Number of fields: " + numOfFields);

		// Traverse the double array

		for (int i = 0; i < numOfUsers; i++) {

			String firstName = users[i][0];
			String lastName = users[i][1];
			String email = users[i][2];
			String phone = users[i][3];
			System.out.println(firstName + " " + lastName + " " + email + " " + phone);
		}
		
		System.out.println("\n\n using for each");
		
		for (String[] user : users) {
			System.out.print("[ ");
			for (String field : user) {
				System.out.print(field + " ");
			}
			System.out.println(" ]");
		}
	}
}
