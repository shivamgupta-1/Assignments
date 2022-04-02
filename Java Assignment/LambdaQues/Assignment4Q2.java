package LambdaQues;
/*
 * Write an application using lambda expressions to print Orders having 2 criteria implemented: 1) order price more than 10000 2) order status is ACCEPTED or COMPLETED.

Description:

Write a program in such a way that it has a method which returns the list of orders satisfying the 2 conditions mentioned in the question.

Specifications:

import java.util.ArrayList;

public class Assignment4Q2 {

    private int totalPrice;
    private String status;

    public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {}
    public static void main(String[] args) {}
}
 */
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Assignment4Q2 {
	private int totalPrice;
	private String status;
	
	
	public Assignment4Q2(int totalPrice, String status) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
	}

	public static ArrayList<Assignment4Q2>listOfOrders(ArrayList<Assignment4Q2> orders){
		return orders.stream().filter(p->p.totalPrice>10000).filter(p->p.status.contains("ACCEPTED"|| "COMPLETED"));
	}

	public static void main(String[] args) {
		Assignment4Q2 arrList=new Assignment4Q2(1000, "Completed");
		Assignment4Q2 arrList2=new Assignment4Q2(8000, "Accepted");
		
		listOfOrders(arrList);
		listOfOrders(arrList2);
		
	}

}
