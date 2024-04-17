package java11and17features.predicatenotmethod;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		
		Predicate<String> startWithZ = s -> s.charAt(0) == 'z';
		
		Predicate<String> doesNotStartWithZ = Predicate.not(startWithZ);
		
		List<String> list = Arrays.asList("za", "zq", "az", "aq", "zz");
		
		List<String> strsStartingWithZ = list.stream()
                				.filter(startWithZ)
                				.collect(Collectors.toList());
		
		List<String> strsNotStartingWithZ = list.stream()
				.filter(doesNotStartWithZ)
				.collect(Collectors.toList());
		
		System.out.println(strsStartingWithZ);
		System.out.println(strsNotStartingWithZ);
	}
}
