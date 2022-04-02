package springCore.Q6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("q6.xml");
		Dbconfiguration dbconfiguration = (Dbconfiguration) context.getBean(Dbconfiguration.class);
		dbconfiguration.Dbconfiguration();
	}

}
