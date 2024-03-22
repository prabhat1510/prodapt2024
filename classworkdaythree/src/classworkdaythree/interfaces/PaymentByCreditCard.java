package classworkdaythree.interfaces;

public class PaymentByCreditCard implements Payment{

	@Override
	public int getPayment() {
		System.out.println("Payment is done through credit card");
		return (1000*2);
	}

}
