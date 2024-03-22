package classworkdayone;

public class CheckAgeProgram {

	public static void main(String[] args) {
		//1. Input age
		int age = 20;//Declaration
		//Declaration  and Initialization of variable eligible age
		int eligibleAge=18;
		
		boolean isEligibleToVote = false;
		
		//Conditional Statement
		if(age >= eligibleAge) {
			isEligibleToVote=true;
			System.out.println("You are eligible to vote");
		}else {
			System.out.println("Better grow up !! "+isEligibleToVote);
		}
	}

}
