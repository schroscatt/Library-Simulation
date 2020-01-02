package librarymembers;
import books.Book;
import java.util.ArrayList;
/*
 * represents the library member.
 */
public abstract class LibraryMember{
	/**
	 * represents member's id
	 */
	private int id;
	/**
	 * represents the maximum number of books the member can borrow simultaneously.
	 */
	private int maxNumberOfBooks;
	/**
	 * represents the time limit of the member
	 */
	private int timeLimit;
	/**
	 * represents the type of the member
	 */
	private String typeOfMember;
	/**
	 * represents the number of current books the member has.
	 */
	private int currentBooks;
	/**
	 * represents the member's history.
	 */
	ArrayList<Book> theHistory;
	/**
	 * keeps the books the member has at that moment.
	 */
	private ArrayList<Book> currentTakenBooks;
	/**
	 * initialize theHistory array and currentTakenBooks
	 */
	
	public LibraryMember() {
		theHistory = new ArrayList<Book>();
		currentTakenBooks = new ArrayList<Book>();
		currentBooks = 0;
	}
	/**
	 * @return the size of current taken books.
	 */
	public int getSizeofTaken() {
		return currentTakenBooks.size();
	}
	/**
	 * 
	 * @param i represents the current book that is borrowed by the member
	 * @return that borrowed book.
	 */
	public Book getCurrentBook(int i) {
		return currentTakenBooks.get(i);
	}
	/**
	 * adds the book to the current list of the member
	 * @param book represents the book that will be added to the current book list of the member.
	 */
	public void addCurrentBook(Book book) {
		currentTakenBooks.add(book);
	}
	/**
	 * removes the book from the current list of the member
	 * @param book
	 */
	public void removeCurrentBook(Book book) {
		currentTakenBooks.remove(book);
	}
	/**
	 * adds the book to the history of the member
	 * @param book represents the book that will be added to the history.
	 */
	public void addToHistory(Book book) {
		if(!theHistory.contains(book)) {
		theHistory.add(book);}
	}
	/**
	 * @return theHistory array of the member.
	 */

	public abstract ArrayList<Book> getTheHistory();
	/**
	 * @return the ID of the member.
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the maximum number of books that can be taken by the member simultaneously.
	 */
	public int getMaxNumberOfBooks() {
		return maxNumberOfBooks;
	}
	/**
	 * @return the time limit of the member.
	 */
	public int getTimeLimit() {
		return timeLimit;
	}
	/**
	 * @return the type of the member
	 */
	public String getTypeOfMember() {
		return typeOfMember;
	}
	/**
	 * @return the number of current books of the member.
	 */
	public int getCurrentBooks() {
		return currentBooks;
	}
	/**
	 * sets the id of the member
	 * @param id represents the ID of the member.
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * sets the maximum number of books.
	 * @param maxNumberOfBooks represents maximum number of current books.
	 */
	public void setMaxNumberOfBooks(int maxNumberOfBooks) {
		this.maxNumberOfBooks = maxNumberOfBooks;
	}
	/**
	 * sets time limit.
	 * @param timeLimit represents the time limit of the member.
	 */
	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}
	/**
	 * sets the type of the member
	 * @param typeOfMember represents the type of the member.
	 */
	public void setTypeOfMember(String typeOfMember) {
		this.typeOfMember = typeOfMember;
	}
	/**
	 * sets the number of the current books.
	 * @param currentBooks represents the number of current books.
	 */
	public void setCurrentBooks(int currentBooks) {
		this.currentBooks = currentBooks;
	}



}