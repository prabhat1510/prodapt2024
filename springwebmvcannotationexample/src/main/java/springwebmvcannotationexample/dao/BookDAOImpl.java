package springwebmvcannotationexample.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import springwebmvcannotationexample.dto.BookDTO;
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
	public BookDTO bookById(Integer bookId) {
		session.beginTransaction();
		BookDTO bookDTO = session.get(BookDTO.class, bookId);
		session.getTransaction().commit();
		return bookDTO;
	}

}
