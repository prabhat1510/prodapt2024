package jpaexample.dao;

import jpaexample.entities.Player;

public interface PlayerDAO {
	//Create
	public void addPlayer(Player player);
	//Retrieve
	public Player getPlayer(Integer playerId);
}
