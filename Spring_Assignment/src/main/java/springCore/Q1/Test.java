package springCore.Q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("customerXml.xml");
		Customer customer1=(Customer) context.getBean("customer1");
		System.out.println(customer1.toString());
	}

}
