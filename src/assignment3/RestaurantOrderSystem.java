package assignment3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RestaurantOrderSystem {

	public static void main(String[] args) {
		
		ArrayList<MenuItem> itemList = new ArrayList<>();
		
		itemList.add(new MenuItem("Burger", 5.99));
		itemList.add(new MenuItem("Pizza", 7.99));
		itemList.add(new MenuItem("Salad", 4.49));
		itemList.add(new MenuItem("Fries", 2.49));
		itemList.add(new MenuItem("Soda", 1.99));
		
		Scanner scan = new Scanner(System.in);
		ArrayList<MenuItem> order = new ArrayList<>();
		ArrayList<Integer> quantities = new ArrayList<>();
		
		double totalBill = 0.0;
		while (true) {
			 System.out.println("Restaurant Order System Menu:");
	            System.out.println("1. View Menu and Prices");
	            System.out.println("2. Place an Order");
	            System.out.println("3. Calculate Total Bill");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            try {
	            	
	            	int choice = scan.nextInt();
	                switch (choice) {
	                    case 1:
	                        viewMenu(itemList);
	                        break;
	                    case 2:
	                        placeOrder(scan, itemList, order, quantities);
	                        break;
	                    case 3:
	                        totalBill = calculateTotalBill(order, quantities);
	                        System.out.println("Total Bill: $" + totalBill);
	                        break;
	                    case 4:
	                        System.out.println("Thank you for using the Restaurant Order System!");
	                        return;
	                    default:
	                        System.out.println("Invalid choice. Please enter a valid option.");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Invalid input. Please enter a valid number.");
	                scan.next(); // Clear the input buffer
	            }
	        }
	    }
	    private static void viewMenu(List<MenuItem> menu) {
	        System.out.println("Menu and Prices:");
	        for (int i = 0; i < menu.size(); i++) {
	            MenuItem item = menu.get(i);
	            System.out.println((i + 1) + ". " + item.getName() + " - $" +
	                    item.getPrice());
	        }
	    }
	    private static void placeOrder(
	            Scanner scanner, List<MenuItem> menu, List<MenuItem> order, List<Integer>
	            quantities) {
	        System.out.println("Select items from the menu by entering their numbers (1 to " + menu.size() + ").");
	        System.out.println("Enter 0 to finish your order.");
	        int itemNumber;
	        int quantity;
	        while (true) {
	            System.out.print("Enter item number (0 to finish): ");
	            itemNumber = scanner.nextInt();
	            if (itemNumber == 0) {
	                break;
	            }
	            if (itemNumber < 1 || itemNumber > menu.size()) {
	                System.out.println("Invalid menu item number. Please enter a valid number.");
	                continue;
	            }
	            System.out.print("Enter quantity: ");
	            quantity = scanner.nextInt();
	            if (quantity < 1) {
	                System.out.println("Invalid quantity. Please enter a positive number.");
	                continue;
	            }
	            MenuItem selectedItem = menu.get(itemNumber - 1);
	            order.add(selectedItem);
	            quantities.add(quantity);
	            System.out.println(quantity + " " + selectedItem.getName() + "(s) added to your order.");
	        }
	    }
	    private static double calculateTotalBill(List<MenuItem> order, List<Integer>
	            quantities) {
	        double total = 0.0;
	        for (int i = 0; i < order.size(); i++) {
	            MenuItem item = order.get(i);
	            int quantity = quantities.get(i);
	            total += item.getPrice() * quantity;
	        }
	        return total;
	    }
	}


