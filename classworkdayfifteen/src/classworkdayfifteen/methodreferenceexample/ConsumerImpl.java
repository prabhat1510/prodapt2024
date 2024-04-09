package classworkdayfifteen.methodreferenceexample;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer{

	@Override
	public void accept(Object t) {
		System.out.println(t);
		
	}

}
