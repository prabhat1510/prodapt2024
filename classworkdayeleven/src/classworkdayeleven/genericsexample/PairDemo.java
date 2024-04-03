package classworkdayeleven.genericsexample;

public class PairDemo {

	public static void main(String[] args) {
		Number n1 = 5;
		String s1 = "Sun";
		
		Pair<Number,String> pair = new Pair<Number,String>(n1,s1);
		System.out.println(pair.getFirst());
		System.out.println(pair.getSecond());
		
		
		Pair<Double,Float> pairs = new Pair<Double,Float>(155.55,11.10f);
		System.out.println(pairs.getFirst());
		System.out.println(pairs.getSecond());
	}

}
