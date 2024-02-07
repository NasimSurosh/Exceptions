package illegalTypeException;

import java.util.Scanner;


public class PassWdValidator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Password validator");
		System.out.println("Enter password");

		String passwd = scan.nextLine();
		scan.close();

		try {
			validatePassword(passwd);
			System.out.println("Password is valid.");
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

	public static void validatePassword(String passwd) {
		if (passwd.length() < 8) {
			throw new IllegalArgumentException("Password must be at least 8 charactor long.");
		}
	}

}
