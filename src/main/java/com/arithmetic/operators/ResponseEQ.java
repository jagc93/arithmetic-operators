package com.arithmetic.operators;

public interface ResponseEQ {

	/**
	 * returns the operator of an equation
	 * @return
	 */
	public Operators getOperator();

	/**
	 * returns the numbers to operate
	 * @return
	 */
	public float[] getArgs();

	/**
	 * returns the result of the operation
	 * @return
	 */
	public String getResult();

	/**
	 * returns the equation
	 * @return
	 */
	public String getEquation();
}
