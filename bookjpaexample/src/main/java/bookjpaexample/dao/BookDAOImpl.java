package bookjpaexample.dao;

import java.util.List;

import bookjpaexample.entities.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
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
	public void updateBookUsingQuery(Book book) {
		em.getTransaction().begin();
		Query query = em.createQuery("UPDATE Book book  SET book.bookName =:bookName where book.bookId=:bookId");
		query.setParameter("bookId", book.getId());
		query.setParameter("bookName", book.getName());
		int row = query.executeUpdate();
		em.getTransaction().commit();
		System.out.println("Number of updated row is ---"+row);
	}

	@Override
	public void updateBookUsingNormalQuery(int id, String name) {
		em.getTransaction().begin();
		Query query = em.createQuery("UPDATE Book book  SET book.bookName =:bookName where book.bookId=:bookId");
		query.setParameter("bookId", id);
		query.setParameter("bookName", name);
		int row = query.executeUpdate();
		em.getTransaction().commit();
		System.out.println("Number of updated row is ---"+row);
		
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
	
	@Override
	public Book getBookUsingTypedQuery(Integer bookId) {
		TypedQuery<Book> query = em.createQuery("SELECT b from Book b where b.bookId=:bookId",Book.class);
		query.setParameter("bookId", bookId);
		return query.getSingleResult();
		
	}

	@Override
	public List<Book> getBooksUsingTypedQuery() {
		TypedQuery<Book> query =em.createQuery("SELECT b from Book b", Book.class);
		return query.getResultList();
	}

}
