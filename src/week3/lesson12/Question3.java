package week3.lesson12;

class BalanceLowException extends Exception {
	BalanceLowException(String message)
    {
           	super(message);
    }

	 BalanceLowException()
    {
           	super("Balance Less than 100 for the transaction");
    }

}

class WithdrawLimitException extends Exception {
	WithdrawLimitException(String message) {
		super(message);
	}

	WithdrawLimitException() {
		super("Withdraw amount Exceeded balance");
	}

}

class CustomerAccount {
	private String cusName;
	private long accNo;
	private double balance;

	public CustomerAccount(String cus_name, long acc_No, double balance) {
		this.cusName = cus_name;
		this.accNo = acc_No;
		this.balance = balance;
	}

	public void deposit(double cur) {
		balance += cur;
	}

	public void withdraw(double amt) throws WithdrawLimitException, BalanceLowException {
		if (amt > balance) {
			throw new WithdrawLimitException();
		}
		
		if ((balance - amt) < 100) {
			throw new BalanceLowException();
		}
		
		balance -= amt;
		System.out.println("Current Balance:" + balance);
	}

}

public class Question3 {

	public static void main(String[] args) {
		CustomerAccount c1 = new CustomerAccount("Gunjan", 1244545465, 5400.00);

		try {
			c1.withdraw(5325.00);
		} catch (WithdrawLimitException | BalanceLowException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			c1.withdraw(5500.00);
		} catch (WithdrawLimitException | BalanceLowException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			c1.withdraw(500.00);
		} catch (WithdrawLimitException | BalanceLowException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		
	}
}
