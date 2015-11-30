package week1.lesson2;

import java.util.Random;
import java.util.Scanner;

public class Question4 {
	public static void main (String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter First Name: ");
		String firstName = in.next();
		
		System.out.printf("Enter Last Name: ");
		String lastName = in.next();
		in.close();
		Random rand = new Random();
		
		int randomNum = rand.nextInt(1000);
		
		String randDigitToken = Integer.toString(randomNum);
		if (randomNum<100){
			if (randomNum < 10) randDigitToken = "00"+Integer.toString(randomNum);
			else  randDigitToken = "0"+Integer.toString(randomNum);
		}
		
		char fNameToken = firstName.charAt(0);	
		String lNameToken = lastName.substring(0, 5);
		
		System.out.printf("UserName: %s%s%s",fNameToken,lNameToken,randDigitToken);
	}
}
