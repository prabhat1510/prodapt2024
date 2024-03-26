package classworkdayfour.methodoverloadingexamples;

public class Demo {

	public static void main(String[] args) {
		Accounts savingAccount= new Accounts();
		savingAccount.setAccountNumber(112112121);
		savingAccount.setAccountType("Gold");
		savingAccount.setBalance(1234343.50);
		
		Double bal = savingAccount.balanceAfterWithdrawal(1005000.50);
		System.out.println(bal);
		
		System.out.println(savingAccount.balanceAfterWithdrawal(bal, "Silver"));
		
	}	

}
