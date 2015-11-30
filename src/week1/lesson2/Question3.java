package week1.lesson2;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		System.out.printf("Enter Number: ");
		Scanner in = new Scanner(System.in);
		int palinNum = in.nextInt();
		in.close();

		if (Integer.toString(palinNum).length() == 5) {
			int tempBuffer = palinNum;

			int checkpalin = 0;

			while (tempBuffer != 0) {
				checkpalin = (checkpalin * 10) + (tempBuffer % 10);
				tempBuffer = tempBuffer / 10;
			}
			System.out.printf(palinNum+" is "+((checkpalin==palinNum)?"":"not " )+"palindrome");
		} else {
			System.out.println("Not Qualified to be checked as palindrome");
		}
	}
}
