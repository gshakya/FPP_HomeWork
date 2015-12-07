package week1.lesson5.Question4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter Details of Secretary \nEmployee Name: ");
		String empName = in.nextLine();
		System.out.print("\nEmployee ID: ");
		String empId = in.nextLine();
		System.out.print("\nEmployee SSN: ");
		String ssn = in.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		System.out.print("\nDate of Birth(MM-DD-YYYY): ");
		Date dob = sdf.parse(in.nextLine());
		System.out.print("\nEmployee Address: ");
		String address = in.nextLine();
		System.out.print("\nEnter Hours Worked in the month: ");
		int hrsWorked = in.nextInt();
		System.out.print("\nEnter Years worked: ");
		int yearsWorked = in.nextInt();

		Secretary s1 = new Secretary(empName, empId, ssn, dob, address, hrsWorked, yearsWorked);
		System.out.println(s1.getEmployeeDetails());
		System.out.println("Secretary Salary: "+s1.calculateSalary());
		
		System.out.print("Enter Details of Manager \nEmployee Name: ");
		empName = in.nextLine();
		System.out.print("\nEmployee ID: ");
		empId = in.nextLine();
		System.out.print("\nEmployee SSN: ");
		ssn = in.nextLine();
		sdf = new SimpleDateFormat("MM-dd-yyyy");
		System.out.print("\nDate of Birth(MM-DD-YYYY): ");
		dob = sdf.parse(in.nextLine());
		System.out.print("\nEmployee Address: ");
		address = in.nextLine();
		System.out.print("\nEnter Hours Worked in the month: ");
		hrsWorked = in.nextInt();
		System.out.print("\nEnter Years worked: ");
		yearsWorked = in.nextInt();

		Manager m1 = new Manager(empName, empId, ssn, dob, address, hrsWorked, yearsWorked);
		System.out.println(m1.getEmployeeDetails());
		System.out.println("Manager Salary: "+m1.calculateSalary());
		
		
	}

}
