package week1.lesson5.Question1;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {

	private int overTimeHours;

	public Secretary(String name, LocalDate hiringDate, double salary, int overTimeHours) {
		super(name, hiringDate, salary);
		this.overTimeHours = overTimeHours;
	}

	public int getOverTimeHours() {
		return overTimeHours;
	}

	public void setOverTimeHours(int overTimeHours) {
		this.overTimeHours = overTimeHours;
	}

	@Override
	public double computeSalary() {
		return super.computeSalary() + (12 * overTimeHours);

	}
}
