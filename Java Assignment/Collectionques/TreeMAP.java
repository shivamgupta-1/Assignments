package Collectionques;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import Collectionques.Contact.Gender;
import StringAssignment.AddToString;

class Contact{
	long PhoneNumber;
	String Name;
	String Email;
	Gender gender;
	enum Gender{
		MALE,
		FEMALE;
	}
	public Contact() {
		this.Email=Email;
		this.gender=gender;
		this.Name=Name;
		this.PhoneNumber=PhoneNumber;
	}
	
	
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public Gender getGender() {
		return gender;
	}
	public String toString() {
		return "Contact[PhoneNumber="+ PhoneNumber + ", Name=" +Name+ ", Email=" + Email + ", Gender=" +gender +"]";
		
	}
	
	
}
 

public class TreeMAP {

	public static void main(String[] args) {
		 Contact.Gender m=Contact.Gender.MALE;
         Contact.Gender f=Contact.Gender.FEMALE;
		Contact contact =new Contact();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Email");
		contact.Email= sc.next();
		System.out.println("Enter the Gender");
		String gen=sc.next();
		contact.gender= Gender.valueOf(gen.toUpperCase());
		
		System.out.println("Enter the Name");
		contact.Name=sc.next()	;
		System.out.println("Enter the Phone Number");
		contact.PhoneNumber=sc.nextLong();
		System.out.println("_____________");
		Contact contact2 =new Contact();
		System.out.println("Enter the Email");
		contact2.Email= sc.next();
		System.out.println("Enter the Gender");
		String gen2=sc.next();
		contact2.gender= Gender.valueOf(gen2.toUpperCase());
		System.out.println("Enter the Name");
		contact2.Name=sc.next()	;
		System.out.println("Enter the Phone Number");
		contact2.PhoneNumber=sc.nextLong();
		
		TreeMap<Long, Contact> treeMap=new TreeMap<>(Collections.reverseOrder());
		treeMap.put( contact.PhoneNumber, contact);
		treeMap.put( contact2.PhoneNumber, contact2);
		System.out.println("_____________");
		System.out.println(treeMap.keySet());
		System.out.println("_____________");
		for (Entry<Long, Contact> entry : treeMap.entrySet()) {
		    
		    Contact value = entry.getValue();

		    System.out.println( value);
		}
		System.out.println("_____________");
		
		for(Entry<Long,Contact> entry:treeMap.entrySet()) {
			System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
		}
		
	}

}

