package classworkdayfifteen.methodreferencetypeexample;


public class Order {
	private String currency;
	private double amount;
	
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	//This constructor is used to understand the reference to constructor
	public Order(double amount) {
		this.amount = amount;
	}
	public Order(String currency, double amount) {
		this.currency = currency;
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Order [currency=" + currency + ", amount=" + amount + "]";
	}

	//Static method for static method reference example
	public static void displayCurrency() {
		System.out.println("Static Method display currency");
	}
	
	//Below method is to understand the instance method
	public void displayAmount() {
		System.out.println(this.amount);
	}
}
