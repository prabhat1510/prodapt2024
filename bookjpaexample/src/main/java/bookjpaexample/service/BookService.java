package bookjpaexample.service;

import java.util.List;

import bookjpaexample.entities.Book;

public interface BookService {
	// Create
		public void addBook(Book book);

		// Retrieve
		public Book getBook(Integer bookId);

		// Update
		public Book updateBook(Book book);

		// Delete
		public String deleteBook(Integer bookId);

		// Find by name using JPQL
		public Book getBookByName(String name);
		
		//Get All Books
		public List<Book> getAllBooks();
		
		public Book getBookUsingTypedQuery(Integer bookId);

		public List<Book> getBooksUsingTypedQuery();
		
		public void updateBookUsingNormalQuery(int id, String name);

		public void updateBookUsingQuery(Book book);
		
		public List<Book> getAllBooksUsingNamedQuery();
}	
