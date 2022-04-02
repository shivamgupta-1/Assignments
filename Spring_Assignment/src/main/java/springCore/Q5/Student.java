package springCore.Q5;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Required;


public class Student {

	private String name;
	private int age;
	
	
	// @Resource(name = "schoolId") // using resource annotation
	@Inject

	private School school;

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public School getSchool() {
		return school;
	}


	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school.toString() + "]";
	}
	
	
	
	


}
