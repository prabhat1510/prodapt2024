package java11and17features;


public class Customer {
	
	private Integer custId;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer custId) {
		this.custId = custId;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + "]";
	}
	
	
}
