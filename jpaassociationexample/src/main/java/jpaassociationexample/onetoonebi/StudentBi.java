package jpaassociationexample.onetoonebi;

import jakarta.persistence.CascadeType;
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
@Table(name = "student_bi")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StudentBi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	private String studentName;
	// Student class has an address -- HAS A relationship
	// ONe to One bi
	@OneToOne(cascade = CascadeType.ALL)
	private AddressBi addressBi; // owning side

	
}
