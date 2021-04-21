package GuessingGame;
	
	// Wadhwa, Smriti S

	import java.util.Scanner;
	public class guessingGame
	{
		public static void main(String args[])
		{
		// generate a random number from 1 to 50
			int guessNumber = (int)(Math.random() * 50);
			
		// Uncomment the next line to know the randomly-generated guessNumber value
			//System.out.println("GUESSNUMBER: " + guessNumber);
			
		// this will count the number of attempts you did to guess the number
			int noOfAttempts = 0;

		// this variable will store your guess number
			int yourGuessNumber;

		//allows user to enter a guess
			Scanner s = new Scanner(System.in);
			do {
			    System.out.println("Enter a number (Attempt #" 
						+ ++noOfAttempts + "): ");
			    yourGuessNumber = s.nextInt();
			    
			    
		//provides a clue for the user
				if (guessNumber > yourGuessNumber) {
					System.out.println("The guess number is higher than " + yourGuessNumber);
				} else {
					System.out.println("The guess number is less than " + yourGuessNumber);
				}
				
		//assesses the condition
		// if guess was wrong, restart loop, if guess was correct, escape the loop
			} while (guessNumber != yourGuessNumber);
	
		// If the guess was correct, print a congratulations message
			if (guessNumber == yourGuessNumber) {
				System.out.println("Congratulations, you got it right after " + noOfAttempts + " attempt(s)");
				s.close();
			} 
		}
		
	}