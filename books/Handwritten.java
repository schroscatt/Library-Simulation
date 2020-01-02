package books;

import interfaces.ReadInLibrary;
import librarymembers.LibraryMember;

/**
 * Represents the handwritten book. It inherits the Book class and ReadInLibrary interface.
 * 
 */
public class Handwritten extends Book implements ReadInLibrary {
	/**
	 * calls the constructor of the Book class
	 * {@inheritDoc}
	 *  @param bookID represents the id of the book.
	 */
	
	public Handwritten(int bookID) {
		super(bookID,"H");
	
	}
	/**
	 * sets isTaken false and whoHas null.
	 * {@inheritDoc}
	 * @see books.Book#returnBook(librarymembers.LibraryMember)
	 * @param member represents the member returning the book.
	 */
	public void returnBook(LibraryMember member) {
		setTaken(false);
		setWhoHas(null);
	}
	/**
	 * sets taken true and sets who has the book
	 * {@inheritDoc}
	 * @see interfaces.ReadInLibrary#readBook(librarymembers.LibraryMember)
	 * @param member represents the member returning the book.
	 */
	public void readBook(LibraryMember member) {
		setTaken(true);
		setWhoHas(member);
		
	}

}