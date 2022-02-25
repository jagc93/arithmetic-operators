package com.arithmetic.operators.impl;

import com.arithmetic.operators.BasicOperators;
import com.arithmetic.operators.Operators;
import com.arithmetic.operators.ResponseEQ;

public class BasicOperatorsImpl extends GlobalFormat implements BasicOperators {


	public BasicOperatorsImpl() {
		super();
	}

	public ResponseEQ sum(float... args) {

		ResponseEQImpl response = new ResponseEQImpl();
		response.setArgs(args);
		response.setOperator(Operators.PLUS);
		response.sum();

		return response;
	}

	public ResponseEQ subtract(float... args) {

		ResponseEQImpl response = new ResponseEQImpl();
		response.setArgs(args);
		response.setOperator(Operators.MINUS);
		response.subtract();

		return response;
	}
}
