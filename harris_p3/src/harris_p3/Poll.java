package harris_p3;

import java.util.Scanner;

public class Poll {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] topics = {"Education", "Religion", "Diversity", "Relationships", "Government"};
		int[][] responses = new int[5][10];
		int choice = 0;
		int rating = 0;
		int max = 0, min = 999999; // sets values to find highest or lowest total. If expecting more than 9999999 responses, perhaps the minI would need to be changed.
		int maxI = 0, minI = 0; 
		System.out.println("Welcome to the polling program. We'll now ask you to rate some topics in regards to how important they are to you, from 1 (least important) to 10 (most important).");
		int count = 0;

		do {
			for (int i = 0; i < 5; ++i) {
				System.out.println("From 1-10, how important is: " + topics[i] + "\n>");
				rating = scnr.nextInt();
				while (rating < 1 || rating > 10) {
					System.out.println("Please input a number between 1 and 10.");
					rating = scnr.nextInt();
				}
				responses[i][rating - 1]++;
			}
			System.out.println("Press 1 to let another person respond to the survey and press 2 to quit and display the results.");
			count++;
			choice = scnr.nextInt();
		} while (choice != 2);
		System.out.println("\nRatings\t\t|\t1 |\t2 |\t3 |\t4 |\t5 |\t6 |\t7 |\t8 |\t9 |\t10|");
		System.out.println("---------------------------------------------------------------------------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%s\t|", topics[i]);
			int total = 0;
			for (int j = 0; j < 10; j++) {
				System.out.printf("\t%d |", responses[i][j]);
				total += (responses[i][j] * (j+1));
				}
			if (total > max) {
				max = total;
				maxI = i;
			}
			if (total < min) {
				min = total; 
				minI = i;
			}
			System.out.println("\tAverage: " + ((double)total / count));
		}
		System.out.println("Highest point total issue was " + topics[maxI] + " with a score of " + max + ".");
		System.out.println("Lowest point total issue was " + topics[minI] + " with a score of " + min + ".");
		scnr.close();
	}

}
