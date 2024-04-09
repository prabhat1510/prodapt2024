package classworkdayfifteen.methodreferenceexample;

import java.util.function.Consumer;

public class ConsumerImplDemo {

	public static void main(String[] args) {
		Consumer<String> cons = new ConsumerImpl();
		cons.accept("Kaalai Vanakkam");

	}

}
