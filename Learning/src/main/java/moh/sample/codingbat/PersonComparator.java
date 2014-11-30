package moh.sample.codingbat;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{
		public int compare(Person o1, Person o2) {
			int result ; 
			if (o1.getFirstName().equals(o2.getFirstName())) {
				if (o1.getSecondName().equals(o2.getSecondName())) {
					result = o1.getScore().compareTo(o2.getScore());
				}
				else {
					result = o1.getSecondName().compareTo(o2.getSecondName());
				}}
			else {
					result = o1.getFirstName().compareTo(o2.getFirstName());
			}
			return result;
		}
	}
