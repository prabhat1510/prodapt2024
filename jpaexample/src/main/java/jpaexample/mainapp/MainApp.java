package jpaexample.mainapp;

import jpaexample.entities.Player;
import jpaexample.service.PlayerService;
import jpaexample.service.PlayerServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		Player player = new Player();
		//Team team = new Team();
		player.setName("MS DHONI");
		
		//team.setName("Chennai SuperKings");
		
		PlayerService service = new PlayerServiceImpl();
		service.addPlayer(player);
		
		Player plyer = service.getPlayer(1);
		System.out.println(plyer);
	}

}
