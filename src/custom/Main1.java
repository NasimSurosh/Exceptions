package custom;

class InvalidAgeException extends Exception{
	
}
public class Main1 {

	public static void main(String[] args) {
		
		try {
			throw new InvalidAgeException();
		}catch(InvalidAgeException e) {
			System.out.println("Catch block of InvalidAgeException.");
			System.out.println(e.getMessage());
		}
		System.out.println("Normal flow...");
	}

}
