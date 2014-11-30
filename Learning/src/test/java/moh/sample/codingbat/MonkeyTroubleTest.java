package moh.sample.codingbat;

import moh.sample.codingbat.MonkeyTrouble;

public class MonkeyTroubleTest {
	
	private MonkeyTrouble testMT;
	private int count = 0;
	private int errors = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MonkeyTroubleTest app = new MonkeyTroubleTest();

	}
	
	public MonkeyTroubleTest() {
		testMT = new MonkeyTrouble();
		monkeyTroubleTestCases();
	}

	public void monkeyTroubleTest(boolean aSmile , boolean bSmile , boolean expected) {
		boolean actual = false;

		try {
			actual = testMT.monkeyTrouble(aSmile, bSmile);
			System.out.println("Test Called");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error " + e + ", aSmile : " + aSmile + ", bSmile: " + bSmile + ", expected " + expected);
			e.printStackTrace();
		}
		if (actual != expected) {
			System.out.println("for expected " + expected + ", aSmile : " + aSmile + ", bSmile: " + bSmile +  ", actual =" + actual);
			errors++;
		}
		count++;
	}

	public void monkeyTroubleTestCases() {
		monkeyTroubleTest(false, false, true);
		monkeyTroubleTest(true, true, true);
		monkeyTroubleTest(false, true, false);
		monkeyTroubleTest(true, false, false);
		
		System.out.println("Called " + count);
		System.out.println("Errors " + errors);
	}

}
