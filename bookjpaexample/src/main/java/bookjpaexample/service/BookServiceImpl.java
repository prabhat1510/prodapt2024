package bookjpaexample.service;

import java.util.List;

import bookjpaexample.dao.BookDAO;
import bookjpaexample.dao.BookDAOImpl;
import bookjpaexample.entities.Book;

public class BookServiceImpl implements BookService {

	@Override
	public void addBook(Book book) {
		BookDAO dao = new BookDAOImpl();
		dao.addBook(book);

	}

	@Override
	public Book getBook(Integer bookId) {
		BookDAO dao = new BookDAOImpl();
		return dao.getBook(bookId);
	}

	@Override
	public Book updateBook(Book book) {
		BookDAO dao = new BookDAOImpl();
		return dao.updateBook(book);
	}

	@Override
	public String deleteBook(Integer bookId) {
		BookDAO dao = new BookDAOImpl();
		return dao.deleteBook(bookId);
	}

	@Override
	public Book getBookByName(String name) {
		BookDAO dao = new BookDAOImpl();
		return dao.getBookByName(name);
	}

	@Override
	public List<Book> getAllBooks() {
		BookDAO dao = new BookDAOImpl();
		return dao.getAllBooks();
	}

	@Override
	public Book getBookUsingTypedQuery(Integer bookId) {
		BookDAO dao = new BookDAOImpl();
		return dao.getBookUsingTypedQuery(bookId);
	}

	@Override
	public List<Book> getBooksUsingTypedQuery() {
		BookDAO dao = new BookDAOImpl();
		return dao.getBooksUsingTypedQuery();
	}

	@Override
	public void updateBookUsingTypedQuery(int id, String name) {
		BookDAO dao = new BookDAOImpl();
		dao.updateBookUsingTypedQuery(id, name);
		
	}

	@Override
	public void updateBookUsingTQuery(Book book) {
		BookDAO dao = new BookDAOImpl();
		dao.updateBookUsingTQuery(book);
		
	}

}
