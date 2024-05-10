package springwebmvcannotationexample.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;
import springwebmvcannotationexample.dto.BookDTO;
import springwebmvcannotationexample.exceptions.BookNotFoundException;
import springwebmvcannotationexample.utility.HibernateUtility;

@Component
public class BookDAOImpl implements BookDAO {

	Session session = HibernateUtility.getSessionFactory().openSession();

	@Override
	@Transactional
	public BookDTO addBook(BookDTO bookDTO) {

		session.persist(bookDTO);

		return bookDTO;
	}

	@Override
	@Transactional
	public BookDTO bookById(Integer bookId) throws BookNotFoundException {
		BookDTO bookDTO = session.get(BookDTO.class, bookId);
		if (bookDTO != null) {
			return bookDTO;
		} else {
			throw new BookNotFoundException("Book with bookId " + bookId + " doesn't exists");
		}

	}

	@Override
	@Transactional
	public BookDTO bookByName(String bookName) throws BookNotFoundException {
		BookDTO bookDTO = session.get(BookDTO.class, bookName);
		if (bookDTO != null) {
			return bookDTO;
		} else {
			throw new BookNotFoundException("Book with bookName " + bookName + " doesn't exists");
		}
	}

	@Override
	@Transactional
	public List<BookDTO> bookByPublisher(String publisher) throws BookNotFoundException {
		List<BookDTO> listbookDTO = (List<BookDTO>) session.byMultipleIds(BookDTO.class);
		if (listbookDTO != null && listbookDTO.size() > 0) {
			return listbookDTO;
		} else {
			throw new BookNotFoundException("Book with publisher " + publisher + " doesn't exists");
		}
	}

	@Override
	@Transactional
	public List<BookDTO> books() throws BookNotFoundException {
		List<Integer> allIds = session.createQuery("SELECT bookId FROM BookDTO", Integer.class).list();
		List<BookDTO> listbookDTO = session.byMultipleIds(BookDTO.class).multiLoad(allIds);
		if (listbookDTO != null && listbookDTO.size() > 0) {
			return listbookDTO;
		} else {
			throw new BookNotFoundException("Books doesn't exists");
		}
	}

	@Override
	@Transactional
	public String deleteById(Integer bookId) throws BookNotFoundException {
		BookDTO bookDTO = session.get(BookDTO.class, bookId);
		if (bookDTO != null) {
			session.remove(bookDTO);
			return "Book with bookId " + bookId + " deleted successfully";
		} else {
			throw new BookNotFoundException("Book with bookId " + bookId + " doesn't exists");
		}
	}

	@Override
	@Transactional
	public String deleteByBookName(String bookName) throws BookNotFoundException {
		
		BookDTO bookDTO = session.get(BookDTO.class, bookName);
		if (bookDTO != null) {
			session.remove(bookDTO);
			return "Book with bookName " + bookName + " deleted successfully";
		} else {
			throw new BookNotFoundException("Book with bookName " + bookName + " doesn't exists");
		}
	}

	@Override
	public BookDTO updateBook(BookDTO bookDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
