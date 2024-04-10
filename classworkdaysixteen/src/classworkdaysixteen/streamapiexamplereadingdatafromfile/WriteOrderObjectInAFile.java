package classworkdaysixteen.streamapiexamplereadingdatafromfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class WriteOrderObjectInAFile {

	public static void main(String[] args) {
		//Step1: Create a File object in which we will write objects
		Order orderOne = new Order("AUD", 15000.00);
        Order orderTwo = new Order("INR", 5000.00);
        Order orderThree = new Order("USD", 150000.00);
        Order orderFour = new Order("EUR", 5000.00);
        Order orderFive = new Order("AUD", 8000.00);
        Order orderSix = new Order("EUR", 5001.00);
        Order orderSeven = new Order("EUR", 1000.00);
        
       	//Step2: Use appropriate input stream class object to perform write operation
		File file=new File("D:\\prodapt2024\\output\\orderlist.txt");
		List<Order> orderList = new ArrayList<Order>();
		
		try (FileOutputStream fos = new FileOutputStream(file); 
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			oos.writeObject(orderOne);
			oos.writeObject(orderTwo);
			oos.writeObject(orderThree);
			oos.writeObject(orderFour);
			oos.writeObject(orderFive);
			oos.writeObject(orderSix);
			oos.writeObject(orderSeven);
			
			//Deserialize 
			Order order;
			
			while(fis.available() !=0) {
				//Object obj = ois.readObject();
				order = (Order) ois.readObject();
				if(order !=null) {
					orderList.add(order);
				}
			}
			System.out.println("Deserialized -----"+orderList);
			
			System.out.println("******* *****************************************************");
			orderList.stream()//Stream created from collection orderList
					 .filter(o->o.getAmount()>5000)//then Intermediate operation
					 .map(Order::getCurrency)//Intermediate operation
					 .forEach(System.out::println);//terminal operation
			
			System.out.println("*********************reduce example***************************************");
			
			Double totalOrderAmount = orderList.stream().map(Order::getAmount)
										.reduce(0.0,(r,n)->{return r+n;});
			System.out.println(totalOrderAmount);
			
			System.out.println("*********************reduce example***************************************");
			List<Integer> numbers = Arrays.asList(11,12,15,10,9,4,5,3,2,1,6,8,7,14,13);
	        Integer sumOfAllOddNumbers = numbers.stream()
	        				                    .filter(x->(x%2!=0)).reduce(0,(r,n)->r+n);
	        System.out.println(sumOfAllOddNumbers);
			
	        System.out.println("*********************reduce example***************************************");
	        double totalEuroAmount = orderList.stream()
	                .filter(o -> o.getCurrency().equals("EUR"))
	                .map(Order::getAmount)
	                .reduce(0.0, (r, n) -> {
	                    return (r + n);
	                });
	        System.out.println(totalEuroAmount);
	        System.out.println("*********************count example***************************************");
	        long numberOfOrderInEURO = orderList.stream().filter(o->o.getCurrency().equals("EUR")).count();
	        System.out.println(numberOfOrderInEURO);
	        
	        System.out.println("*********************min example***************************************");
	        System.out.println(orderList.stream()
	                .filter(o -> o.getCurrency().equals("EUR"))
	                .min(Comparator.comparing(Order::getAmount)));
	        
	        System.out.println("**************Use of Optionl class as min method returns Optional class type object**************************");
	        Optional<Order> minOrderAmountInEuro = orderList.stream()
	        												.filter(o -> o.getCurrency().equals("EUR"))
	        												.min(Comparator.comparing(Order::getAmount));
	        //Either
	        minOrderAmountInEuro.ifPresent(o ->System.out.println(o));
	        //Or do 
	        if(minOrderAmountInEuro.isPresent()) {
	        	Order euroOrderWithMinAmount = minOrderAmountInEuro.get();
	        	System.out.println(euroOrderWithMinAmount);
	        }else {
	        	throw new MinAmountOrderNotFoundException();
	        }
	        System.out.println("*********************************max*****************************************");
	        System.out.println(orderList.stream()
	                .filter(o -> o.getCurrency().equals("EUR"))
	                .max(Comparator.comparing(Order::getAmount)));
	        System.out.println("***********************************************************************************");
	        
	        System.out.println("*********************max example***************************************");
		} catch (FileNotFoundException fnfe) {

			System.out.println(fnfe.getClass() + "---------------" + fnfe.getMessage());
		}catch (IOException ioe) {
			System.out.println(ioe.getClass() + "---------------" + ioe.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MinAmountOrderNotFoundException e) {
			System.out.println("Min Amount Order doesn't exist");
		}
		
	}

}
