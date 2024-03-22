package classworkdaythree.abstractionusingabstractclass;

public class PaymentByNetBanking extends Payment{

	@Override
	public int getPayment() {
		System.out.println("Payment is done through net banking");
		return 1000;
	}

}
