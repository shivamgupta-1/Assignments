package Collectionques;
/*
 * 3)	Store at least 10 Employee Objects in an TreeSet<Employee>. When the application runs the user should be asked to select one of the options upon which you will print the employee details in a sorted manner.
For E.g.
Run Application:
a)	ID
b)	Name
c)	Department
d)	Salary
Your choice: b
<Should print all the employee’s details sorted by name>

 */

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
 class Employee implements Comparable<Employee>{
public	Integer ID;
public	String Name;
public	String Department;
public	Double Salary;
	
	
	
	
	public Employee(Integer iD, String name, String department, Double Salary) {
		super();
		this.ID = iD;
		this.Name = name;
		this.Department = department;
		this.Salary = Salary;
	}




	public Integer getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	public String getDepartment() {
		return Department;
	}

	public Double getSalary() {
		return Salary;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name + ", Department=" + Department + ", Salary=" + Salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.getID().compareTo(o.getID());
			
		
	}
	
}
 class SortById implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getID().compareTo(o2.getID());
	}
	 
 }
 class SortByName implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
		 
	 }
 class SortByDepartment implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getDepartment().compareTo(o2.getDepartment());
		}
		 
	 }
 class SortBySalary implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getSalary().compareTo(o2.getSalary());
		}
		 
	 }
public class EmployeeSortedList {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(1, "Shivam", "admin",  50000.0);
		Employee emp2=new Employee(7, "Ashish", "QA", 60000.0);
		Employee emp3=new Employee(5, "Anuj", "fees", 70000.0);
		Employee emp4=new Employee(6, "Shreyash", "admin", 45000.0);
		
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Chose your sorting field");
		System.out.println("1)ID \n2)Name \n3)Department \n4)Salary" );

		int input=sc.nextInt();
		switch (input) {
		case 1-> {
			Set<Employee> emp = new TreeSet<Employee>(new SortById());
            emp.add(emp1);
            emp.add(emp2);
            emp.add(emp3);
            emp.add(emp4);

            for(Employee e : emp){
                System.out.println(e);
            }
            break;
			
			}
		
			case 2-> {
				 Set<Employee> empA = new TreeSet<Employee>(new SortByName());
	                empA.add(emp1);
	                empA.add(emp2);
	                empA.add(emp3);
	                empA.add(emp4);

	                for(Employee e : empA){
	                    System.out.println(e);
	                }
	                break;
			
			
		}
			case 3-> {
				
				Set<Employee> empB = new TreeSet<Employee>(new SortByDepartment());
                empB.add(emp1);
                empB.add(emp2);
                empB.add(emp3);
                empB.add(emp4);

                for(Employee e : empB){
                    System.out.println(e);
                }
                break;
			}
			case 4-> {
				Set<Employee> empC = new TreeSet<Employee>(new SortBySalary());
                empC.add(emp1);
                empC.add(emp2);
                empC.add(emp3);
                empC.add(emp4);

                for(Employee e : empC){
                    System.out.println(e);
				  
			}
		
		
		
	}

	}
	}
	}



