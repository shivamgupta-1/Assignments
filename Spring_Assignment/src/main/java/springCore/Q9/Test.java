package springCore.Q9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("q9.xml");
		beanLifeCycle blf = (beanLifeCycle) context.getBean("lifecyclebean");
		blf.display();
		blf.getMyBeanName();
		context.registerShutdownHook();

	}

}
