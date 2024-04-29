package jpaexample.service;

import jpaexample.dao.PlayerDAO;
import jpaexample.dao.PlayerDAOImpl;
import jpaexample.entities.Player;

public class PlayerServiceImpl implements PlayerService {

	@Override
	public void addPlayer(Player player) {
		PlayerDAO dao = new PlayerDAOImpl();
		dao.addPlayer(player);
	}

	@Override
	public Player getPlayer(Integer playerId) {
		PlayerDAO dao = new PlayerDAOImpl();
		return dao.getPlayer(playerId);
	}

	@Override
	public Player updatePlayer(Player player) {
		PlayerDAO dao = new PlayerDAOImpl();
		return dao.updatePlayer(player);
	}

	@Override
	public String deletePlayer(Integer playerId) {
		PlayerDAO dao = new PlayerDAOImpl();
		return dao.deletePlayer(playerId);
	}

}
