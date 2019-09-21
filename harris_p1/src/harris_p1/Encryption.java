package harris_p1;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Insert four-digit integer: ");
		int plaintext = scnr.nextInt();
		
		// Get each place, for larger numbers could utilize array
		int one = (plaintext + 7) % 10;
		plaintext /= 10;
		int ten = (plaintext + 7) % 10;
		plaintext /= 10;
		int hund = (plaintext + 7) % 10;
		plaintext /= 10;
		int thou = (plaintext + 7) % 10;
		
		// Swap first and third, second and fourth
		int temp = one;
		one = hund;
		hund = temp;
		temp = ten;
		ten = thou;
		thou = temp;
		
		// Output results
		System.out.println("" + "Encrypted result: " + thou + hund + ten + one);
		scnr.close();
	}

}
