/**
* ArrayList provides dynamic arrays in Java
* ArrayList inherits AbstractList class and implements List interface.
* ArrayList is initialized by a size, however the size can increase if collection grows or shrunk if objects are removed from the collection.
* Java ArrayList allows us to randomly access the list.
* ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases
* ArrayList in Java can be seen as similar to�vector in C++.

*/
package collections;

import java.util.ArrayList;
import java.util.Iterator;

class ArrayListDemo {

	 class Product{
		
		int productId;
		String productName;
		double price;
		
		Product()
		{}
		
		 Product(int productId, String productName, double price)
		{
			this.productId = productId;
			this.productName = productName;
			this.price = price;
		}
		
		void setProductId(int productId)
		{
			this.productId = productId;
		}
		
		int getProductId() {
			return this.productId;
		}
		
		void setProductName(String productName)
		{
			this.productName = productName;
		}
		
		String getProductName() {
			return this.productName;
		}
		
		void setPrice(double price)
		{this.price = price;}
		
		double getPrice() {
			return this.price;
		}
		
	}
	
	public static void main(String args[])
	{
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayListDemo ald = new ArrayListDemo();
		ArrayListDemo.Product p;
		//Product p1;
		
		p = ald.new Product(1,"Chairs",125);
		productList.add(p);
		
		p = ald.new Product(2,"Tables",100);
		productList.add(p);
		
		p = ald.new Product(3,"Showcase",10);
		productList.add(p);
		
		for(Product i:productList)
		{
			System.out.println("Product Id : " + i.getProductId());
			System.out.println("Product Name : " + i.getProductName());
			System.out.println("Product Price : " + i.getPrice());
			System.out.println("===================================");
		}
		
		Iterator<?> itr=productList.iterator();  
		  while(itr.hasNext()){ 
			 
			    Product pItr = (Product)itr.next();		    
				System.out.println("Product Id : " + pItr.getProductId());
				System.out.println("Product Name : " + pItr.getProductName());
				System.out.println("Product Price : " + pItr.getPrice());
				System.out.println("==================================="); 
		  }  
	}
	
}
