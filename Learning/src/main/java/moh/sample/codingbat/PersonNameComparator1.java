package moh.sample.codingbat;

import java.util.Comparator;

public class PersonNameComparator1 implements Comparator<Person> {
	public int compare(Person o1, Person o2) {
	int result ; 
	if (o1.getFirstName().equals(o2.getFirstName())) {
		result = o1.getSecondName().compareTo(o2.getSecondName());
	}
	else {
		result = o1.getFirstName().compareTo(o2.getFirstName());
	}
	return result;
}
}
