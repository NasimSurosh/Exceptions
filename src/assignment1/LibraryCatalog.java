package assignment1;

public class LibraryCatalog {

	public String[] bookTitles;

	public 	LibraryCatalog() {
		bookTitles = new String[] {"Book1","Book2","Book3"};
	}
	public String searchBook(int index) {
		try {
			if(index >= 0 && index < bookTitles.length) {
				return bookTitles[index];
			}else {
				throw new ArrayIndexOutOfBoundsException("Invalid index. Please enter a valid index ( 0-" + (bookTitles.length-1) + " ).");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			return "error: " + e.getMessage();
		}
	}
}
