package moh.sample.codingbat;

import moh.sample.codingbat.SumDouble;

public class SumDoubleTest {
    private int count=0;
    private int errors=0;
    private SumDouble sd ;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumDoubleTest app= new SumDoubleTest() ;
	}
	public SumDoubleTest() {
		sd = new SumDouble();
		sumDoubleTestCases();
	}
	public void sumDoubleTest(int aNum, int bNum, int expected)
	{
		int actual = 0 ;
		try {
			actual = sd.sumDouble(aNum,bNum);
			System.out.println("Test Called");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error " + e + ", Number 1 : " + aNum + ", Number 2: " + bNum + ", expected " + expected);
			e.printStackTrace();
		}
		if (actual != expected){
			System.out.println("for expected result: " + expected + " for Number 1 : " + aNum + "and  Number 2: " + bNum + ", actual = " + actual);
			errors++;
		}
		count ++;
	}

	public void sumDoubleTestCases()
	{
		sumDoubleTest(10, 10, 40);
		sumDoubleTest(12, 19,31);
		sumDoubleTest(24, 24, 96);
		sumDoubleTest(25, 24, 49);
		
		System.out.println("Called " + count);
		System.out.println("Errors " + errors);
	}
}
