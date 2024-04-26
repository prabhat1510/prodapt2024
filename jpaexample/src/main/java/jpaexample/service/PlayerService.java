package jpaexample.service;

import jpaexample.entities.Player;

public interface PlayerService {
	//Create
	public void addPlayer(Player player);
	//Retrieve
	public Player getPlayer(Integer playerId);
}
