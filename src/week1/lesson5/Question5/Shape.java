package week1.lesson5.Question5;

public abstract class Shape {
	private String shapeName;
	public String getShapeName(){
		return shapeName;
	}
	public abstract double computeArea();
	public abstract double computePerimeter();
	public abstract void readShapeDate();
	
	public void setShapeName(String shapeName){
		this.shapeName=shapeName;
	}
	
	@Override
	public String toString() {
		return  shapeName;
	}
	
	
}
