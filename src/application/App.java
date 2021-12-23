package application;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// using streams as a different type of for each loops
		// other ways of iterating through an array are for,
		// for each, range, while

		String[] animals = { "dog", "bear", "horse" };

		//stream is a method of the Arrays class
		Arrays.stream(animals).forEach(animal -> {
			System.out.println(animal);
		});
		/* Coding challenge
		 * Write a program that gets three numbers input by the user (keep 
		 * asking until they have entered exactly 3 numbers),
		 * prints the numbers entered, prints the total of the numbers.
		 * Use a stream for iteration.
		 */

		Scanner scanner = new Scanner(System.in);
		final int DELIMITER = 3;
		int[] userInput = new int[DELIMITER];
		
		System.out.println("Enter three integers below:");
		
		for(int i = 0; i < DELIMITER; i++) {
			System.out.println("Enter the integer: ");
			userInput[i] = scanner.nextInt();
		}
		scanner.close();
		
		int total = 0;
		System.out.println("The numbers you entered are:");
		
		Arrays.stream(userInput).forEach(num -> {
			System.out.println(num);
			//total = total + num;
		});
		
		for(int j = 0; j < userInput.length; j++) {
			total += userInput[j];
		}
		System.out.printf("The sum total is %d", total);
	}

}
