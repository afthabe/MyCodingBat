package moh.sample.codingbat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//Calender1();
		Calender2();
		Calender3();
		//compareDate1();
		//compareDate2();
		//compareDate3();
	}
	public static void Calender1() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		String date = sdf.format(new Date()); 
		System.out.println(date); //15/10/2013
		
		sdf.applyPattern("dd-M-yyyy hh:mm:ss");
		String dateInString = "31-08-1982 10:20:56";
		
				//Date date1 = sdf.parse(dateInString);
		
				Date date1 = null;
		try {
			date1 = sdf.parse(dateInString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(date1); //Tue Aug 31 10:20:56 SGT 1982
	
		sdf.applyPattern("yyyy/MM/dd HH:mm:ss");
		Date date2 = new Date();
		System.out.println(sdf.format(date2)); //2013/10/15 16:16:39
		
		sdf.applyPattern("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar(2013,0,31);
		System.out.println(sdf.format(calendar.getTime()));
	}
	
	public static void Calender2() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
		Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
	 
		int year       = calendar.get(Calendar.YEAR);
		int month      = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); 
		int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);
	
		int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
		int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		int minute     = calendar.get(Calendar.MINUTE);
		int second     = calendar.get(Calendar.SECOND);
		int millisecond= calendar.get(Calendar.MILLISECOND);
	
		System.out.println(sdf.format(calendar.getTime()));
	
		System.out.println("year \t\t: " + year);
		System.out.println("month \t\t: " + month);
		System.out.println("dayOfMonth \t: " + dayOfMonth);
		System.out.println("dayOfWeek \t: " + dayOfWeek);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);
	
		System.out.println("hour \t\t: " + hour);
		System.out.println("hourOfDay \t: " + hourOfDay);
		System.out.println("minute \t\t: " + minute);
		System.out.println("second \t\t: " + second);
	
		System.out.println("millisecond \t: " + millisecond);
	}
	public static void Calender3() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
	
		Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);	
		System.out.println("#1. " + sdf.format(calendar.getTime()));
	
		//update a date
		calendar.set(Calendar.YEAR, 2014);
		calendar.set(Calendar.MONTH, 11);
		calendar.set(Calendar.MINUTE, 33);
	
		System.out.println("#2. " + sdf.format(calendar.getTime()));
		calendar.add(Calendar.MONTH, 3);
		System.out.println("#3. " + sdf.format(calendar.getTime()));
		calendar.roll(Calendar.MONTH, 10);
		System.out.println("#4. " + sdf.format(calendar.getTime()));
		

	}
	public static void compareDate1() {
		try{
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        	Date date1 = sdf.parse("2009-12-31");
        	Date date2 = sdf.parse("2010-01-31");
 
        	System.out.println(sdf.format(date1));
        	System.out.println(sdf.format(date2));
 
        	if(date1.compareTo(date2)>0){
        		System.out.println("Date1 is after Date2");
        	}else if(date1.compareTo(date2)<0){
        		System.out.println("Date1 is before Date2");
        	}else if(date1.compareTo(date2)==0){
        		System.out.println("Date1 is equal to Date2");
        	}else{
        		System.out.println("How to get here?");
        	}
    	}catch(ParseException ex){
    		ex.printStackTrace();
    	}
	}
	public static void compareDate2() {
 	try{
 		 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	Date date1 = sdf.parse("2009-12-31");
    	Date date2 = sdf.parse("2010-01-31");

    	System.out.println(sdf.format(date1));
    	System.out.println(sdf.format(date2));

    	if(date1.after(date2)){
    		System.out.println("Date1 is after Date2");
    	}

    	if(date1.before(date2)){
    		System.out.println("Date1 is before Date2");
    	}

    	if(date1.equals(date2)){
    		System.out.println("Date1 is equal Date2");
    	}

	}catch(ParseException ex){
		ex.printStackTrace();
	}
  }
  public static void compareDate3() {
	try{
		 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	Date date1 = sdf.parse("2009-12-31");
    	Date date2 = sdf.parse("2010-01-31");

    	System.out.println(sdf.format(date1));
    	System.out.println(sdf.format(date2));

    	Calendar cal1 = Calendar.getInstance();
    	Calendar cal2 = Calendar.getInstance();
    	cal1.setTime(date1);
    	cal2.setTime(date2);

    	if(cal1.after(cal2)){
    		System.out.println("Date1 is after Date2");
    	}

    	if(cal1.before(cal2)){
    		System.out.println("Date1 is before Date2");
    	}

    	if(cal1.equals(cal2)){
    		System.out.println("Date1 is equal Date2");
    	}

	}catch(ParseException ex){
		ex.printStackTrace();
	}
  }
}
