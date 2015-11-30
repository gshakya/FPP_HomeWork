package week1.lesson5.Question2;

public class Notebook extends Computer {
	private double height;
	private double width;
	private double weight;

	public Notebook(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed,
			double height, double width, double weight) {
		super(manufacturer, processor, ramSize, diskSize, processorSpeed);
		this.height = height;
		this.width = width;
		this.weight = weight;
	}

	public double screenSize() {
		return height * width;
	}

}
