package week1.lesson2;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		System.out.printf("Enter Year: ");
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		in.close();
		
		System.out.println(year+" is "+((year%4)==0?"":"not ")+ "a leap year");
	}

}
