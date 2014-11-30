package moh.sample.codingbat;

public class SleepIn {
	/*
	 * sleepIn(false, false) → true sleepIn(true, false) → false sleepIn(false, true) → true
	 */
	public boolean sleepIn(boolean weekday, boolean vacation) {
		return vacation || !weekday;
	}
}
