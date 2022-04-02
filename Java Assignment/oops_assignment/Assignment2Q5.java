package oops_assignment;

/*
 * Q5. Write the classes Line, Rectangle, Cube etc. & make the Shape as their base class. Add an abstract draw() method in the class Shape & draw all shapes.

Description:-

Write a java class named Shape which has abstract draw() and also classes Line, Rectangle, Cube etc. extends Shape to implement the draw method.
 */

class Rectangle5 extends Shape5 {
	@Override
	public String draw() {
		return "Rectangle is drawn";
	}
}

class Line5 extends Shape5 {
	@Override
	public String draw() {
		return "Line is drawn";
	}
}

class Cube5 extends Shape5 {
	@Override
	public String draw() {
		return "Cube is drawn";
	}
}

abstract class Shape5 {
	abstract public String draw();
}
public class Assignment2Q5 {

	public static void main(String[] args) {
		Cube5 cube = new Cube5();
		Rectangle5 rectangle = new Rectangle5();
		Line5 line = new Line5();

		System.out.println(cube.draw());
		System.out.println(rectangle.draw());
		System.out.println(line.draw());
	}

}
