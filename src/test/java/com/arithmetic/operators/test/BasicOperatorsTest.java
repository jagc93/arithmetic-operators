package com.arithmetic.operators.test;

import com.arithmetic.operators.BasicOperators;
import com.arithmetic.operators.ResponseEQ;
import com.arithmetic.operators.impl.BasicOperatorsImpl;

public class BasicOperatorsTest {

	public static void main(String[] args) {
		try {
			simpleSumTest();
			simpleSubstracTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void simpleSumTest() {
		BasicOperators basicOperators = new BasicOperatorsImpl();
		ResponseEQ response = basicOperators.sum(1f,1.5f,10);
		System.out.println(response.getArgs());
		System.out.println(response.getOperator().get());
		System.out.println(response.getEquation());
		System.out.println(response.getResult());
	}

	private static void simpleSubstracTest() {
		BasicOperators basicOperators = new BasicOperatorsImpl();
		ResponseEQ response = basicOperators.subtract(5f,1f,1.5f);
		System.out.println(response.getArgs());
		System.out.println(response.getOperator().get());
		System.out.println(response.getEquation());
		System.out.println(response.getResult());
	}
}
