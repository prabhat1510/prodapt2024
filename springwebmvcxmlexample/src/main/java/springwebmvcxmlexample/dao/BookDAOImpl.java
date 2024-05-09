package springwebmvcxmlexample.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import springwebmvcxmlexample.dto.BookDTO;
import springwebmvcxmlexample.utility.HibernateUtility;

@Component
public class BookDAOImpl implements BookDAO {
	
	Session session = HibernateUtility.getSessionFactory().openSession();
	
	@Override
	public BookDTO addBook(BookDTO bookDTO) {
		session.beginTransaction();
		BookDTO bokDTO = session.get(BookDTO.class, bookDTO);
		session.getTransaction().commit();
		return bokDTO;
	}

	@Override
	public BookDTO bookById(Integer bookId) {
		// TODO Auto-generated method stub
		return null;
	}

}
