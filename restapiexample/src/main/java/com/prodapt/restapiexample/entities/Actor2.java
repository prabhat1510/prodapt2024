/**package com.prodapt.restapiexample.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="actor_details")
public class Actor2 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer actorId;
	private String name;
	
	
	@JsonIgnoreProperties
	@ManyToOne(cascade = CascadeType.ALL)//Owning side
	@JoinColumn(name = "movieId")
	@JsonBackReference
	private Movie movie;
}
**/