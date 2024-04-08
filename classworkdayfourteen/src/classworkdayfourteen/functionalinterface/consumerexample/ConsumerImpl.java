package classworkdayfourteen.functionalinterface.consumerexample;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		if ((t % 2) != 0) {
			System.out.println(t + " is an odd number");
		} else {
			System.out.println(t + " is an even number");
		}
		
	}

}
