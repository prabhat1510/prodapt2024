package classworkdayfifteen.methodreferenceexample.usecase;

import java.util.List;

public class Customer {
	private Integer custId;
	private String custName;
	//One to Many Bill
	private List<BillDetails> billDetails;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer custId, String custName, List<BillDetails> billDetails) {
		this.custId = custId;
		this.custName = custName;
		this.billDetails = billDetails;
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public List<BillDetails> getBillDetails() {
		return billDetails;
	}
	public void setBillDetails(List<BillDetails> billDetails) {
		this.billDetails = billDetails;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", billDetails=" + billDetails + "]";
	}
	
	
}
