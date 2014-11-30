package moh.sample.codingbat;

import org.junit.Test;

import org.s2n.ddt.util.LangUtils;
import org.s2n.ddt.util.threads.PoolOptions;
import org.s2n.ddt.util.threads.DdtPools;

public class MyPoolTest {
	public static void main(String[] args) {
		MyPoolTest app = new MyPoolTest();
		app.test();
	}
	
	@Test
	public void test() {
		PoolOptions options = new PoolOptions();
		options.setCoreThreads(5);
		options.setMaxThreads(5);
		
		DdtPools.initPool("a", options);
		
		Do1 p = null;
		for (int i = 0; i < 50; i++) {
			p = new Do1();
			DdtPools.offer("a", p);
		}
		LangUtils.sleep(3 + (int) (Math.random() * 3));
		org.junit.Assert.assertNotNull(p);
		org.junit.Assert.assertEquals(Do1.getLs(), 50);
	}

}

class Do1 implements Runnable {
	volatile static long l = 0;
	private  long task = 0;

	public Do1() {
		task = l++;
		System.out.println("thread allocated " + l);
	}

	public void run() {
		LangUtils.sleep(1 + (int) (Math.random() * 300));
		System.out.println("Task "  + task + " Thread exiting "  + Thread.currentThread().getName() );
	}

	public static long getLs() {
		return l;
	}
}
