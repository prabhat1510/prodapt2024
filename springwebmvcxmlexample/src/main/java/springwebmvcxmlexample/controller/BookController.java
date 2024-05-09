package springwebmvcxmlexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springwebmvcxmlexample.dto.BookDTO;
import springwebmvcxmlexample.model.Book;
import springwebmvcxmlexample.service.BookService;
import springwebmvcxmlexample.utility.BookUtility;

@Controller
public class BookController {

	@Autowired
	private BookService service;

	@RequestMapping(value = "/addbook", method = RequestMethod.POST)
	public ModelAndView addBook(@ModelAttribute Book book) {
		BookDTO bookDTO = BookUtility.convertBookToBookDTO(book);// Utility methods to convert model Book to dto
		BookDTO bdto = service.addBook(bookDTO);
		Book bok = BookUtility.convertBookDTOToBook(bdto);// Utility methods to convert dto Book to model
		ModelAndView mv = new ModelAndView();
		// Add data model to mv and view to view

		return mv;
	}

	public ModelAndView bookById(Integer bookId) {
		// TODO Auto-generated method stub
		return null;
	}
}
