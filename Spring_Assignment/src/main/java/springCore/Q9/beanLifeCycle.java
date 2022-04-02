package springCore.Q9;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;


public class beanLifeCycle implements BeanFactoryAware {

	private BeanFactory beanFactory;
	
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void display() {
		System.out.println("name : " + getName() + " age : " + getAge());
	}
	
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory= beanFactory;
		
	}
	public void getMyBeanName() {
		beanLifeCycle myBeanName = beanFactory.getBean(beanLifeCycle.class);
		System.out.println(myBeanName);
	}

}
