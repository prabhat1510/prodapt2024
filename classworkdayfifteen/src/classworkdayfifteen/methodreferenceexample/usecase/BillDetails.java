package classworkdayfifteen.methodreferenceexample.usecase;

import java.time.LocalDate;

public class BillDetails {
	private Integer billNo;
	private LocalDate billDate;
	private LocalDate dueDate;
	private Double amount;
	private Address billingAddress;
	public BillDetails() {
		// TODO Auto-generated constructor stub
	}
	public BillDetails(Integer billNo, LocalDate billDate, LocalDate dueDate, Double amount, Address billingAddress) {
		this.billNo = billNo;
		this.billDate = billDate;
		this.dueDate = dueDate;
		this.amount = amount;
		this.billingAddress = billingAddress;
	}
	public Integer getBillNo() {
		return billNo;
	}
	public void setBillNo(Integer billNo) {
		this.billNo = billNo;
	}
	public LocalDate getBillDate() {
		return billDate;
	}
	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	@Override
	public String toString() {
		return "BillDetails [billNo=" + billNo + ", billDate=" + billDate + ", dueDate=" + dueDate + ", amount="
				+ amount + ", billingAddress=" + billingAddress + "]";
	}
	
}
