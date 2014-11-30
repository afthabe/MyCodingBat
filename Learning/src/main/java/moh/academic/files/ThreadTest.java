package moh.academic.files;

public class ThreadTest {
	public static void main(String[] args) {
       HelloThread ht1=  new HelloThread();
       ht1.start();
       HelloThread ht2=  new HelloThread();
       ht2.start();
       try
       {
          ht1.join();
          ht2.join();
          System.out.println("Thread Exited");
       } catch(InterruptedException e)
       {
          System.out.println("Thread interrupted.");
       }      
	 }
}	
