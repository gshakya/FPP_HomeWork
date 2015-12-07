package week1.lesson5.Question3;

import week1.lesson5.Question3.Notebook;

public class Main {

	public static void main(String[] args) {
		Notebook n = new Notebook("Acer", "Intel", 4, 500, 1.6, 11.2, 15.3, 1.22, 500);

		System.out.println("Notebook's Product Cost: " + n.costProduct());

	}

}
