package classworkdayfourteen.functionalinterface.consumerexample;

public class AdditionImpl implements Addition<Double> {

	@Override
	public Double addition(Double num1, Double num2) {
		
		return num1+num2;
	}

}
