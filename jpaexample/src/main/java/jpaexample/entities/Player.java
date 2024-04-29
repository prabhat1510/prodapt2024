package jpaexample.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter  
@ToString
@Table(name="player_dets")//By using @Table we are giving the name of the table otherwise name of the class will be name of the table
public class Player {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="player_id")
	private Integer playerId;
	@Column(name="player_name")
	private String name;
	
}
