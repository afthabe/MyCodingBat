package moh.academic.files;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringSort {
	private ArrayList<Person> people;
	PersonNameComparator comp;

	public static void main(String[] args) {
		StringSort app = new StringSort();
		app.stringOps();
	}

	public StringSort() {
		super();
		people = new ArrayList<Person>() ;
	}

	private void stringOps() {
		fillStrings();
		sortStrings();
		listStrings();
	}

	private void listStrings() {
	 for (Person p : people) {
		 System.out.println("Sort Key: " + p.cName );
	 }
	}

	private void sortStrings() {
		PersonNameComparator comp = new PersonNameComparator();
		Collections.sort(people, comp);
	}

	private void fillStrings() {
		// TODO Auto-generated method stub
		Person p = new Person("Mujeeb Rahman");
		people.add(p);
		p = new Person(";;;; George Bush");
		people.add(p);
		p = new Person("-:: Mujeeb Raheem");
		people.add(p);
		p = new Person("Obama");
		people.add(p);
		p = new Person("Zia-Haque ");
		people.add(p);
	
		p = new Person("Mujee bRahman");
		people.add(p);
		p = new Person("Afthab;;; Ellath");
		people.add(p);
		p = new Person("A ft ha -  b : Ellath");
		people.add(p);
	}
}

class Person {
	public String aName;
	public String cName;

	public Person(String aName) {
		this.aName = aName;
		this.cName = convertName(aName);
	}

	private String convertName(String aName) {
		StringBuilder n = new StringBuilder();
		for (char c : aName.toCharArray()) {
			if (Character.isAlphabetic(c)) {
				n.append(c);
			}
		}
		return n.toString();
	}
}

class PersonNameComparator implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		return o1.cName.compareTo(o2.cName);
	}
}
