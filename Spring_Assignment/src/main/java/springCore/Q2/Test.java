package springCore.Q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("questions.xml");
		Question question1= (Question) context.getBean("question1");
		question1.displayA1();
		question1.displayA2();
		question1.displayA3();
	}

}
