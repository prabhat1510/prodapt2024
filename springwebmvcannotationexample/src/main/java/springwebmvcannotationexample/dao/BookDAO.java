package springwebmvcannotationexample.dao;

import springwebmvcannotationexample.dto.BookDTO;

public interface BookDAO {
	// Create
	public BookDTO addBook(BookDTO bookDTO);

	// Retrieve
	public BookDTO bookById(Integer bookId);
}
