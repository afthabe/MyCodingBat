package moh.sample.codingbat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import moh.sample.codingbat.Person;

public class ArrayListTest {

	/**
	 * @param args
	 */
	ArrayList<Person> people;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListTest app = new ArrayListTest();
		app.listOperations();
	}

	private void listOperations() {
		// TODO Auto-generated method stub
		fillPeople();

		// sortPeople(people, new PersonComparator(), "List by Name-Score");
		// sortPeople(people, new PersonNameComparator(), "List by Name");
		// sortPeople(people, new PersonScoreComparator(), "List by Score");

		searchName(people, "Ell");
		topScorers(people, 80);

		// sortPeopleByName(people);
		// sortPeopleByScore(people);
		// sortPeopleByNameScore(people);
	}

	private void searchName(ArrayList<Person> people, String str) {
		ArrayList<Person> subList = new ArrayList<Person>();
		// Iterator<Person> itr = people.iterator();
		// while (itr.hasNext()) {
		// Person pers = itr.next();
		// //if ((pers.getFirstName().indexOf(str) >= 0) || (pers.getSecondName().indexOf(str) >= 0)){
		// if ((pers.getFirstName().contains(str)) || (pers.getSecondName().contains(str))) {
		// subList.add(pers);
		// }
		// }

		for (Person pers : people) {
			if ((pers.getFirstName().contains(str)) || (pers.getSecondName().contains(str))) {
				subList.add(pers);
			}
		}
		printList(subList, "Person Matching: " + str);
	}

	private void topScorers(ArrayList<Person> people, int baseScore) {
		ArrayList<Person> subList = new ArrayList<Person>();
//		Iterator<Person> itr = people.iterator();
//		while (itr.hasNext()) {
//			Person pers = itr.next();
//			if (pers.getScore().intValue() >= baseScore) {
//				subList.add(pers);
//			}
//		}
		for (Person pers : people) {
			if (pers.getScore().intValue() >= baseScore) {
				subList.add(pers);
			}
		}
		printList(subList, "Top Scorers");
	}

	public ArrayListTest() {
		people = new ArrayList<Person>();
	}

	private void sortPeople(ArrayList<Person> people, Comparator<Person> comp, String msg) {
		// PersonComparator comp = new PersonComparator();
		Collections.sort(people, comp);
		printList(people, msg);
	}

	/*
	 * private void sortPeopleByNameScore(ArrayList<Person> people) { PersonComparator comp = new PersonComparator();
	 * Collections.sort(people,comp); printList(people,"List by Name Score");
	 * 
	 * }
	 * 
	 * private void sortPeopleByName(ArrayList<Person> people) { PersonNameComparator comp = new PersonNameComparator();
	 * Collections.sort(people,comp); printList(people,"List by Name"); }
	 * 
	 * private void sortPeopleByScore(ArrayList<Person> people) { PersonScoreComparator comp = new PersonScoreComparator();
	 * Collections.sort(people,comp); printList(people,"List by Score"); }
	 */
	private void printList(ArrayList<Person> people, String msg) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println(msg);
		System.out.println();
		Iterator<Person> itr = people.iterator();
		while (itr.hasNext()) {
			Person obj = itr.next();
			System.out.println(obj.toString());
		}
	}

	private void fillPeople() {
		// TODO Auto-generated method stub
		Person p = new Person("Mujeeb", "Rahman", 2);
		people.add(p);
		p = new Person("Zia", "ul-Haque", 90);
		people.add(p);
		p = new Person("Sara", "Thomas", 92);
		people.add(p);
		p = new Person("Afthab", "Ellath", 82);
		people.add(p);
		p = new Person("Mujeeb", "Raheem", 91);
		people.add(p);
		p = new Person("Afthab", "Ellath", 42);
		people.add(p);
	}
}
