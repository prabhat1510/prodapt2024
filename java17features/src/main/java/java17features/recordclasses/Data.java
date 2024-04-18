package java17features.recordclasses;

public class Data {

	final private int x =15;
	final private int y =10;
	public Data(int x, int y) {
		//this.x = x;
		//this.y = y;
		if(x>y) {
			System.out.println("X is greater than Y");
		}
	}
	public int getX() {
		return x;
	}

	/*
	 * public void setX(int x) { this.x = x; }
	 */
	public int getY() {
		return y;
	}
	/**
	public void setY(int y) {
		this.y = y;
	}**/
	@Override
	public String toString() {
		return "Data [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
