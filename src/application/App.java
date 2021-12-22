package application;

import java.util.Arrays;

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


	}

}
