package multi_Catch_Block;

public class Multi_Cath_Block {

	public static void main(String[] args) {
		
		try {
			int number[] = new int[6];
			number[6] = 43/0;
			
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException is thrown");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException is thrown");
		}catch(Exception e) {
			System.out.println("Super type exception thrown");
			
		}
		System.out.println("The rest of code");

	}

}
