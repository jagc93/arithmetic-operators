package com.arithmetic.operators;

public enum Operators {
	PLUS("+"),
	MINUS("-"),
	MULTIPLICATION("x"),
	DIVISION("/"),
	EQUALS("=");

	private String operator;

	public String get() {
		return operator;
	}

	Operators(String operator) {
		this.operator = operator;
	}
}
