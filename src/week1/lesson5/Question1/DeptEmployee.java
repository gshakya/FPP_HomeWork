package week1.lesson5.Question1;

import java.time.LocalDate;

public class DeptEmployee {
	private String name;
	private LocalDate hiringDate;
	private double salary;

	public DeptEmployee(String name, LocalDate hiringDate, double salary) {
		this.name = name;
		this.hiringDate = hiringDate;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHiringDate() {
		return hiringDate;
	}

	public void setHiringDate(LocalDate hiringDate) {
		this.hiringDate = hiringDate;
	}

	public double computeSalary() {
		return salary;
	}
}
