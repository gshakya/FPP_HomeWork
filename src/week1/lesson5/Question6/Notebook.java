package week1.lesson5.Question6;

public class Notebook extends Computer implements Cloneable {
	

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
	
	@Override
	public int hashCode() {
		final int prime = 11;
		int result = 1;
		result = result+super.hashCode();
		
		result = prime * result + (new Double(height)).hashCode();
		result = prime * result + (new Double (width)).hashCode();
		result = prime * result + (new Double (weight)).hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notebook other = (Notebook) obj;
		if (!Double.toString(height).equals(Double.toString(other.height)))
			return false;
		if (!Double.toString(weight).equals(Double.toString(other.weight)))
			return false;
		if (!Double.toString(width).equals(Double.toString(other.width)))
			return false;
		return true;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Notebook clone=(Notebook)super.clone();
		return clone;
	}

}
