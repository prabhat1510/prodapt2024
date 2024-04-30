package jpaassociationexample.onetoonebi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "address_bi")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AddressBi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	private String street;
	private String city;
	private String state;
	private String zipCode;

	@OneToOne(mappedBy = "addressBi")
	private StudentBi studentBi; // inverse side
}
