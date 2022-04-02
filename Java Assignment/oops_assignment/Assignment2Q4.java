package oops_assignment;

/*
 * 4. Test the following principles of an abstract class:

• If any class has any of its method abstract then you must declare entire class abstract.

• Abstract class cannot be instantiated.

• When we extend an abstract class, we must either override all the abstract methods in sub class or declare subclass as abstract.

• Abstract class cannot be private.

• Abstract class cannot be final.

• You can declare a class abstract without having any abstract method.

Description:-

Write a program in such a way that all the conditions above for abstract class should satisfy.
 */

public class Assignment2Q4 {


	public static void main(String[] args) {
		checkAbstract2 css = new checkAbstract2(); // cannot instantiate the abctract class

	}
}

// we can declare a class abstract without having any abstract method
abstract class basic {
	int a;

}

// class should be also abstract  if it has one or more abstract method

// abstact class cannot be private
// abstract class cannot be final
private final class checkAbstract {

	abstract void printAbstract();

}

// both should be abstract method and class
abstract class checkAbstract2 {

	abstract void printAbstract();

}

class checkAbstractAgain extends checkAbstract2 {

	// we extend an abstract class, we must either override all the abstract methods
	// in sub class or declare subclass as abstract.
	@Override
	void printAbstract() {

	}

}
