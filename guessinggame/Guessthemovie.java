package guessinggame;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Guessthemovie {
	public static void main(String args[]) throws Exception {
		
		convert_to_stringsarray m = new convert_to_stringsarray();
		m.openfile();
		ArrayList<String> result =m.transform();
		moviegame game = new moviegame();
		game.hiding(result.size(),result);
		
		
		//for(int j=0;j<result.length;j++)
			//System.out.println(result[j]);
		
		
	}

}
