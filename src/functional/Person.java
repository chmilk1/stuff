package functional;

public class Person {

	int a;
	String fName;
	String lName;
	int level;
	public Person(int age, String firstName, String lastName, int level) {
		a = age;
		fName = firstName;
		lName = lastName;
		this.level = level;
		
	}
	
	public int getAge() {
		return a;
	}
	
	public String getFullName() {
		return fName + " " + lName;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void moveToUpperLevel() {
		level = level + 1;
	}
	
}
