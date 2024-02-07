package assignment1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		LibraryCatalog catalog = new LibraryCatalog();
		
		System.out.println("Library catalog system");
		System.out.println("Availiable books");
		for(int i = 0; i < catalog.bookTitles.length; i++) {
			System.out.println(i + 1 + ". " + catalog.bookTitles[i]);
		}
		while (true) {
			System.out.println("\nEnter the index to search for a book (0-" + (catalog.bookTitles.length-1) + "): ");
			int index = scan.nextInt();
			
			String result = catalog.searchBook(index);
			System.out.println("\n" + (result.startsWith("Error") ? result : "Book in index " + index + " : " + result));
			
			System.out.println("Do you want to search for another book? (yes/no): ");
			String continueSearch =scan.next();
			if(!continueSearch.equalsIgnoreCase("yes"));
			System.out.println("Exiting the program.");
			break;
		}

	}

}
