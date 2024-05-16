package com.prodapt.restapiexample.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name="movie_details")
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer movieId;
	private String name;
	private String rating;
	@JsonIgnoreProperties
	@OneToMany(mappedBy = "movie")
	@JsonManagedReference
	private List<Actor> actors;//inverse side
}
