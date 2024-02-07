package custom_Exception_Checked_Exception;



class InvalidAgeException extends Exception{
	

	public InvalidAgeException(String message) {
		super(message);
	}
}
public class Main {
	
	static void validate(int age) throws InvalidAgeException {
		if(age < 21) {
			throw new InvalidAgeException("age is not valid");
		}
		else {
		System.out.println("age is valid!");	
		}
	}
	public static void main(String[] args) {
		
		try {
			validate(20);
		}catch(InvalidAgeException e) {
			System.out.println("The InvalidAgeException is cought!");
		}
		System.out.println("the normal flow");

	}

}
