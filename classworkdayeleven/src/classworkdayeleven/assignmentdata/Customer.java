package classworkdayeleven.assignmentdata;

import java.util.List;

public class Customer {
	private Long id;
	private String name;
	private Integer tier;
	//One to Many Relationship
	private List<Order> orders;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(Long id, String name, Integer tier) {
		this.id = id;
		this.name = name;
		this.tier = tier;
	}

	public Customer(Long id, String name, Integer tier, List<Order> orders) {
		this.id = id;
		this.name = name;
		this.tier = tier;
		this.orders = orders;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTier() {
		return tier;
	}

	public void setTier(Integer tier) {
		this.tier = tier;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", tier=" + tier + ", orders=" + orders + "]";
	}
	
	
}
