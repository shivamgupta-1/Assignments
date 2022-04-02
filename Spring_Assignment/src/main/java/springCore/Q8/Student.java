package springCore.Q8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Student implements InitializingBean, DisposableBean {


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

	public void destroy() throws Exception {
		System.out.println("Destroy bean method");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method");
	}

	@PostConstruct
	public void myInit() {
		System.out.println("MyInit method");
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("MyDestroy method");
	}

}
