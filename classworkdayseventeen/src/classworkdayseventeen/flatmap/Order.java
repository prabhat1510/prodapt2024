package classworkdayseventeen.flatmap;

import java.util.List;

public class Order {
	private Integer orderId;
	private List<Integer> orderAmount;
	public Order(Integer orderId, List<Integer> orderAmount) {
		this.orderId = orderId;
		this.orderAmount = orderAmount;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public List<Integer> getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(List<Integer> orderAmount) {
		this.orderAmount = orderAmount;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderAmount=" + orderAmount + "]";
	}
		
	
}
