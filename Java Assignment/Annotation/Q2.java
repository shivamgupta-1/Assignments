package Annotation;

/*
 * Build a custom annotation called @Info, which can be used by developers on a class, a
property, or a method. The developer can provide the following information when using this
annotation:
a) AuthorID: <<Developers ID>> - (Mandatory Input)
b) Author: <<Developers name>> - (Optional Input)
c) Supervisor: <<Developers Supervisor>> - (Optional Input)
d) Date: <<”String Date”>> - (Mandatory Input)
e) Time: <<”String Time”>> - (Mandatory Input)
f) Version: <<Numerical Version >> - (Mandatory Input)
g) Description: <<Description of the class, method, or property >> - (Optional Input) 

 */
@interface Info {
	int AuthorId();

	String Author() default "shivam";

	String Supervisor() default "amit";

	String date();

	String time();

	double version();

	String description() default "java annotation assignment";

}

@Info(AuthorId = 19, Author = "Shivam", Supervisor = "Amit", date = "27 feb", time = "8:00", version = 93.5, description = "assignment")
class ClassTest2 {
	@Info(AuthorId = 24, Author = "anuj", Supervisor = "Amit", date = "28 feb", time = "9:00", version = 94.5, description = "assignment")
	public void display() {
		System.out.println("Annotated");
	}
}

public class Q2 {

	public static void main(String[] args) {

		ClassTest2 ct = new ClassTest2();
		ct.display();
	}

}
