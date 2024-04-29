package bookjpaexample.dao;

import java.util.List;

import bookjpaexample.entities.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class BookDAOImpl implements BookDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookjpaexample");
	EntityManager em = emf.createEntityManager();
	@Override
	public void addBook(Book book) {
		em.getTransaction().begin();
		em.persist(book);
		em.getTransaction().commit();

	}

	@Override
	public Book getBook(Integer bookId) {
		em.getTransaction().begin();
		Book bok = em.find(Book.class,bookId);
		em.getTransaction().commit();
		return bok;
	}

	@Override
	public Book updateBook(Book book) {
		em.getTransaction().begin();
		em.merge(book);
		em.getTransaction().commit();
		return book;
	}

	@Override
	public String deleteBook(Integer bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookByName(String name) {
		TypedQuery<Book> query = em.createQuery("SELECT b from Book b where b.name=:name",Book.class);
		query.setParameter("name", name);
		return query.getSingleResult();
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

}
