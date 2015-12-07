package week1.lesson5.Question5;

import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
	System.out.print("C - for Circle\nR - for Rectangle\nT - for Triangle");
	char c = (char) System.in.read();
	switch (c) {
	case 'c':
		Circle cir = new Circle();
		cir.readShapeDate();
		System.out.println(cir);
		
		break;
	case 'r':
		Rectangle rect = new Rectangle();
		rect.readShapeDate();
		System.out.println(rect);
		
		break;
	case 't':
		RtTriangle tri = new RtTriangle();
		tri.readShapeDate();
		System.out.println(tri);
		
		break;

	default:
		System.out.println("Invalid Option");
		break;
	}

	}

}
