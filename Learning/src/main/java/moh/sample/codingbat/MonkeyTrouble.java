package moh.sample.codingbat;

public class MonkeyTrouble {
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return ((aSmile && bSmile) || (!(aSmile || bSmile)));
	}
}
