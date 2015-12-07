package week1.lesson5.Question3;

import week1.lesson5.Question3.Computer;

public class Notebook extends Computer {
	private double height;
	private double width;
	private double weight;
	private double cost;

	public Notebook(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed,
			double height, double width, double weight, double cost) {
		super(manufacturer, processor, ramSize, diskSize, processorSpeed);
		this.height = height;
		this.width = width;
		this.weight = weight;
		this.cost = cost;
	}

	public double screenSize() {
		return height * width;
	}

	@Override
	public double costProduct() {
		// TODO Auto-generated method stub
		return cost;
	}

}
