package springwebmvcannotationexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springwebmvcannotationexample.dao.BookDAO;
import springwebmvcannotationexample.dto.BookDTO;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDAO;

	@Override
	public BookDTO addBook(BookDTO bookDTO) {

		return bookDAO.addBook(bookDTO);
	}

	@Override
	public BookDTO bookById(Integer bookId) {

		return bookDAO.bookById(bookId);
	}

}
