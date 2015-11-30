package week1.lesson3;

public class Question3 {

	public static void main(String arg[]) {

		Billing b1 = new Billing();

		System.out.println("First Bill " + b1.computeBill(11.2500));
		System.out.println("Second Bill " + b1.computeBill(11.2500, 2));
		System.out.println("Third Bill " + b1.computeBill(11.2500, 2, 8));

	}
}

class Billing {
	private double price;
	private int quantity = 1;
	private double coupon = 0;
	private double tax = 8;

	public double computeBill(double price) {
		this.price = price;
		return compute();
	}

	public double computeBill(double price, int quantity) {
		this.price = price;
		this.quantity = quantity;
		return compute();
	}

	public double computeBill(double price, int quantity, double coupon) {
		this.price = price;
		this.quantity = quantity;
		this.coupon = coupon;
		return compute();
	}

	private double compute() {
		return ((1 - (coupon / 100)) * // coupon discount
				(price * quantity) * // total price of purchase
				(1 + (tax / 100))); // tax addition
	}
}