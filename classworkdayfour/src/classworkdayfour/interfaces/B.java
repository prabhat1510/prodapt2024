package classworkdayfour.interfaces;

public class B extends A {
	int c;
	
	
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	void display2( ){
		System.out.println("c :" + c);
	}
	void sum(){
		System.out.println("m+n+c = " + (m+n+c));
	}

}
