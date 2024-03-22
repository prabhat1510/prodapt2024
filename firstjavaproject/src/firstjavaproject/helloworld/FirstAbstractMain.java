package firstjavaproject.helloworld;

public class FirstAbstractMain {

	public static void main(String[] args) {
		//FirstAbstract firstAbstract = new FirstAbstract();
		FirstAbstract firstAbstract = new FirstAbstractImpl();
		firstAbstract.display();
		firstAbstract.firstAbstractMethod();

	}

}
