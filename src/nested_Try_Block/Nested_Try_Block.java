package nested_Try_Block;

public class Nested_Try_Block {

	public static void main(String[] args) {

		// Outer try block

		try {
			// first inner try block
			try {
				int number = 65 / 0;
				System.out.println(number);
			}
			// Catch block of the first inner try block
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				// Second inner try block
				int[] values = new int[6];
				values[7] = 54;
			}
			// catch block of the second inner try block
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("Another statement");

		}
		// Catch block of outer try block
		catch (Exception e) {
			System.out.println("Super type Exception in outer catch block. ");
		}
		System.out.println("rest of code");

	}

}
