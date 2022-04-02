package Generics;

import java.util.Date;

/*
 * 4) Design a class named Pair which has two properties. The name of the first property is key
and that of the second property is value. When designing the class take case of the following
scenarios:
a. Create an Object of Pair class to store String value for the property key and String
value for the property value. Restriction Apart from String type no other types should
be acceptable as Key or value input
e.g.
 myObj.setKey(“1”);
 myObj.setValue(“Hello”);
b. Create an object of the class Pair to store String value for the property key and
java.util.Date as value for the property value
myObj.setKey(“Today is”);
myObj.setValue(new java.util.Date());
Note: In scenario a. no data apart from String should be used for key and value, in scenario b.
no data apart from String for key and java.util.Date should be allowed
 */
class Pair {
	String key;
	String value;
	Date date = new Date();

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Pair(String key, Date date) {
		super();
		this.key = key;
		this.date = date;
	}

	public Pair(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

}
public class Q4 {
	public static void main(String[] args) {
		Pair pair = new Pair("Hello", "world");
		System.out.println(pair.getKey() + " " + pair.value);

		Pair pair2 = new Pair("Today date is:", new Date());
		System.out.println(pair2.getKey() + " " + pair2.getDate());

	}

}
