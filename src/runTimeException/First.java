package runTimeException;

public class First {

	
	public static void main(String[] args) {
		
	/*
	 *  line 1
	 *  line 2
	 *  line 3    
	 *  line 4
	 *  line 17 exception occor 
	 */
		
	/*  Arithmatic Exception
	 * int a = 23/0; System.out.println(a);
	 */
		
		
	/*
	 * this is a nullPointException
	 * String text = null; System.out.println(text.length());
	 */
		
		
	/* this shows ArrayIndexOutOfBoundsException
	 * int numbers[] = new int[7]; 
	 * numbers[9] = 58;
	 */

		
	/*
	 * NumberFormatException part of illegal exception.
	 * String text = "Text"; int number = Integer.parseInt(text);
	 */
		
		try {
		int value = 87/0;	
		System.out.println(value);
		}catch(Exception e) {
			System.out.println(e);
		
		}		
			System.out.println("rest of the code");
	}

}
