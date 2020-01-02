package librarymembers;

import books.Book;
import java.util.ArrayList;

public class Student extends LibraryMember{
	/**
	 * {@inheritDoc}
	 * calls the superclass' constructor and sets the id of member
	 * sets its maximum number of books that can be taken simultaneously.
	 * sets its time limit
	 * sets the type of member
	 * @param id represents the ID of the member
	 */
	public Student(int id){
		super();
		setId(id);
		setMaxNumberOfBooks(10);
		setTimeLimit(20);
		setTypeOfMember("S");

		//not permission to handwritten
	}
	/**
	 * sets the number of the current books.
	 * @param currentBooks represents the number of current books.
	 */
	
	public ArrayList<Book> getTheHistory(){
		return theHistory;
	}
}