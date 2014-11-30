package moh.sample.threads;

import org.junit.Test;
//import junit.framework.TestCase;

public class NumFormatTest // extends TestCase 

{
	@Test
	public void test() {

		NumberFormat nf = new NumberFormat();
		String form = nf.formatNum(122222.911, "##,###.##");
		
		org.junit.Assert.assertNotNull(nf);
		org.junit.Assert.assertEquals(form, "122,222.91");
		
	}

	@Test
	public void test2() {

		NumberFormat nf = new NumberFormat();
		String form = nf.formatNum(11111.967, "##,###.##");
		
		org.junit.Assert.assertNotNull(nf);
		org.junit.Assert.assertEquals(form, "11,111.97");
		//org.junit.Assert.fail();
	}

}
