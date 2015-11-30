package week1.lesson2;

import java.util.Scanner;

public class Question7 {
	public static void main(String args[]) {
		System.out.printf("Choice	Planet	Relative gravity");
		System.out.printf("\n1	Venus	0.78");
		System.out.printf("\n2	Mars	0.39");
		System.out.printf("\n3	Jupiter	2.65");
		System.out.printf("\n4	Saturn	1.17");
		System.out.printf("\n5	Uranus	1.05");
		System.out.printf("\n6	Neptune	1.23\n");
		System.out.printf("\nEnter Your Option: ");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();

		System.out.printf("\nEnter Your Weight: ");
		int weight = in.nextInt();
		in.close();

		switch (choice) {
		case 1:
			System.out.println("Your Weight in Venus is :"+(weight*0.78));
			break;
		
		case 2:
			System.out.println("Your Weight in Mars is :"+(weight*0.39));
			break;
		
		case 3:
			System.out.println("Your Weight in Jupiter is :"+(weight*2.65));
			break;
		
		case 4:
			System.out.println("Your Weight in Saturn is :"+(weight*1.17));
			break;
		
		case 5:
			System.out.println("Your Weight in Uranus is :"+(weight*1.05));
			break;
		
		case 6:
			System.out.println("Your Weight in Neptune is :"+(weight*1.23));
			break;
		
		default:
			System.out.println("Incorrect Choice between 1-6");
			break;
		}

	}
}
