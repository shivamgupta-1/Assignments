package Generics;
/*
 * 2) Write an application to hold 10 random int values as keys and 10 random double values as
values for a HashMap. Print the data store in the HashMap. Note: Keys can only be int and
values double 
 */

import java.util.HashMap;
import java.util.Random;

public class Q2 {

	public static void main(String[] args) {
		
		HashMap<Integer, Double> hashmap= new HashMap<Integer, Double>();
		
		Random random = new Random();
		for(int i=0;i<10;i++) {
			hashmap.put((i + 1) * random.nextInt(), (i + 1) * random.nextDouble());
		}
		hashmap.forEach((k, v) -> System.out.println("key = " + k + " value = " + v));
		;
	}

}
