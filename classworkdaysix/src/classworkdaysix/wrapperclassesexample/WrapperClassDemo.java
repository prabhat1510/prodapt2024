package classworkdaysix.wrapperclassesexample;

import java.math.BigDecimal;

public class WrapperClassDemo {

	public static void main(String[] args) {
		//Primitive Data Type
		int num=15;
		double salary=155.50;
		char letter = 'A';
		float floatNumber = 134.50f;

		//Wrapper class-  auto boxing
		Integer intNum = num;
		Double dSal = salary;
		Character cLetter = letter;
		Float fFloatNum=floatNumber;
		BigDecimal bigDecimal =new BigDecimal(143543.5555534324392378);
		
		//System.out.println(num instanceof Integer);
		System.out.println(intNum instanceof Integer);
		System.out.println(dSal instanceof Double);
		System.out.println(cLetter instanceof Character);
		System.out.println(fFloatNum instanceof Float);
		System.out.println(bigDecimal instanceof BigDecimal);
		
		//Auto unboxing 
		int x=intNum;
		System.out.println(intNum.intValue());
		System.out.println(dSal.doubleValue());
		//
		String doubleVal = "143432.456";
		double dVal= Double.parseDouble(doubleVal);
		System.out.println(dVal);
		
		String intVal = "143432";
		int iVal= Integer.parseInt(intVal);
		System.out.println(iVal);
	}

}
