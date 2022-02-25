package com.arithmetic.operators.impl;

import com.arithmetic.operators.Operators;
import com.arithmetic.operators.ResponseEQ;

public class ResponseEQImpl extends GlobalFormat implements ResponseEQ {

	private Operators operator = null;
	private float[] args;
	private String result = "0";
	private String equation = null;

	public Operators getOperator() {
		return operator;
	}

	public void setOperator(Operators operator) {
		this.operator = operator;
	}

	public float[] getArgs() {
		return args;
	}

	public void setArgs(float[] args) {
		this.args = args;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getEquation() {

		if (operator == null) {
			equation = null;
		} else if (operator.equals(Operators.PLUS)) {
			setEquation(Sum.eq(args));
		} else if (operator.equals(Operators.MINUS)) {
			setEquation(Subtract.eq(args));
		} else {
			equation = null;
		}

		return equation;
	}

	public void setEquation(String equation) {
		this.equation = equation;
	}

	public void sum() {
		setResult(formatResult(Sum.exec(args)));
	}

	public void subtract() {
		setResult(formatResult(Subtract.exec(args)));
	}

	private static class Sum {

		public static float exec(float... args) {

			float result = 0;

			if (args == null) {
				return result;
			}

			for(int idx = 0; idx < args.length; idx++) {
				result += args[idx];
			}

			return result;
		}

		public static String eq(float... args) {

			if (args == null) {
				return null;
			}

			StringBuilder equation = new StringBuilder();

			for(int idx = 0; idx < args.length; idx++) {
				equation.append(args[idx]);

				if (args.length > 1) {
					equation.append(" ");
					equation.append(Operators.PLUS.get());
					equation.append(" ");
				}

				if (args.length - 1 == idx) {
					String sbStr = equation.toString().substring(0, equation.toString().lastIndexOf(Operators.PLUS.get()));
					equation.setLength(0);
					equation.append(sbStr.trim());
					equation.append(" ");
					equation.append(Operators.EQUALS.get());
					equation.append(" ");
					equation.append(Sum.exec(args));
				}
			}

			return equation.toString();
		}
	}

	private static class Subtract {

		public static float exec(float... args) {

			float result = 0;

			if (args == null) {
				return result;
			}

			for(int idx = 0; idx < args.length; idx++) {
				if (idx == 0) {
					result = args[idx];
				} else {
					result -= args[idx];					
				}
			}

			return result;
		}

		public static String eq(float... args) {

			if (args == null) {
				return null;
			}

			StringBuilder equation = new StringBuilder();

			for(int idx = 0; idx < args.length; idx++) {
				equation.append(args[idx]);

				if (args.length > 1) {
					equation.append(" ");
					equation.append(Operators.MINUS.get());
					equation.append(" ");
				}

				if (args.length - 1 == idx) {
					String sbStr = equation.toString().substring(0, equation.toString().lastIndexOf(Operators.MINUS.get()));
					equation.setLength(0);
					equation.append(sbStr.trim());
					equation.append(" ");
					equation.append(Operators.EQUALS.get());
					equation.append(" ");
					equation.append(Subtract.exec(args));
				}
			}

			return equation.toString();
		}
	}
}
