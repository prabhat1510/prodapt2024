package jpaexample.mainapp;

import jpaexample.entities.Player;
import jpaexample.service.EmployeeService;
import jpaexample.service.EmployeeServiceImpl;
import jpaexample.service.PlayerService;
import jpaexample.service.PlayerServiceImpl;

public class MainApp {

	/*
	 * public static void main(String[] args) {
	 * Player player = new Player(); 
	 * //Team team = new Team(); 
	 * player.setName("Kapil Dev"); 
	 * player.setPlayerId(1);
	 * //team.setName("Chennai SuperKings");
	 * 
	 * PlayerService service = new PlayerServiceImpl(); 
	 * service.addPlayer(player);
	 * 
	 * //Player plyer = service.getPlayer(2); 
	 * //System.out.println(plyer); }
	 */
	public static void main(String[] args) {
		Player player = new Player();
		player.setPlayerId(1);
		player.setName("Krishnamchari Srikant");
		
		PlayerService service = new PlayerServiceImpl(); 
		//System.out.println(service.updatePlayer(player));
		
		System.out.println(service.getPlayerByName("Krishnamchari Srikant"));
		EmployeeService empService = new EmployeeServiceImpl();
		System.out.println(empService.getAllEmployee());
}
}
