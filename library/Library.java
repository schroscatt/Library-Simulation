package library;

import java.util.Scanner;

import books.Book;
import books.Handwritten;
import books.Printed;
import librarymembers.Academic;
import librarymembers.LibraryMember;
import librarymembers.Student;
/**
 * represents the whole library operations.
 */
public class Library {
	/**
	 * represents the total fee that is paid to the library.
	 */
	private static int totalFee;
	/**
	 * keeps the all books as the type of Book in an array.
	 */
	private Book[] Books;
	/**
	 * keeps the all members as the type of LibraryMember in an array.
	 */
	private LibraryMember[] Members;
	/**
	 *  represents the book's number that is registered to the library and also book id.
	 */
	private int bookNo;
	/**
	 *  represents the member's number that is registered to the library and also member id.
	 */
	private int memberNo;
	/**
	 * represents the scanner which keeps input.
	 */
	private Scanner scanner;
	/**
	 * Constructor creates Members and Books array with the size of 10^6.
	 * @param scanner represents the scanner which keeps input.
	 */
	public Library(Scanner scanner) {
		this.scanner = scanner;
		Members = new LibraryMember[(int)Math.pow(10, 6)]; 
		Books = new Book[(int)Math.pow(10, 6)];

	}
	/**
	 * reads the type of book and creates a Book object and adds it to the book array 
	 */
	public void addBook() {
		String typeOfBook = scanner.next();
		if(typeOfBook.equals("H")) {
			bookNo++;
		Handwritten newBook = new Handwritten(bookNo);
		Books[bookNo-1] = newBook;
		}
		else if(typeOfBook.equals("P")) {
			bookNo++;
			Printed newBook = new Printed(bookNo);
			Books[bookNo-1] = newBook;
		}
	else {
		}
	}
	/**
	 * reads the type of member, creates a LibraryMember object and adds it to the member array
	 */
	public void addMember() {
		String typeOfMember = scanner.next();
		if(typeOfMember.equals("S")) {
			memberNo++;
		Student newMember = new Student(memberNo);
		Members[memberNo-1] = newMember;

		}
		else if(typeOfMember.equals("A")) {
			memberNo++;
			Academic newMember = new Academic(memberNo);
			Members[memberNo-1] = newMember;
		}
		else {

		}
		
	}
		/**
		 * reads the book id and member id, then checks if borrowing the book is valid.
		 * If it is valid, calls the method of borrow of the book class, also adds the book to
		 * the history of the member.
		 */
	/**
	 * @param tick
	 */
	public void borrowBook(int tick) {
		int BookId = scanner.nextInt();
		int MemberId = scanner.nextInt();
		LibraryMember theMember = Members[MemberId-1];
		if(Books[BookId-1]==null || theMember==null) { //checks if the IDs are valid.
		}
		else if(Books[BookId-1].getBookType().equals("H") ) { //checks if it is handwritten
		}
		else if(((Printed) Books[BookId-1]).checkDeadLine(theMember, tick)) {//checks deadline
		}
		else if(theMember.getCurrentBooks() == theMember.getMaxNumberOfBooks()) { //checks the number of current books
		}
		else if(Books[BookId-1].isTaken()) { //checks if the book is available
		}
		else {
			((Printed) Books[BookId-1]).borrowBook(theMember, tick);
			theMember.addToHistory(Books[BookId-1]);
			theMember.addCurrentBook(Books[BookId-1]);
		}
	}
	/**
	 * reads book ID and member ID
	 * checks if the inputs are valid then calls the function of returning book from Book class.
	 * if the deadline is passed, adds the fee to the total fee.
	 * @param tick represents the current tick.
	 */
	public void returnBook(int tick) {
		int BookId = scanner.nextInt();
		int MemberId = scanner.nextInt();
		LibraryMember theMember = Members[MemberId-1];
		if(Books[BookId-1]==null ||theMember==null || Books[BookId-1].getWhoHas()!= theMember ) {
		}		
		else {
			if(Books[BookId-1].getBookType().equals("P")) {
				if(tick>((Printed)Books[BookId-1]).getDeadLine()) {
				totalFee += tick - ((Printed)Books[BookId-1]).getDeadLine();
			}
				((Printed)Books[BookId-1]).setExtended(false);
			}
			Books[BookId-1].returnBook(theMember);
			theMember.removeCurrentBook(Books[BookId-1]);

		}
		
	}
	/**
 	 * reads book ID and member ID
	 * checks if the inputs are valid then calls the function of extending book from Book class.
	 * @param tick represents the current tick.
	 */
	public void extendBook(int tick) {
		int BookId = scanner.nextInt();
		int MemberId = scanner.nextInt();
		LibraryMember theMember = Members[MemberId-1];
		if( Books[BookId-1]==null ||theMember==null || Books[BookId-1].getWhoHas() != theMember || Books[BookId-1].getBookType().equals("H") ) {
		}
		else if(tick>((Printed)Books[BookId-1]).getDeadLine()) {
		}
		else {
			((Printed)Books[BookId-1]).extend(theMember, tick);
		}
	}
	/**
	 * reads book ID and member ID
	 * checks if the inputs are valid 
	 * then calls the function of reading book in library from Book class.
	 */
	public void readInLibrary() {
		int BookId = scanner.nextInt();
		int MemberId = scanner.nextInt();
		if(Books[BookId-1]==null || Members[MemberId-1]==null || Books[BookId-1].isTaken()) {
		}
		else if(Books[BookId-1].getBookType().equals("H")) { 
			((Handwritten)Books[BookId-1]).readBook(Members[MemberId-1]);
			Members[MemberId-1].addToHistory(Books[BookId-1]);


		}
		else if(Books[BookId-1].getBookType().equals("P")) {
			((Printed)Books[BookId-1]).readBook(Members[MemberId-1]);
			Members[MemberId-1].addToHistory(Books[BookId-1]);

		}		
		
	}
	/**
	 * @return total fee that is paid to the library.
	 */
	
	
	public int getTotalFee() {
		return totalFee;
	}
	/**
	 * @return Books array.
	 */
	public Book[] getBooks() {
	
		return Books;
		
	}
	/**
	 * return Members array.
	 */
	public LibraryMember[] getMembers() {
		return Members;
	}

}