package classworkdaythirteen.functionalinterfaceexample;

public class DisplayDemo {

	public static void main(String[] args) {
		Display dis = ()->System.out.println("Oh God lambda is too much");
		dis.display();
		Display dis1 = ()->System.out.println("Don't worry this is just a trailer");
		dis1.display();
	}

}
