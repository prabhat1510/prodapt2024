package jpaexample.dao;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
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

	@Override
	public Player getPlayerByName(String name) {
		//JPQL query
		String query="select p.playerId,p.name from Player p where p.name=:name";
		em.getTransaction().begin();
		Query q = em.createQuery(query);//Using EntityManager creating query
		q.setParameter("name", name);//setting the parameter
		List<Object> p =q.getResultList();
		
		
		/*
		 * List<Player> pl= p.stream() .map(element->(Player) element)
		 * .collect(Collectors.toList());
		 */
		Player pl = null;
		for(Object o: p) {
			if(o instanceof Player) {
				 pl= (Player) o;
			}
		}
		System.out.println(pl.getName());
		System.out.println(pl.getPlayerId());
		//Player p =(Player) q.getSingleResultOrNull();
		/*
		 * if(p.size() >0) { return (Player)p.get(0); }
		 */
		em.getTransaction().commit();
		return pl;
	}

}
