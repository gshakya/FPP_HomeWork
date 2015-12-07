package week1.lesson5.Question4;

import java.util.Date;

public class Manager implements Employee {
	private String empName;
	private String empId;
	private String ssn;
	private Date dob;
	private String address;
	private int HrsWorked;
	private int yearsWorked;

	public Manager(String empName, String empId, String ssn, Date dob, String address, int hrsWorked, int yearsWorked) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.ssn = ssn;
		this.dob = dob;
		this.address = address;
		HrsWorked = hrsWorked;
		this.yearsWorked = yearsWorked;
	}

	@Override
	public String getEmployeeDetails() {
		String rtnString = "Employee Name: " + empName + "\nEmployeeId: " + empId + "\nSocial Security Number :" + ssn
				+ "\nDate of Birth: " + dob + "\nAddress: " + address;
		return rtnString;

	}

	@Override
	public double calculateSalary() {
		return ((2 * HrsWorked * BASESALARYPERHR) + 
				(HrsWorked > 150 ? (HrsWorked - 150) * EXTRAHRPERHR : 0));

	}

}
