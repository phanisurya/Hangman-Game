package guessinggame;
import java.util.Scanner;
import java.math.*;

public class GuessGame {
	public static void main(String args[]) {
		int randomNumber = (int) (Math.random() * 100 + 1);
		boolean hasWon = false;
		System.out.println("I am building a guess game guess the number between 1 and 100");
		Scanner scanner = new Scanner(System.in);
		for(int i=10;i>0;i--) {
			System.out.println("you have " + i + "chances left");
			int guess =scanner.nextInt();
			if(guess<randomNumber)
				System.out.println("your number is greaterthan : " + guess );
			else if(guess>randomNumber)
				System.out.println("your number is lessthan : " + guess );
			else {
				 hasWon = true;
				 break;
			}
			
			
		}
		if(hasWon) 
		{
			System.out.println("You have won.... hurray!!" );

		}
		else {
			System.out.println("better luck next time");
		}
	}

}
