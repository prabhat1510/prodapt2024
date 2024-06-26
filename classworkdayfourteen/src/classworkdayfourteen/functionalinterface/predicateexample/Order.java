package classworkdayfourteen.functionalinterface.predicateexample;

import java.time.LocalDate;

public class Order {
	private Long id;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private String status;
	

	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(Long id, LocalDate orderDate, LocalDate deliveryDate, String status) {
		this.id = id;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.status = status;
		
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
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + ", status=" + status
				+ "]";
	}
	
	
}

