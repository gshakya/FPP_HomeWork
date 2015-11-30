package week1.lesson2;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		
		System.out.printf("Enter an amount, for example 11.56: ");
		Scanner in = new Scanner(System.in);
		float amount = in.nextFloat();
		in.close();
		int dollarVal = (int) amount;
		System.out.printf("\n%d Dollars", dollarVal);
			

		int centVal = (int)(Math.round((amount - dollarVal)*100));
//		System.out.println(centVal);
		int quarterVal = centVal / 25;
		System.out.printf("\n%d Quaters", quarterVal);

		centVal = centVal - (quarterVal * 25);
//		System.out.println(centVal);
		int dimeVal = centVal / 10;
		System.out.printf("\n%d Dimes", dimeVal);

		centVal = centVal - (dimeVal * 10);
//		System.out.println(centVal);
		int nickelVal = centVal / 5;
		System.out.printf("\n%d Nickels", nickelVal);

		centVal = centVal - (nickelVal * 5);
//		System.out.println(centVal);
		System.out.printf("\n%d Cents", centVal);
	}
}
