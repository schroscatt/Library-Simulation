package books;
import librarymembers.LibraryMember;
/**
 * Represent the book registered to the library.
 */
public abstract class Book {
	/**
	 *represents the id of the book at the library.
	 */
	private int bookID;
	/**
	 *represents if the book is "handwritten" or "printed".
	 */
	private String bookType;
	/**
	 * isTaken represents if the book is taken by any library member currently.
	 */
	private boolean isTaken;
	/**
	 * represents the library member who has the book currently.
	 */
	private LibraryMember whoHas;
	/**
	 * The constructor of the book.
	 * @param bookID represents the id of the book at the library.
	 * @param bookType represents if the book is "handwritten" or "printed".
	 */
	
	public  Book(int bookID, String bookType){
		this.bookID = bookID;
		this.bookType = bookType;
	}
	/**
	 * Represents returning book action.
	 * @param member represents the member who is returning the book.
	 */
	
	public abstract void returnBook(LibraryMember member);
	/**
	 * @return the ID of the book.
	 */

	public int getBookID() {
		return bookID;
	}
	/**
	 * sets the ID of the book.
	 * @param bookID represents the ID of the book.
	 */

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	/**
	 * @return the type of the book.
	 */

	public String getBookType() {
		return bookType;
	}
	/**
	 * sets the type of the book
	 * @param bookType represents its type.
	 */

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	/**
	 * @return if the book is taken or not.
	 */

	public boolean isTaken() {
		return isTaken;
	}

	/**
	 * sets isTaken 
	 * @param isTaken represents if the book is taken.
	 */
	public void setTaken(boolean isTaken) {
		this.isTaken = isTaken;
	}

	/**
	 * @return the member who has the boot at that moment.
	 */
	public LibraryMember getWhoHas() {
		return whoHas;
	}
	/**
	 *Represents setting the member who takes the book at that moment.
	 *@param whoHas represents the library member who has the book currently.
	 */

	public void setWhoHas(LibraryMember whoHas) {
		this.whoHas = whoHas;
	}

	

	
	
}