package moh.sample.codingbat;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class HashMapTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Person, Integer> map = new HashMap<>();
	
		PersonComparator  comparer = new PersonComparator();
		Map<Person, Integer> sorted = new TreeMap<Person, Integer>(comparer);

		fillValues(map);
	    sorted.putAll(map);
	    
	    //  System.out.println(sorted);
		printValues(sorted);
	}
	public static void fillValues(Map<Person, Integer> map) {
		Person p = new Person("Mujeeb", "Rahman",2);
		map.put(p,1);
		p = new Person("Zia", "ul-Haque",10);
		map.put(p,2);
		p = new Person("Sara", "Thomas",9);
		map.put(p,3);
		p = new Person("Afthab", "Ellath",8);
		map.put(p,4);
		p = new Person("Mujeeb", "Raheem",9);
		map.put(p,5);
		p = new Person("Afthab", "Ellath",4);
		map.put(p,4);

	}
	public static void printValues(Map<Person, Integer> map) {
		for (Map.Entry<Person, Integer> entry : map.entrySet()) {
		    System.out.println("Key = " + entry.getKey().getFirstName() + ", " + entry.getKey().getSecondName() + ", " + entry.getKey().getScore() + ", Value: " +entry.getValue());
		}
	}		
}


