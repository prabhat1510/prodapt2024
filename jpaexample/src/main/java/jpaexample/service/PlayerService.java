package jpaexample.service;

import jpaexample.entities.Player;

public interface PlayerService {
	//Create
	public void addPlayer(Player player);
	//Retrieve
	public Player getPlayer(Integer playerId);
	
	//Update
	public Player updatePlayer(Player player);
	//Delete
	public String deletePlayer(Integer playerId);
	
	//Find by name
	public Player getPlayerByName(String name);
	
}
