package Collectionques;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * 4)	Given a LinkedList of Objects representing date of birth’s (use any inbuild java class to represent date), print the date’s along with the message: Your date of Birth is DD-MM-YYYY, and it (was or was not) a leap year.
E.g.
a)     For the date 23-12-2000 
Your date of birth is 23-12-2000 and it was a leap year

 */

public class DateQues {
	static boolean IsLeap(String str) {
	String[] arr=str.split("-");
	int year=Integer.parseInt(arr[2]);
	if(year %4 ==0) {
		if(year%100==0) {
			if(year%400==0) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return true;
		}
		
	}
	else {
		return false;
	}
	}

	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		list.add("20-9-2000");
		list.add("5-5-1988");
		list.add("10-7-1999");
		ListIterator<String> it=list.listIterator(list.size());
		while(it.hasPrevious()) {
			String str=it.previous();
		if(IsLeap(str)) {
			System.out.println("Your date of birth is "+str+"and it was a leap year");
		}
		else {
			System.out.println("Your date of birth is "+str+"and it was not a leap year");
		}
		}
	}

}
