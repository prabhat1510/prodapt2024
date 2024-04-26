package jpaexample.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Player {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer playerId;
	private String name;
	
}
