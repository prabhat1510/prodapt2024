package classworkdayfifteen.query;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Demo {

	private Integer index;
	//static - Class level variable has a global scope
	//private static Integer sum=0;
	private Integer sum=0;
	
	public static void main(String[] args) {
		List<Integer> listOfInt = Arrays.asList(1,2,3,4,5);
		Demo demo = new Demo();
		System.out.println(demo.sumofCubes(listOfInt));
	}

	private Integer sumofCubes(List<Integer> listOfInt) {
		Function<Integer,Integer> func = (x)->x*x*x;
		Function<Integer,Integer> func1 = (x)->sum+=x;//sum=sum+x
		for(Integer n:listOfInt) {
			sum =func.andThen(func1).apply(n);
		}
		System.out.println(sum);
		return sum;
	}
}
