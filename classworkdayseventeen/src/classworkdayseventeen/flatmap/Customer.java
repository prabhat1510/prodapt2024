package classworkdayseventeen.flatmap;

import java.util.List;

public class Customer {
	private Integer custId;
	private String name;
	private List<String> phones;
	public Customer(Integer custId, String name, List<String> phones) {
		this.custId = custId;
		this.name = name;
		this.phones = phones;
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", phones=" + phones + "]";
	}
	
	
	
}
