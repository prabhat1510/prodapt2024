package com.prodapt.restapiexample.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
@Table(name="movie_master")
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer movieId;
	private String name;
	private String rating;
	
	
	
	//@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "actor_movie_mapping", joinColumns = @JoinColumn(name = "movieId"), inverseJoinColumns = @JoinColumn(name = "actorId"))
	
	private Set<Actor> actors;//owning side
}
