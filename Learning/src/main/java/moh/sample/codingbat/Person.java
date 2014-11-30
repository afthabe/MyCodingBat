package moh.sample.codingbat;

public class Person {
	String firstName;
	String secondName;
	Integer score;
	
	public Person(String firstName, String secondName, Integer score) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.score = score;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", secondName=" + secondName + ", score=" + score + "]";
	}
}
