package classworkdaysixteen.optionalexample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// Data
		List<Integer> listOfIntegers = Arrays.asList(15, 16, 18, 1, 2, 3, 4, 56, 7, 8, 6, 5);
		Integer number = 151; // Number to searched in list of numbers

		// search method which returns Optional type which contains index
		Optional<Integer> index = search(listOfIntegers, number);

		if (index.isPresent()) {
			System.out.println(index.get());
		} else {
			System.out.println("Unable to find a number");
		}
		
		Optional<Integer> minValue =min(listOfIntegers);
		if(minValue.isPresent()) {
			System.out.println(minValue.get());
		}
	}

	private static Optional<Integer> search(List<Integer> listOfIntegers, Integer number) {
		Optional<Integer> indexOfNumberFound = Optional.empty();
		for (Integer n : listOfIntegers) {
			if (n == number) {
				indexOfNumberFound = Optional.of(listOfIntegers.indexOf(n));
				break;
			}
		}
		
		return indexOfNumberFound;
		

	}

	private static Optional<Integer> min(List<Integer> listOfIntegers) {
		Integer temp = 0;
		int[] nums = listOfIntegers.stream()
	            .mapToInt(Integer::intValue)
	            .toArray();
		
		for (int firstIndex = 0; firstIndex < listOfIntegers.size(); firstIndex++) {
			for (int secondIndex = firstIndex + 1; secondIndex < listOfIntegers.size(); secondIndex++) {
				if(nums[firstIndex] > nums[secondIndex]) {
					temp = nums[firstIndex];
					nums[firstIndex] = nums[secondIndex];
					nums[secondIndex] =temp;
				}

			}

		}

		Optional<Integer> min = Optional.of(nums[0]);
		return min;
		

	}
}
