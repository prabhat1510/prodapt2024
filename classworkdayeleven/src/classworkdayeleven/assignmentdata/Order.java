package classworkdayeleven.assignmentdata;

import java.time.LocalDate;
import java.util.List;

public class Order {
	private Long id;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private String status;
	
	private List<Product> products;
	private Long customerId;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(Long id, LocalDate orderDate, LocalDate deliveryDate, String status, Long customerId) {
		this.id = id;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.status = status;
		this.customerId = customerId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + ", status=" + status
				+ ", products=" + products + ", customerId=" + customerId + "]";
	}
	
	
}
