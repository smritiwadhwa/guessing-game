package GuessingGame;
import java.util.Scanner;
public class guessingGame2 {
	public static void main(String args[])
	{
	// generate a random number from 1 to 50
		int numbers = 5000;
		int guessNumber = (int)(Math.random() * numbers);
		//int oddGuessNumber = guessNumber * 2+1;
		int attempts = 0;
		int x = 0;
		
		int maxNum = numbers;
		int a=0;
		
	//max attempts	
	while (maxNum > 0) {
			//System.out.println("maxNum="+maxNum);
			a = maxNum/2;
			//System.out.println("a:"+ a);
			if (a>=0) {
				maxNum=a;
				attempts++;
				//System.out.println("ATTEMPTS = " + attempts);
			}else {
				break;
			}
	  	 }
	//System.out.println("final ATTEMPTS = " + attempts);

		
		
	// Uncomment the next line to know the randomly-generated guessNumber value
		//System.out.println("GUESSNUMBER: " + guessNumber);
		System.out.println("MAX ATTEMPTS NEEDED: " + attempts);
		
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
			
			//max attempts then dont allow more
			if(attempts == noOfAttempts) {
			System.out.println("You have exceeded the number of attempts allowed");
			s.close();
			break;
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
