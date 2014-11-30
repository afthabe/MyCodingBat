package moh.sample.codingbat;
public class CountXX {
	int countXX(String str) {
		int count = 0;
		int i = 0;

		while (i >= 0) {
			i = str.indexOf("xx", i);
			if (i >= 0) {
				count++;
				i++;
			}
		}
		
		return count;
	}
}
