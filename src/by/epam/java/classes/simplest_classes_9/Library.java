package by.epam.java.classes.simplest_classes_9;

import java.util.ArrayList;

public class Library {
	
	private ArrayList<Book> library = new ArrayList<Book>();
	
	public Library () {
		
	}

	public ArrayList<Book> getLibrary() {
		return library;
	}

	public void setLibrary(ArrayList<Book> library) {
		this.library = library;
	}
	
	public int getSize() {
		return library.size();
	}
	
	public Book getBook(int index) {
		return library.get(index);
	}
	
	public void addBook(Book book) {
		
		final int flag = LibraryLogic.checkDuplicateBook(book, library);
		final String message = "Данная книга уже есть в каталоге";
		if (flag == 0) {
		this.library.add(book);
		} else {
			LibraryView.messageToUser(message);
		}
	}
	
	@Override
	public String toString() {
		return "Library [library=" + library + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((library == null) ? 0 : library.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		if (library == null) {
			if (other.library != null)
				return false;
		} else if (!library.equals(other.library))
			return false;
		return true;
	}
	
	
	
}
