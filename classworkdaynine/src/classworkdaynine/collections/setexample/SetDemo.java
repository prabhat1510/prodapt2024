package classworkdaynine.collections.setexample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Product prod1 = new Product(1,"iPhone XR",5,54000.00);
		Product prod2 = new Product(2,"iPhone 14",3,84000.00);
		Product prod3 = new Product(3,"iPhone 15",2,94000.00);
		Product prod4 = new Product(4,"iPhone XS",11,24000.00);
		
		Set<Product> productSet = new HashSet<Product>();
		productSet.add(prod3);
		productSet.add(prod4);
		productSet.add(prod4);
		productSet.add(prod1);
		productSet.add(prod2);
		System.out.println(productSet);
		productSet.forEach(System.out::println);
		System.out.println("********************************************");
		for(Product prod : productSet) {
			if(prod.getProductId() == 4) {
				prod.setQuantity(6);
				
			}
		}
		System.out.println("********************************************");
		productSet.forEach(System.out::println);
		
		Set<Product> prodSet = new LinkedHashSet<Product>();
		prodSet.add(prod3);
		prodSet.add(prod2);
		prodSet.add(prod4);
		prodSet.add(prod1);
		System.out.println("********************************************");
		prodSet.forEach(System.out::println);
	
	}

}
