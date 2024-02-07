package nested_try_Block2;

public class Nested_try_Block2 {

	public static void main(String[] args) {
		
		// Outer try block
		try {
			// first inner try block
			try {
				// second inner try block
				try {
					int number[] = {1,3,5,7};
					System.out.println(number[5]);
				}
				catch(ArithmeticException e) {
					System.out.println("ArithmeticException (second inner try block)");
				}
			}
			catch(ArithmeticException e) {
				System.out.println("ArithmeticException (first inner try block)");
			}
		}
		catch(Exception e) {
			System.out.println("Super type Exception (outer try block)");
		}


	}

}
