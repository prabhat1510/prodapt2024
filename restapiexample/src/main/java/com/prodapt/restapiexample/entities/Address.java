package com.prodapt.restapiexample.entities;

import java.util.List;

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
@Table(name="address_details")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer addressId;
	private String city;
	private String state;
	//@OneToMany(mappedBy = "address")
	//private List<Person> persons;
}
