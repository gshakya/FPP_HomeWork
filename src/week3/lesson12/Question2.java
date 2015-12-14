package week3.lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] arg) {

		Scanner in = new Scanner(System.in);
		while (true) {

			int num;
			System.out.print("Enter a Number between 0 and  100:");
			try {
				num = in.nextInt();
				if (num < 0) {
					throw (new IllegalArgumentException("Number less than 0"));
				}
				if (num > 100) {
					throw (new IllegalArgumentException("Number greater than 100"));
				} else
					break;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				continue;

			} catch (InputMismatchException e) {

				System.out.println("Invalid Input");
				in.next();
				continue;
			}
		}

		System.out.println("Sucess!!");

	}
}
