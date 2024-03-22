package classworkdaythree.interfaces;

public class MainApp {

	public static void main(String[] args) {
		Payment netBanking = new PaymentByNetBanking();
		Payment creditCard = new PaymentByCreditCard();
		
		netBanking.displayInfo();
		System.out.println(netBanking.getPayment());
		Payment.displayInformation();
		
		System.out.println("*************************************");
		creditCard.displayInfo();
		System.out.println(creditCard.getPayment());
	}

}
