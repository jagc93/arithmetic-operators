package com.arithmetic.operators.impl;

import java.text.DecimalFormat;

public class GlobalFormat {

	protected String patternResult = null;

	protected String formatResult(Object param) {

		DecimalFormat df = null;

		if (patternResult != null) {
			df = new DecimalFormat(patternResult);
		} else {
			df = new DecimalFormat();
		}

		return df.format(param);
	}

}
