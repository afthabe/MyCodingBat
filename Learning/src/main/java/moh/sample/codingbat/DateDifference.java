package moh.sample.codingbat;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifference {

	public static void main(String[] args) {
		try {
			String date1 = "07/15/2013";
			String time1 = "11:00 AM";
			String date2 = "07/17/2013";
			String time2 = "12:15 AM";

			String format = "MM/dd/yyyy hh:mm a";

			SimpleDateFormat sdf = new SimpleDateFormat(format);

			Date dateObj1 = sdf.parse(date1 + " " + time1);
			Date dateObj2 = sdf.parse(date2 + " " + time2);
			System.out.println(dateObj1);
			System.out.println(dateObj2 + "\n");

			DecimalFormat mFormatter = new DecimalFormat("###,###");

			long diff = dateObj2.getTime() - dateObj1.getTime();

			int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
			System.out.println("difference between days: " + diffDays);

			int diffhours = (int) (diff / (60 * 60 * 1000));
			System.out.println("difference between hours: " + mFormatter.format(diffhours));

			int diffmin = (int) (diff / (60 * 1000));
			System.out.println("difference between minutes: " + mFormatter.format(diffmin));

			int diffsec = (int) (diff / (1000));
			System.out.println("difference between seconds: " + mFormatter.format(diffsec));

			System.out.println("difference between milliseconds: " + mFormatter.format(diff));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
