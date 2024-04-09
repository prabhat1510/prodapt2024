package classworkdayfifteen.methodreferenceexample;

import java.util.function.Consumer;

public class ConsumerDemoUsingLambda {

	public static void main(String[] args) {
		Consumer<Integer> cons =(x)->System.out.println(x);
		cons.accept(15);
	}

}
