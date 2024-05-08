package springexampleusingannotation.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component("person")
public class Person {
	private Long adharCardNumber;
	private String personName;
	private Address residentialAddress;
	private Address permanentAddress;

}
