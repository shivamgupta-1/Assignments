package springCore.Q5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("q5.xml");
		Student student = (Student) context.getBean("student");

		System.out.println(student.toString());
	}

}
