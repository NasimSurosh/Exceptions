package assignment;

import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Inventory inven = new Inventory();
		
		
		System.out.println("Products in inventory");
		

		while(true) {
			System.out.println("1. Add product");
			System.out.println("2. Get product details");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter product ID");
			int productId = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter product name");
			String productName = scan.nextLine();
			System.out.println("Enter product price");
			double productPrice = scan.nextDouble();
			
			Product product = new Product(productId, productName, productPrice);
			inven.addProduct(product);
			break;
			
		  case 2:
              System.out.print("Enter Product ID: ");
              int id = scan.nextInt();
              String productDetails = inven.getProductDetails(id);
              System.out.println("Product Details:" + productDetails);
              break;
		  case 3:
			  System.out.println("Exiting the program");
			  System.exit(0);

          default:
              System.out.println("Invalid choice. Please try again.");
              break;
		}
		scan.close();
		}
		
	
		
		
	}

}
