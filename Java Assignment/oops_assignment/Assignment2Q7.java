package oops_assignment;

import java.util.Scanner;

/*
 * Q7. Develop an application for Dessert shop. The application should allow owner to add items like Candy, Cookie or Ice Cream in the shop storage. Also customers should be able to place an order.

DessertItem is an abstract class having an abstract method getCost(). Every dessert item has tax associated. Candy item is sold in dollar currency, Cookie in Euro currency & Ice Cream in Rupees currency. The sub classes are supposed to override these methods. When we run the application, it should ask us our role i.e. owner or customer. If role is owner, we should be able to add dessert items in our storage. If role is customer, then we should be able to place an order. The currency conversion rates are:

1 dollar = 60 rupees.

1 euro = 70 rupees.
 */

abstract class DesertItem {

	abstract public int getCost();
}

class Candy extends DesertItem {
	public int addCandies(int candies) {
		return candies;
	}

	@Override
	public int getCost() {
		return 20 + 60;
	}
}

class Cookie extends DesertItem {
	public int addCookies(int candies) {
		return candies;
	}

	@Override
	public int getCost() {
		return 20 * +70;
	}
}

class IceCream extends DesertItem {
	public int addIceCreams(int candies) {
		return candies;
	}

	@Override
	public int getCost() {
		return 20;
	}
}

public class Assignment2Q7 {
	Scanner sc = new Scanner(System.in);

	private void selectRoles() {

		System.out.println("Enter your role Customer/Owner");
		String role = sc.next();
		roles(role);
	}

	private void roles(String role) {
		if (role.equalsIgnoreCase("owner")) {
			addItems();
		} else if (role.equalsIgnoreCase("customer")) {
			placeOrder();
		} else {
			System.out.println("invalid role");
		}
	}

	private void addItems() {
		System.out.println("Chose items");
		System.out.println("1. Candy \n2. Cookie \n3. Ice Cream \n4.Exit");
		int choice = sc.nextInt();
		addItemsOperation(choice);
	}

	private void addItemsOperation(int choice) {
		if (choice == 1) {
			Candy candy = new Candy();
			System.out.println("Enter the amount of candies you want");
			int numOfcandy = sc.nextInt();
			int totalCandy = candy.addCandies(numOfcandy);

			System.out.println(totalCandy + " candies are added");
			addItems();
		} else if (choice == 2) {
			Cookie cookie = new Cookie();
			System.out.println("Enter the amount of cookies you want");
			int numOfcookie = sc.nextInt();
			int totalCookie = cookie.addCookies(numOfcookie);

			System.out.println(totalCookie + " cookies are added");
			addItems();
		} else if (choice == 3) {
			IceCream iceCream = new IceCream();
			System.out.println("Enter the amount of Ice Cream you want");
			int numOfIceCream = sc.nextInt();
			int totalIceCream = iceCream.addIceCreams(numOfIceCream);

			System.out.println(totalIceCream + " Ice Creams are added");
			addItems();
		} else {
			System.exit(4);
		}
	}

	private void placeOrder() {
		System.out.println("Choose itmes to be placed :");
		System.out.println("1. Candy\n2. Cookie\n3. Ice Cream");
		System.out.println("Enter your choice: ");
		int ch;
		ch = sc.nextInt();
		placeOrderOperation(ch);
	}

	private void placeOrderOperation(int choice) {
		switch (choice) {
		case 1:
			Candy candy = new Candy();
			System.out.println("Enter the amount of candies to be placed ");
			int numOfcandy = sc.nextInt();
			int total = numOfcandy * candy.getCost();
			System.out.println("Candies placed succesfully and total cost is " + total);
			placeOrder();
			break;
		case 2:
			Cookie cookie = new Cookie();
			System.out.println("Enter the amount of cookies to be placed ");
			int numOfcookie = sc.nextInt();
			total = numOfcookie * cookie.getCost();
			System.out.println("Cookies placed succesfully and total  cost is " + total);
			placeOrder();
			break;
		case 3:
			IceCream iceCream = new IceCream();
			System.out.println("Enter the amount of Ice Cream to be added ");
			int numOfIceCream = sc.nextInt();
			total = numOfIceCream * iceCream.getCost();
			System.out.println("Ice Creams placed succesfully and total cost is : " + total);
			placeOrder();
		default:
			System.out.println("please enter valid number!");
			break;
		}
	}
	public static void main(String[] args) {
		Assignment2Q7 person = new Assignment2Q7();
		person.selectRoles();
	}

}
