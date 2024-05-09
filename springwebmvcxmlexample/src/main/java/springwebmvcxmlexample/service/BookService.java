package springwebmvcxmlexample.service;

import springwebmvcxmlexample.dto.BookDTO;

public interface BookService {
	//Create
	public BookDTO addBook(BookDTO bookDTO);
	//Retrieve
	public BookDTO bookById(Integer bookId);
}
