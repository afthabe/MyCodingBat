package moh.sample.threads;

import java.text.DecimalFormat;

public class NumberFormat {
	public NumberFormat () {
		
	}
	public String formatNum (double num, String pattern) {
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		String format = decimalFormat.format(num);
		return format;
	}
}

