package oops_assignment;

import java.util.ArrayList;

/*
 * Q2. Write a program that describes the hierarchy of an organization. Here we need to write 3 classes Employee, Manager & Labour where Manager & Labour are the sub classes of the Employee. Manager has incentive & Labour has over time. Add the functionality to calculate total salary of all the employees. Use polymorphism i.e. method overriding.      

Description:-

Write a program to claculate the total salaries given to all the employees by an organization. In this organization there are employees category under which Manager and Labour are working where manager will recieve incentive and labourer will receive overtime benifits.
 */

class Manager extends Assignment2Q2 {
	@Override
	public int getSalary(int salary) {
		int incentive = 5000;
		return salary + incentive;
	}
}

class Labour extends Assignment2Q2 {

	public int getSalary(int salary) {
		int overtime = 500;

		return salary + overtime;
	}
}
public class Assignment2Q2 {
	int salary = 10000;

	public int getSalary(int salary) {
		return salary;
	}

	public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries) {

		int salary = 0;

		for (Integer e : employeeSalaries) {
			salary = salary + e;
		}
		return salary;
	}
	public static void main(String[] args) {

		Assignment2Q2 ass = new Assignment2Q2();

		Assignment2Q2 labour1 = new Labour();
		int labour1Salary = labour1.getSalary(ass.salary);
		System.out.println(labour1Salary);

		Assignment2Q2 manager1 = new Manager();
		int manger1Salary = manager1.getSalary(ass.salary);
		System.out.println(manger1Salary);

		ArrayList<Integer> employeeSalaries = new ArrayList<Integer>();
		employeeSalaries.add(labour1Salary);
		employeeSalaries.add(manger1Salary);
		System.out.println(ass.totalEmployeesSalary(employeeSalaries));

	}

}
