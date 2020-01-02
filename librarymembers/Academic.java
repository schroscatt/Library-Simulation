package librarymembers;

import books.Book;
import java.util.ArrayList;
/**
 * represents the academic library member.
 */
public class Academic extends LibraryMember {
	/**
	 * {@inheritDoc}
	 * calls the superclass' constructor and sets the id of member
	 * sets its maximum number of books that can be taken simultaneously.
	 * sets its time limit
	 * sets the type of member
	 * @param id represents the ID of the member
	 */
	
	public Academic(int id) {
		super();
		setId(id);
		setMaxNumberOfBooks(20);
		setTimeLimit(50);
		setTypeOfMember("A");
		//access handwritten
		
		
	}
	/**
	 * {@inheritDoc}
	 * @see librarymembers.LibraryMember#getTheHistory()
	 * @return theHistory array.
	 */
	public ArrayList<Book> getTheHistory(){
		return theHistory;
	}

}