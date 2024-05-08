package springexampleusingannotation.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component("address")
public class Address{
	private Integer addressId;
	private String city;
	private String state;
	private String country;
		
}
