package jpaexample.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jpaexample.entities.Player;

public class PlayerDAOImpl implements PlayerDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaexample");
	EntityManager em = emf.createEntityManager();

	@Override
	public void addPlayer(Player player) {
		// Inserting data in database using persist method of EntityManager
		em.getTransaction().begin();
		em.persist(player);
		em.getTransaction().commit();
	}

	@Override
	public Player getPlayer(Integer playerId) {
		// Retrieving data in database using find method of EntityManager
		em.getTransaction().begin();
		Player player = em.find(Player.class, playerId);
		em.getTransaction().commit();
		return player;
	}

}
