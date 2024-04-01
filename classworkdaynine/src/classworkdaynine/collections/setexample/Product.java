package classworkdaynine.collections.setexample;

public class Product {
	private Integer productId;
	private String description;
	private Integer quantity;
	private Double price;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(Integer productId, String description, Integer quantity, Double price) {
		this.productId = productId;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", description=" + description + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	
	
}
