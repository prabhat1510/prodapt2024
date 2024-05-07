package springcoreexamples.readingconfig;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {
	private Integer addressId;
	private String city;
	private String state;
	private String country;
}
