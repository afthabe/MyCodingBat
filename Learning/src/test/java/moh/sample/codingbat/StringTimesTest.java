package moh.sample.codingbat;

import moh.sample.codingbat.StringTimes;

public class StringTimesTest {
	int errors = 0;
	int count = 0;
	StringTimes st;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringTimesTest app = new StringTimesTest();
	}

	public StringTimesTest() {
		st = new StringTimes();
		stringTimesTestCases();
	}

	public void testSumDouble(String str, int times, String expected) {
		String result=null;
		try {
			result = st.stringTimes(str, times);
			System.out.println("Called ");
		} catch (Exception e) {
			System.out.println("Error " + e + ", String : " + str + ", times: " + times + ", expected " + expected);
			e.printStackTrace();
		}
		if (!result.isEmpty() && !result.equals(expected)) {
			System.out.println("The expcted aswer was " + expected + ", but got: " + result);
			errors++;
		}
		count++;
	}

	public void stringTimesTestCases() {
		testSumDouble("Afthab", 1, "Afthab");
		testSumDouble("Afthab", 0, "");
		testSumDouble("Afthab", 4, "AfthabAfthabAfthabAfthab");
		testSumDouble("Afthab", 5, "AfthabAfthabAfthabAfthabAfthab");
		System.out.println("Count :" + count);
		System.out.println("Errors :" + errors);
		
	}
}
