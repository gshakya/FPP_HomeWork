package week1.lesson4.Question1;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
	
	

	private int numberOfPublication;
	
	public Professor(String name, LocalDate hiringDate, double salary , int numberOfPublication) {
		super(name, hiringDate, salary);
		this.numberOfPublication=numberOfPublication;
	}
	public int getNumberOfPublication() {
		return numberOfPublication;
	}

	public void setNumberOfPublication(int numberOfPublication) {
		this.numberOfPublication = numberOfPublication;
	}
	
}
