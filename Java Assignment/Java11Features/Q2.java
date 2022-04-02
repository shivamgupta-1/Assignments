package Java11Features;
/*
 *  Java 11 supports var keyword for variable declarations. List the scenarios where var
keyword cannot be used for such variable declarations. Give reason in support of
your answer for each scenario. 
 */

import java.util.ArrayList;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		// cannont use var as Generic Type
		List<var> l1 =new ArrayList<>();
		
		//cannout use var without initializer
		 var a; //not allowed
		 
		 //cannot use var as instance and global variable declaration
		 public class Q2 {
				var a=5;
				public static void main(String[] args) {
					System.out.println(a);
				}
			}
		 //cannot use var for method parameter and return type
		 var method1() {
			 return " invalid ";
		}
		 var method2(var num) {
			 return num;
		 }

	}

}
