package classworkdaysixteen.streamapiexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExamples {
	public static void main(String[] args) {
		System.out.println("***********************Objects example in stream ************************************");
        Order orderOne = new Order("AUD", 15000.00);
        Order orderTwo = new Order("INR", 5000.00);
        Order orderThree = new Order("USD", 150000.00);
        Order orderFour = new Order("EUR", 5000.00);
        Order orderFive = new Order("AUD", 8000.00);
        Order orderSix = new Order("EUR", 5001.00);
        Order orderSeven = new Order("EUR", 1000.00);
        
        List<Order> orderList = new ArrayList<Order>();
        orderList.add(orderOne);
        orderList.add(orderTwo);
        orderList.add(orderThree);
        orderList.add(orderFour);
        orderList.add(orderFive);
        orderList.add(orderSix);
        orderList.add(orderSeven);
        
        System.out.println("*************Example of filter() function********************");
        orderList.stream().filter(o->o.getAmount() > 5000)//Intermediate Operation
        .sorted(Comparator.comparing(Order::getAmount).reversed())//Intermediate Operation
        .forEach(System.out::println);
        
        System.out.println("*************Example of map() function********************");
        List<Double> listOfEUROrderAmount= orderList.stream()
                .filter(o -> o.getCurrency().equals("EUR"))//Intermediate Operation
                .map(Order::getAmount)//Intermediate Operation
                //.forEach(System.out::println);
                .collect(Collectors.toList());//Terminal Operation
        
        System.out.println(listOfEUROrderAmount);
        System.out.println("******************************************************");
        List<Integer> numbers = Arrays.asList(11,12,15,10,9,4,5,3,2,1,6,8,7,14,13);
        numbers.stream()
        				.filter(x->(x%2!=0))
        				.map(x->Math.pow(x, 2))
        				.forEach(System.out::println);
        
        System.out.println("******************************************************");
        List<Integer> numbersWithDuplicates = Arrays.asList(11,12,15,10,9,4,5,3,2,1,6,8,7,14,13,15,14,2,4,1,10,9);
        Set<Integer> numbersWithoutDuplicates = numbersWithDuplicates.stream()//stream created
        					 .collect(Collectors.toSet());//terminal operation
        numbersWithoutDuplicates.forEach(System.out::println);
	}
}
