package harris_p2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the BMI calculator. Choose a measurement system.\n1)Imperial\n2)Metric");
		int choice = scnr.nextInt();
		while (!(choice == 1 || choice == 2)) {
			System.out.println("Please enter a valid choice, either (1)Imperial or (2)Metric. (only input the number)");
			choice = scnr.nextInt();
		}
		double weight = 0;
		double height = 0;
		double BMI = 0;
		
		switch (choice) {
		// Imperial Case
		case 1: {
			System.out.println("Enter your weight in pounds: ");
			weight = scnr.nextDouble();
			System.out.println("Enter your height in inches: ");
			height = scnr.nextDouble();
			BMI = (703 * weight) / (Math.pow(height, 2));
			System.out.printf("Your BMI is: %.1f\n", BMI);
			break;
		}
		// Metric Case
		case 2: {
			System.out.println("Enter your weight in kilograms: ");
			weight = scnr.nextDouble();
			System.out.println("Enter your height in meters: ");
			height = scnr.nextDouble();
			BMI = weight / (Math.pow(height, 2));
			System.out.printf("Your BMI is: %.1f\n", BMI);
			break;
		}
		// Alerts instructor to take pity on me.
		default: {
			System.out.println("Something went wrong, my poor grade.");
			break;
		}
		}
		// Tells user what their BMI is
		if (BMI < 18.5) 
			System.out.printf("A BMI of %.1f is considered underweight.\n", BMI);
		else if (BMI >= 18.5 && BMI <= 24.9)
			System.out.printf("A BMI of %.1f is considered normal weight.\n", BMI);
		else if (BMI >= 25.0 && BMI < 29.9)
			System.out.printf("A BMI of %.1f is considered overweight.\n", BMI);
		else
			System.out.printf("A BMI of %.1f is considered obese.\n", BMI);
		// Prints the BMI chart
		System.out.println("");
		System.out.println("BMI Categories:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal Weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = BMI of 30 or greater");

		scnr.close();		
	}
}
