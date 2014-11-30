package moh.sample.codingbat;

public class StringTimes {
	public String stringTimes(String str, int n) {
		String result;
		if (n < 1) {
			return "";
		} else if (n == 1) {
			return str;
		}
		result = str + stringTimes(str, n - 1);
		return result;
	}
}
