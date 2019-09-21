package harris_p1;

import java.util.Scanner;

public class Decryption {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Insert encrypted integer: ");
		int ciphertext= scnr.nextInt();
		
		// Get each place, for larger numbers could utilize array
		int one = (ciphertext - 7 + 10) % 10;
		ciphertext /= 10;
		int ten = (ciphertext - 7 + 10) % 10;
		ciphertext /= 10;
		int hund = (ciphertext - 7 + 10) % 10;
		ciphertext /= 10;
		int thou = (ciphertext - 7 + 10) % 10;
		
		// Swap first and third, second and fourth
		int temp = one;
		one = hund;
		hund = temp;
		temp = ten;
		ten = thou;
		thou = temp;
		
		// Output results
		System.out.println("" + "Decrypted result: " + thou + hund + ten + one);
		scnr.close();
	}
}
