package Collectionques;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

class Product{
	int ProductId;
	String ProductName;
	public Product(int ProductId,String ProductName){
		super();
		this.ProductId=ProductId;
		this.ProductName=ProductName;
	}
	public int getProductId() {
		return ProductId;
	}

	public String getProductName() {
		return ProductName;
	}
	
}
public class ProductList {



	

	public static void main(String[] args) {
		Product Product1=new Product(1,"Shampoo");
		Product Product2=new Product(2,"Shampoo");
		Product Product3=new Product(3,"Shampoo");
		Product Product4=new Product(4,"Shampoo");
		Product Product5=new Product(5,"Shampoo");
		Product Product6=new Product(6,"Shampoo");
		Product Product7=new Product(7,"Shampoo");
		Product Product8=new Product(8,"Shampoo");
		Product Product9=new Product(9,"Shampoo");
		Product Product10=new Product(10,"Shampoo");
		
		HashSet<Product> productTree=new HashSet<>();
 productTree.add(Product1);
 productTree.add(Product2);
 productTree.add(Product3);
 productTree.add(Product4);
 productTree.add(Product5);
 productTree.add(Product6);
 productTree.add(Product7);
 productTree.add(Product8);
 productTree.add(Product9);
 productTree.add(Product10);
 productTree.add(Product5);// repeated product
 productTree.add(Product6);// repeated product
 for( Product p:productTree) {
	 System.out.println(p.ProductId+" " +p.ProductName);;
 }
		
		

	}

}
