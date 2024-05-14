package com.prodapt.restapiexample.entities;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
@Table(name="person_details")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer personId;
	private String name;
	private LocalDate dateOfBirth;
	
	//@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "addressId")
	@OneToOne
	private Address address;
	
}
