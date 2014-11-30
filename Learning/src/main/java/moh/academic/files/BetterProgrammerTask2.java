package moh.academic.files;

public class BetterProgrammerTask2 {

	public static void main(String[] args) {
       System.out.println(BetterProgrammerTask2.getSumofNumbers(" a fa 22 a a 23 a a 2 a a "));
	}
    public static int getSumofNumbers(String a) {
    	String [] str =a.split (" ");
    	int sum = 0;
    	
    	for (int i=0;i<str.length;i++){
    		try {
				sum += Integer.parseInt(str[i]);
			} catch (NumberFormatException e) { }
				
	    }
    	return sum; 
	}
}
