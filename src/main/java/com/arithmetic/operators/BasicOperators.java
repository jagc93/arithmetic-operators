package com.arithmetic.operators;

public interface BasicOperators {

	/**
	 * function in charge of sum the parameters consecutively, that is, in the order in which each parameter is received.
	 * @param args
	 * @return
	 */
	public ResponseEQ sum(float... args);

	public ResponseEQ subtract(float... args);
}
