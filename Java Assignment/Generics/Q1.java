package Generics;

import java.util.HashSet;
import java.util.Set;
class Employee{
	int id;
	String name;
	double Salary;
	String department;
	
	
		
		
		
		public Employee(int id, String name, double salary, String department) {
		
		this.id = id;
		this.name = name;
		this.Salary = salary;
		this.department = department;
	}





		public void displayDetails() {
			System.out.println("Employee [id=" + id + ", name=" + name + ", department=" + department + "]");
		}
		
		
		
	}

public class Q1 {
	

	public static void main(String[] args) {
		
		 Employee emp4= new Employee(1, "Shivam", 9000, "Tech"); 
		 Employee emp2= new Employee(2, "shivam4", 60000, "Admin");
		 Employee emp3= new Employee(3, "shivam5", 70000, "Q&A");
		 HashSet<Employee> emp= new HashSet<Employee>();
		 emp.add(emp4);
		 emp.add(emp2);
		 emp.add(emp3);
		 for(Employee e:emp) {
			 e.displayDetails();
		 }
		 
		 
	}

}
