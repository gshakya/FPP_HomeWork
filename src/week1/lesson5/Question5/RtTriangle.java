package week1.lesson5.Question5;

import java.util.Scanner;

public class RtTriangle extends Shape{
	private double base;
	private double height;

	public RtTriangle() {
		setShapeName("Right Angled Triangle");
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nbase=" + base + ", height=" + height + 
				"\nArea: " + computeArea()+
				"\nPerimeter "+ computePerimeter();
	}
	
	@Override
	public double computeArea() {
		return 0.5*base * height;
	}

	@Override
	public double computePerimeter() {

		return (base + height)+ Math.sqrt((base*base)+(height*height));
	}

	@Override
	public void readShapeDate() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Details for Right angle Triangle\nBase:");
		this.base = in.nextDouble();
		System.out.print("\nHeight:");
		this.height = in.nextDouble();
		in.close();

	}
}
