package springexampleusingannotation.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component("customer")
public class Customer {

	private Integer customerId;
	private String customerName;
	private Address address;
}
