package classworkdayfour.methodoverridingexample;

public class Demo {

	public static void main(String[] args) {
		Dad dad = new Dad();//object of Dad class 
		Kid kid = new Kid();//kid class object
		
		dad.display();
		kid.display();
		
		//Object of Kid class referred by Dad class
		Dad kids = new Kid();
		kids.display();
		
		/**
		Kid dads = new Dad();
		dads.display();
		**/
	}

}
