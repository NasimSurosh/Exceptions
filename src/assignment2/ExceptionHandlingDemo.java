package assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {

			System.out.println("Enter your age");
			int age = scan.nextInt();
			System.out.println("Entered age is: " + age);

			System.out.println("Enter a whole number to divide");
			int a = scan.nextInt();
			System.out.println("Enter a whole number divide by");
			int b = scan.nextInt();
			int result = a / b;
			System.out.println("The result is " + result);

			System.out.println("Enter the size of array");
			int arraySize = scan.nextInt();

			int[] arrayOfInt = new int[arraySize];
			for (int count = 0; count < arraySize; count++) {
				arrayOfInt[count] = scan.nextInt();
			}
			System.out.println("write an index to display");
			int userIndex = scan.nextInt();
			System.out.println("user index is: " + userIndex);
			System.out.println("The result is: " + arrayOfInt[userIndex]);

		} catch (InputMismatchException e) {
			System.out.println("Input miss match");
		}

		catch (ArithmeticException e) {
			System.out.println("You connot a hole number divide by zero");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

		System.out.println("rest ocode");
	}

}
