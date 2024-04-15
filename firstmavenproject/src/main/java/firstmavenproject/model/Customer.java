package firstmavenproject.model;

import java.time.LocalDate;

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
public class Customer {
	private Integer customerId;
	private String customerName;
	private LocalDate birthDate;
	private Long mobile;
	private String email;
}	
