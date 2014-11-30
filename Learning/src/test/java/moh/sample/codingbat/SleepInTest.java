package moh.sample.codingbat;

import moh.sample.codingbat.SleepIn;

public class SleepInTest {
	private SleepIn targetSleepIn;
	private int count = 0;
	private int errors = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SleepInTest app = new SleepInTest();
	}

	public SleepInTest() {
		targetSleepIn = new SleepIn();
		sleepInTestCases();
	}

	public void sleepInTest(boolean weekday, boolean vacation, boolean expected) {
		boolean actual = false;

		try {
			actual = targetSleepIn.sleepIn(weekday, vacation);
			System.out.println("Test Called");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error " + e + ", weekday : " + weekday + ", vacation: " + vacation + ", expecxted " + expected);
			e.printStackTrace();
		}
		if (actual != expected) {
			System.out.println("for expected " + expected + ", weekday : " + weekday + ", vacation: " + vacation + ", actual =" + actual);
			errors++;
		}
		count++;
	}

	public void sleepInTestCases() {
		sleepInTest(false, false, true);
		sleepInTest(true, false, false);
		sleepInTest(false, true, true);
		sleepInTest(true, true, true);
		


		System.out.println("Called " + count);
		
		System.out.println("Errors " + errors);
	}
}
