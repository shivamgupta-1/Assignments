package springCore.Q8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("q8.xml");

		context.registerShutdownHook();

		Student student = (Student) context.getBean("student");
		student.display();

		System.out.println("**********************");

		Student student2 = (Student) context.getBean("student2");
		student2.display();

	}

}
