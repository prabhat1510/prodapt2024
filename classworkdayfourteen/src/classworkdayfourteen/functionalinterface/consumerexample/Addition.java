package classworkdayfourteen.functionalinterface.consumerexample;

@FunctionalInterface
public interface Addition<T> {
	public T addition(T num1,T num2);
}
