package books;

import interfaces.Borrow;
import interfaces.ReadInLibrary;
import librarymembers.LibraryMember;

/**
 * Represents the printed book. It inherits the Book class and ReadInLibrary and Borrow interfaces.
 * @param deadLine represents when the book should be returned.
 * @param isExtended represents if the book is extended by the member who has it currently.
 * @param isReadInLibrary represents if the book is read in library at that moment.
 * 
 */
public class Printed extends Book implements ReadInLibrary, Borrow {
	private int deadLine;
	private boolean isExtended;
	private boolean isReadInLibrary;
	/**
	 * {@inheritDoc}
	 * @param bookId represents the id of the book.
	 */
	public Printed(int bookID) {
		super(bookID, "P");
		
	}
	/**
	 * Sets the deadline of the book.
	 * @param tick represents the tick at that moment.
	 * @param limit represents the limit of the member.
	 */
	public void setdeadLine(int tick, int limit) {
		deadLine = tick + limit;
	}
	/**
	 * @return the deadline of the book.
	 */
	public int getDeadLine() {
		return deadLine;
	}
	/**
	 * {@inheritDoc}
	 * @see books.Book#returnBook(librarymembers.LibraryMember)
	 * @param member represents the member who is returning the book.
	 */
	public void returnBook(LibraryMember member) {
		setTaken(false);
		setWhoHas(null);
		if(isReadInLibrary== false) {member.setCurrentBooks(member.getCurrentBooks()-1);}
	}
	/**
	 * {@inheritDoc}
	 * @see interfaces.ReadInLibrary#readBook(librarymembers.LibraryMember)
	 * @param member represents the member who is reading the book.
	 */
	public void readBook(LibraryMember member) {
		isReadInLibrary = true;
		setTaken(true);
		setWhoHas(member);		
	}
	/**
	 * {@inheritDoc}
	 * @see interfaces.Borrow#borrowBook(librarymembers.LibraryMember, int)
	 * @param member represents the member who is borrowing the book.
	 * @param tick represents the current tick.
	 */
	public void borrowBook(LibraryMember member, int tick) {
		setdeadLine(tick, member.getTimeLimit());
		setTaken(true);
		setWhoHas(member);
		member.setCurrentBooks(member.getCurrentBooks()+1);;
		
	}
	/**
	 * @return if the there is any book taken by the member currently whose deadline is passed or not.
	 * @param member represents the member who has the books.
	 * @param tick represents the current tick.
	 */
	public boolean checkDeadLine(LibraryMember member, int tick) {
		for(int i=0; i<member.getSizeofTaken(); i++) {
			if(((Printed) member.getCurrentBook(i)).getDeadLine()<tick) {
				return true;
			}
		}
		return false;
	}
	/**
	 * @see interfaces.Borrow#extend(librarymembers.LibraryMember, int)
	 * @param member represents the member who is extending the book.
	 * @param tick represents the current tick.
	 */
	public void extend(LibraryMember member, int tick) {
		
		if(tick<=this.deadLine && isExtended == false) {
			setdeadLine(this.deadLine, member.getTimeLimit());
			isExtended = true;
		}
	}
	/**
	 * @return if the book is extended.
	 */
	public boolean isExtended() {
		return isExtended;
	}
	/**
	 * sets if the book is extended.
	 * @param represents if the book is extended before.
	 */
	public void setExtended(boolean isExtended) {
		this.isExtended = isExtended;
	}

	
}