package springwebmvcannotationexample.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import springwebmvcannotationexample.dto.BookDTO;
import springwebmvcannotationexample.exceptions.BookNotFoundException;
import springwebmvcannotationexample.utility.HibernateUtility;

@Component
public class BookDAOImpl implements BookDAO {

	Session session = HibernateUtility.getSessionFactory().openSession();

	@Override
	public BookDTO addBook(BookDTO bookDTO) {
		session.beginTransaction();
		session.persist(bookDTO);
		session.getTransaction().commit();
		return bookDTO;
	}

	@Override
	public BookDTO bookById(Integer bookId) throws BookNotFoundException {
		session.beginTransaction();
		BookDTO bookDTO = session.get(BookDTO.class, bookId);
		session.getTransaction().commit();
		if (bookDTO != null) {
			return bookDTO;
		} else {
			throw new BookNotFoundException("Book with bookId " + bookId + " doesn't exists");
		}

	}

	@Override
	public BookDTO bookByName(String bookName) throws BookNotFoundException {
		session.beginTransaction();
		BookDTO bookDTO = session.get(BookDTO.class, bookName);
		session.getTransaction().commit();
		if (bookDTO != null) {
			return bookDTO;
		} else {
			throw new BookNotFoundException("Book with bookName " + bookName + " doesn't exists");
		}
	}

	@Override
	public List<BookDTO> bookByPublisher(String publisher) throws BookNotFoundException {
		session.beginTransaction();
		List<BookDTO> listbookDTO = (List<BookDTO>) session.byMultipleIds(BookDTO.class);
		session.getTransaction().commit();
		if (listbookDTO != null && listbookDTO.size() > 0) {
			return listbookDTO;
		} else {
			throw new BookNotFoundException("Book with publisher " + publisher + " doesn't exists");
		}
	}

	@Override
	public List<BookDTO> books() throws BookNotFoundException {
		session.beginTransaction();
		List<BookDTO> listbookDTO = (List<BookDTO>) session.byMultipleIds(BookDTO.class);
		session.getTransaction().commit();
		if (listbookDTO != null && listbookDTO.size() > 0) {
			return listbookDTO;
		} else {
			throw new BookNotFoundException("Books doesn't exists");
		}
	}

	@Override
	public String deleteById(Integer bookId) throws BookNotFoundException {
		session.beginTransaction();
		BookDTO bookDTO = session.get(BookDTO.class, bookId);
		if (bookDTO != null) {
			session.remove(bookDTO);
			session.getTransaction().commit();
			return "Book with bookId " + bookId + " deleted successfully";
		} else {
			session.getTransaction().commit();
			throw new BookNotFoundException("Book with bookId " + bookId + " doesn't exists");
		}
	}

	@Override
	public String deleteByBookName(String bookName) throws BookNotFoundException {
		session.beginTransaction();
		BookDTO bookDTO = session.get(BookDTO.class, bookName);
		if (bookDTO != null) {
			session.remove(bookDTO);
			session.getTransaction().commit();
			return "Book with bookName " + bookName + " deleted successfully";
		} else {
			session.getTransaction().commit();
			throw new BookNotFoundException("Book with bookName " + bookName + " doesn't exists");
		}
	}

	@Override
	public BookDTO updateBook(BookDTO bookDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
