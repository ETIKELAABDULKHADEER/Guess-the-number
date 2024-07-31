package khadeer;

//public class NumberGuessingGame {
	import java.util.Random;
	import java.util.Scanner;

	public class NumberGuessingGame {

	    public static void main(String[] args) {
	        // Generate a random number between 1 and 100
	        Random random = new Random();
	        int targetNumber = random.nextInt(100) + 1;

	        Scanner scanner = new Scanner(System.in);
	        int guess = 0;
	        int numberOfTries = 0;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("Try to guess the number between 1 and 100.");

	        // Loop until the user guesses the correct number
	        while (guess != targetNumber) {
	            System.out.print("Enter your guess: ");
	            guess = scanner.nextInt();
	            numberOfTries++;

	            if (guess < targetNumber) {
	                System.out.println("Too low! Try again.");
	            } else if (guess > targetNumber) {
	                System.out.println("Too high! Try again.");
	            } else {
	                System.out.println("Congratulations! You guessed the number correctly.");
	                System.out.println("It took you " + numberOfTries + " tries.");
	            }
	        }

	        scanner.close();
	    }
	}


