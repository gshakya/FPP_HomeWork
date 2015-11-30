package week1.lesson3;

import java.util.Random;

class PairOfDice {
	public int die1; // Number showing on the first die.
	public int die2; // Number showing on the second die.

	public PairOfDice() {
		// Constructor. Rolls the dice, so that they initially
		// show some random values. Call the roll() method to roll the dice.
		roll();
	}

	public PairOfDice(int val1, int val2) {
		// Constructor. Creates a pair of dice that
		// are initially showing the values val1 and val2.
		die1 = val1;
		die2 = val2;
	}

	public void roll() {
		// Roll the dice by setting each of the dice (die1, die2) to be
		// a random number between 1 and 6.
		Random rand = new Random();
		int die1Val = 0;
		int die2Val = 0;
		do {
			die1Val = rand.nextInt(7);
			die2Val = rand.nextInt(7);
		} while (die1Val == 0 | die2Val == 0);

		die1 = die1Val;
		die2 = die2Val;
	}
}

public class Question2 {

	public static void main(String[] args) {
		// Create two object for the PairOfDice
		PairOfDice p1 = new PairOfDice();
		PairOfDice p2 = new PairOfDice(5,2);
		int sumPairDice1=0;
		int sumPairDice2=0;
		int rollCount = 0;
		do{ 
		// Roll the two pairs of dice for both objects until the totals are
		// same.
		sumPairDice1=p1.die1+p1.die2;
		sumPairDice2=p2.die1+p2.die2;
		rollCount++;
		System.out.printf("-----Roll %d------\n",rollCount);
//		System.out.println("---------"+p1.die1);
//		System.out.println("---------"+p1.die2);
		System.out.println("Sum of Pair1: "+sumPairDice1);	
//		System.out.println("---------"+p2.die1);
//		System.out.println("---------"+p2.die2);
		System.out.println("Sum of Pair2: "+sumPairDice2);
		p1.roll();
		p2.roll();
		// Display how many times needed to get the same total
		}while (sumPairDice1 != sumPairDice2);
		System.out.println("Total Roll Required: "+ rollCount);
	}
}
