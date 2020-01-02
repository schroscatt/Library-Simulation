package interfaces;

import librarymembers.LibraryMember;

/**
 * Represents the action of reading book in library.
 */
public interface ReadInLibrary {
	/**
	 * @param member represents the member who is reading the book.
	 * @param tick represents the current tick.
	 */
	
	public void readBook(LibraryMember member);
	
}
