package guessinggame;
import java.util.*;
import java.math.*;

public class moviegame {
	
	public void hiding (int noofmovies, ArrayList<String> movielist)
	{
		Random element = new Random() ;
		
		/*randomly generated a number from size of list
		  and made it indeax to arraylist		
		 */
		int n= element.nextInt(noofmovies) ;
		String chosen = movielist.get(n);
		chosen = chosen.replaceAll("\\s","");
		char [] name = chosen.toCharArray();
		char [] outing = new char[name.length];
		element_indexes mem = new element_indexes();
		int [] y = new int[chosen.length()];
		System.out.println("I have chosen a movie name and it has " + name.length + " characters");
		
		/*delete this line after project completion this is 
		only for knowing chosen word before guessing */
		System.out.println(chosen);
		
		for(int i =0;i<name.length;i++)
		{
			outing[i] = '_';
			System.out.print("_ ");
		}
		System.out.println();
		System.out.println("Enter your guess");
		Scanner scan = new Scanner(System.in);
		
		
		int chance=10,correct_prediction = 0;
		while(chance > 0 && correct_prediction <=  name.length)
		{
			if(correct_prediction== name.length)
			{
				System.out.println("Gameover you won");
				System.out.println("the movie is /n" +movielist.get(n));
				break;
				
			}
			else
			{
			char guess = scan.next("[a-zA-Z]").charAt(0);
			
			
			y = mem.find(guess, chosen) ;
			
				 //knowing the index of guessed letter from string
				if(chosen.indexOf(guess) < 0)
				{
					chance--;
					System.out.println("your guess is incorrect");
					System.out.println(outing);
				}
				
					
				else
				{
					
					for(int k=0;k<y.length;k++)
					{
						outing[y[k]] = guess;
						correct_prediction++;
						
					}
					
					
					System.out.println("your guess is correct");
				System.out.println(outing);//  guessed letter from string
				
				}
			
		}
		
		}
			
		
	}

	
	

}
