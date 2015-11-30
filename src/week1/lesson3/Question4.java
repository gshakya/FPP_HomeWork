package week1.lesson3;

public class Question4 {

	public static void main(String[] args) {
		double[] interestRates = { 4, 5 };
		for (double rate : interestRates) {
			SavingsAccount.modifyInterestRate(rate);
			SavingsAccount sa1 = new SavingsAccount();
			SavingsAccount sa2 = new SavingsAccount(3000.00);
			sa1.addBalance(2000.00);
			System.out.println("\n\n------------Interest Rate: " + rate
					+ "%--------------------------------");
			for (int mon = 1; mon < 13; mon++) {
				double interest = sa1.calculateMonthlyInterest();
				sa1.addBalance(interest);
				double balance = sa1.getSavingsBalance();
				System.out
						.printf("\nBalance and Interest for sa1 for Month %d is %.2f and %.2f respectively",
								mon, interest, balance);

				interest = sa2.calculateMonthlyInterest();
				sa2.addBalance(interest);
				balance = sa2.getSavingsBalance();
				System.out
						.printf("\nBalance and Interest for sa2 for Month %d is %.2f and %.2f respectively",
								mon, interest, balance);
			}

		}

	}

}

class SavingsAccount {
	private static double annualInterestRate;
	private double savingsBalance;

	SavingsAccount() {
		this.savingsBalance = 0;
	}

	SavingsAccount(double initialBalance) {
		this.savingsBalance = initialBalance;
	}

	public static void modifyInterestRate(double interestRate) {
		annualInterestRate = interestRate;
	}

	public double calculateMonthlyInterest() {
		return (savingsBalance * (annualInterestRate / 100) / 12);
	}

	public void addBalance(double balAmount) {
		this.savingsBalance = this.savingsBalance + balAmount;

	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

}