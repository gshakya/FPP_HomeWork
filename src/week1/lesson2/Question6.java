package week1.lesson2;

import java.util.Scanner;

public class Question6 {
	public static void main(String args[]) {
		System.out.printf("Enter the Length of Checkerboard: ");
		Scanner in = new Scanner(System.in);
		int boardLength=in.nextInt();
		in.close();
		boolean startWithAstriex  = true;
		for ( int i = 0 ; i < boardLength  ; i++){
			for (int j =0; j < boardLength; j++){
				System.out.printf(startWithAstriex?"* ":" *"); 
			}
			startWithAstriex=!startWithAstriex;
			System.out.printf("\n");
		}
	}

}
