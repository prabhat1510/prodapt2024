package classworkdayfifteen.methodreferencetypeexample;

public class OrderAmountImpl implements OrderAmount {

	@Override
	public Order getOrderAmount(double amount) {
		
		return new Order(amount);
	}

} 

