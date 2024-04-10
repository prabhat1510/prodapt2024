package classworkdaysixteen.streamapiexamplereadingdatafromfile;

import java.io.Serializable;

public class Order implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String currency;
    private Double amount;
    public Order(String currency, Double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Order(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }

}



