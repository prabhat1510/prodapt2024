package springwebmvcxmlexample.dao;

import springwebmvcxmlexample.dto.BookDTO;
import springwebmvcxmlexample.model.Book;

public interface BookDAO {
	// Create
	public BookDTO addBook(BookDTO bookDTO);

	// Retrieve
	public BookDTO bookById(Integer bookId);
}
