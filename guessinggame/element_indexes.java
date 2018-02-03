package guessinggame;
import java.util.*;

public class element_indexes {
	public int[] find(char Guess, String chosen)
	{
		int index =-1;
		
		
		ArrayList<Integer> list = new ArrayList<Integer>() ;
		char guess = Guess;
	String temp = chosen;
	while(temp.indexOf(guess) != -1) {
	      index = temp.indexOf(guess);
	     
	   list.add(index) ;
	   char[] temp2 = temp.toCharArray();
	   temp2[index] = '/';
	     
	     temp =String.valueOf(temp2);
	    
	}
	int [] indexes = new int[list.size()];
	
	for(int j =0; j <list.size();j++)
	{
		indexes[j] = list.get(j);
	}
	 return indexes;
	}

}
