package moh.sample.codingbat;

import java.util.Comparator;

public class PersonNameComparator1 implements Comparator<Person> {
	public int compare(Person o1, Person o2) {
	int result ; 
	if (o1.getName().equals(o2.getName())) {
		result = o1.getName().compareTo(o2.getName());
	}
	else {
		result = o1.getName().compareTo(o2.getName());
	}
	return result;
}
}
