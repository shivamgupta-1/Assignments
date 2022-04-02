package oops_assignment;

/*
 * Q6. Write an abstract class ‘Persistence’ along with two sub classes ‘FilePersistence’ & ‘DatabasePersistence’. The base class with have an abstract method persist() which will be overridden by its sub classes. Write a client who gets the Persistence object at runtime & invokes persist() method on it without knowing whether data is being saved in File or in Database.

Description:-

Write a program having an abstract class "Persistence" which have two child classes "FilePersistence","DatabasePersistence".The base class will have a persist() method and it is overridden by sub classes.wite a seperate class of client which will get persistence object and invoke persist method on it.(Polymorphism)
 */

abstract class Persistence {
	abstract public String persist();
}

class FilePersistence extends Persistence {
	@Override
	public String persist() {
		return "file persistence";
	}
}

class DatabasePersistence extends Persistence {
	@Override
	public String persist() {
		return "database Persistence";
	}
}

class Client {
	Persistence per1 = new FilePersistence();
	Persistence per2 = new DatabasePersistence();

	public void getClient() {
		System.out.println(per1.persist());
		System.out.println(per2.persist());
	}
}

public class Assignment2Q6 {

	public static void main(String[] args) {
		
		Client client=  new Client();
		client.getClient();
			

}
}
