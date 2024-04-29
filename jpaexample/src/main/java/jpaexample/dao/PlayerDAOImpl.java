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
		Player player = em.find(Player.class,playerId);
		em.getTransaction().commit();
		return player;
	}

	@Override
	public Player updatePlayer(Player player) {
		em.getTransaction().begin();
		//Write the update logic
		em.merge(player);
		em.getTransaction().commit();
		return player;
	}

	@Override
	public String deletePlayer(Integer playerId) {
		em.getTransaction().begin();
		Player player = em.find(Player.class,playerId);
		if(player != null) {
			em.remove(player);
			em.getTransaction().commit();
			return "Player with playerId "+playerId+" deleted successfully";

		}else {
			return "No record found so unable to delete";
		}
		
	}

}
