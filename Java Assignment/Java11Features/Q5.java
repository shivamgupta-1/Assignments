package Java11Features;
/*
 * Write a program with menu to accept the price of certain items and display their total.

When user selects Option 1: should accept the prices of different products and insert
these prices into first file (each amount to be inserted in a newline in the file). Next,
total of these values should be saved in a new file. Option 2: should allow the user to
view the total of these prices from the second file. 

 */

import java.awt.Choice;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q5 {
	int price;
	int Total=0;
	String priceFile="C:\\Users\\ARROW\\Downloads\\price.txt";
	String totalpriceFile="C:\\Users\\ARROW\\Downloads\\totalprice.txt";
	
	public  void addPrice(int price) {
		try {
			Files.writeString(Path.of(priceFile), price +"\n",StandardOpenOption.APPEND);
			System.out.println("Price has been saved to file");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Total+=price;
	}
	public int displayTotal()
	{
		try {
			String totalFile=Files.readString(Path.of(priceFile));
			List<String> listOfprice=totalFile.lines().collect(Collectors.toList());
			List<Integer> arrListPrice=listOfprice.stream().map(s-> Integer.parseInt(s)).collect(Collectors.toList());
			for(Integer i:arrListPrice) {
				Total+=i;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Total;
	}
	public static void main(String[] args) {
		Q5 priceList=new Q5();
		Scanner sc=new Scanner(System.in);
		

		System.out.println("Select your Option \n1: Insert New Price \n2: View Purchase Total \n3: Exit");
		int opt= sc.nextInt();
		String choice;
		switch (opt) {
		case 1: {
			int count=0;
			do {
			System.out.println("Insert" +(count+1)+"price");
			count++;
			int price=sc.nextInt();
			priceList.addPrice(price);
			System.out.println("Do you want to enter price for more items ?(Yes/No)");
			 choice=sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
		break;
		}
		
		case 2:{
			
			System.out.println("Total Price of all items is:"+priceList.displayTotal());
			break;
		}
		case 3:{
			System.exit(0);
		}
		default:
			System.out.println("Choice valid option");
		}
		
	}

}
