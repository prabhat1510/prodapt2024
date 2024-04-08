package classworkdayfourteen.functionalinterface.consumerexample;

public class AdditionDemo {

	public static void main(String[] args) {
		//Using lambda
		Addition<Double> add =(num1,num2)->num1+num2;
		Double result = add.addition(15.60,10.40);//Call the method and pass the argument
		System.out.println(result);
		//Old way 
		Addition<Double> addition = new AdditionImpl();
		Double result1 =addition.addition(15.50, 10.50);//Call the method and pass the argument
		System.out.println(result1);
	}

}
