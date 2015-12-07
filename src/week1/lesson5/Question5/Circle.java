package week1.lesson5.Question5;

import java.util.Scanner;

public class Circle extends Shape {
	private double radius;

	
	Circle(){
		setShapeName("Circle");
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nradius=" + radius+ 
				"\nArea: " + computeArea()+
				"\nPerimeter "+ computePerimeter();
	}

	@Override
	public double computeArea() {
		return Math.PI*radius*radius;
	}

	@Override
	public double computePerimeter() {

		return 2 * Math.PI * radius;
	}

	@Override
	public void readShapeDate() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Details for Circle\nRadius:");
		this.radius= in.nextDouble();
		in.close();

	}
}
