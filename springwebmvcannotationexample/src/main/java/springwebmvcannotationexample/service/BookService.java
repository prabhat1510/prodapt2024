package springwebmvcannotationexample.service;

import springwebmvcannotationexample.dto.BookDTO;

public interface BookService {
	//Create
	public BookDTO addBook(BookDTO bookDTO);
	//Retrieve
	public BookDTO bookById(Integer bookId);
}
