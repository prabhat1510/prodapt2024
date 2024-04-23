package junitexamples.calculatorapp;

public class Addition implements Calculator {

	@Override
	public Integer calculate(Integer num1, Integer num2) {
		return num1+num2;
	}

}
