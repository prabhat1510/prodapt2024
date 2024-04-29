package bookjpaexample.ui;

import bookjpaexample.entities.Book;
import bookjpaexample.service.BookService;
import bookjpaexample.service.BookServiceImpl;

public class BookMainApp {
	public static void main(String[] args) {
		/**
		Book book = new Book();
		//book.setName("Java Programming Languages");
		//book.setPublisher("Pearson");
		
		book.setName("C Programming Languages");
		book.setPublisher("S Chand");
		**/
		BookService service = new BookServiceImpl();
		//service.addBook(book);
		//service.getAllBooks();
		Book b = service.getBookByName("Java Programming Languages");
		System.out.println(b);
		
		System.out.println(service.getAllBooksUsingNamedQuery());
	}
}
