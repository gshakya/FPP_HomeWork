package week1.lesson5.Question5;

import java.util.Scanner;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle() {
		setShapeName("Rectangle");
	}

	@Override
	public String toString() {
		return super.toString()+"\nwidth=" + width + ", height=" + height + 
				"\nArea: " + computeArea()+
				"\nPerimeter "+ computePerimeter();
	}

	@Override
	public double computeArea() {
		return width * height;
	}

	@Override
	public double computePerimeter() {

		return 2 * (width + height);
	}

	@Override
	public void readShapeDate() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Details for Rectangle\nWidth:");
		this.width = in.nextDouble();
		System.out.print("\nHeight:");
		this.height = in.nextDouble();
		in.close();

	}

}
