package interfaces;

import librarymembers.LibraryMember;

/**
 * Represents the action of borrowing.
 */
public interface Borrow  {
	/**
	 * @param member represents the member who is borrowing and extending the book.
	 * @param tick represents the current tick.
	 */
	
	public void borrowBook(LibraryMember member, int tick);
	public void extend(LibraryMember member, int  tick);
	
}
