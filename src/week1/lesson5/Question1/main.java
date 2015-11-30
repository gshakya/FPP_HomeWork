package week1.lesson5.Question1;

import java.time.LocalDate;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeptEmployee[] Employees = { new Professor("Gunjan", LocalDate.now().minusMonths(24), 5000, 10),
				new Professor("Prabhat", LocalDate.now().minusMonths(12), 3000, 5),
				new Professor("Bimal", LocalDate.now().minusMonths(12), 3000, 6),
				new Secretary("Govinda", LocalDate.now().minusMonths(5), 2000, 4),
				new Secretary("Madan", LocalDate.now().minusMonths(5), 2000, 4) };

		double profSalarySum = 0;
		double sectSalarySum = 0;
		double totalSalarySum = 0;
		for (DeptEmployee d : Employees) {
			if (d instanceof Professor)
				profSalarySum = profSalarySum + d.computeSalary();
			if (d instanceof Secretary)
				sectSalarySum = sectSalarySum + d.computeSalary();
			totalSalarySum = totalSalarySum + d.computeSalary();
		}

		System.out.println("P. Sum Salary of all Professors");
		System.out.println("S. Sum Salary of all Secretary");
		System.out.println("Y. Sum Salary of all Employees");
		System.out.println("E. Exit");
		String selection;
		Scanner in = new Scanner(System.in);
		do {

			System.out.printf("Enter Options Mentioned Above: ");
			selection = in.next();

			switch (selection) {
			case "P":
				System.out.println("Sum of Salaries of Professor: " + profSalarySum);
				break;
			case "S":
				System.out.println("Sum of Salaries of Secretary: " + sectSalarySum);
				break;
			case "Y":
				System.out.println("Sum of Salaries of all Employees: " + totalSalarySum);
				break;
			case "E":
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid Option Type Again");
				break;
			}
		} while (!selection.equals("E"));
		in.close();
	}

}
