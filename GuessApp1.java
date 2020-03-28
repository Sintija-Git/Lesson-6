package Lesson6;
//Lets use our class GuessNumber as instantiable class to calculate the users guessed number!
//Number of total guesses: 3 (loop will control it thats why for loop
import Lab3.GuessNumber;
import java.util.Scanner;
public class GuessApp1 {
	public static void main (String [] args) {
	//using for loop and using guess number class in Lab3
	
	//declare local variables
	int guess;
	
	Scanner input = new Scanner (System.in);
	
	GuessNumber checker = new GuessNumber();
	
	for(int i = 0; i<3; i++) { // 3(i)- number of lines or loops
		//input
		System.out.println ("Enter your guess number: ");
		guess = input.nextInt();
		
		checker.setGuess(guess);
		
		
		//processing -> here gonna call compare
		checker.compare();
		
		//output
		String m = checker.getMessage();
		System.out.println(m);	
		
		if (m.equals("Congrats")) {
			break;
		}
		
	}// end for 
		
		int s = checker.getSecret();
		System.out.println("secret: " + s);	
		
	
	} //end main
	}// end class


