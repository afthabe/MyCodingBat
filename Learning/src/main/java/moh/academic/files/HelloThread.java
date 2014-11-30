package moh.academic.files;
public class HelloThread extends Thread {
	static int counter = 0; 
	HelloThread() {
	   super("Thread: " + (++counter));	
	}
    public void run() {
    	for (int i=0;i<100;i++) {
           System.out.println("Hello from a thread! " +i);
           try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	}
    System.out.println("Thread exiting." + Thread.currentThread().getName());
    }
}