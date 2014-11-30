package moh.sample.codingbat;

import java.util.Comparator;

public class PersonScoreComparator implements Comparator<Person> {
	public int compare(Person o1, Person o2) {
		return o1.getScore().compareTo(o2.getScore());
	}
}
