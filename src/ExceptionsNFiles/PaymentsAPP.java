package ExceptionsNFiles;

import java.util.Scanner;

public class PaymentsAPP {
	// Take a payment from a user
	public static void main(String[] args) {
		double payment = 0;
		boolean positivePayment = true; 
		// 1. Ask the user for input


		// 2. get the amount and test value
	
		do {

			System.out.print("Enter the payment amount: ");
		
			Scanner in = new Scanner(System.in);
			// 3. handle exceptions
			try {
				payment = in.nextDouble();
				if (payment < 0) {
					throw new NegativePaymentException(payment);
				}
				else {
					positivePayment = true; 
				}
			} catch (NegativePaymentException e) {
				System.out.println(e.toString());
				System.out.println("Please try again");
				positivePayment = false; 
			}

		} while(!positivePayment); 
		
		// 4. Print confirmation
		
		System.out.println("Thank your for your payment of $ " + payment);

	}

}
