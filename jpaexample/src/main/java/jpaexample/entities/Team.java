package jpaexample.entities;
/**
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//This annotation tells ORM that Team is an entity class whose object will be persisted
@Entity 
@Getter
@Setter
@ToString
public class Team {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer teamId;
	private String name;
	@OneToOne(mappedBy = "playerId")
	private Player player;
}
*/