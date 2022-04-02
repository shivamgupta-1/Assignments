package springCore.Q10;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("q10.xml");
		ApplicationContextExample blf = (ApplicationContextExample) context.getBean("lifecyclebean2");
		blf.setApplicationContext(context);
		blf.display();

		context.registerShutdownHook();

	}

}
