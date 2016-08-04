package v2;

import java.util.ArrayList;

public class League {
	ArrayList<Person> students= new ArrayList<Person>();
	
	public void addStudent(Person p) {
		students.add(p);
	}
	
	public ArrayList<Person> getStudents() {
		return students;
	}
	
	public ArrayList<Person> moveAllStudentsToUpperLevel() {
		for (Person person : students) {
			person.moveToUpperLevel();
		}
		return students;
	}
	
	public ArrayList<Person> getStudentsAbove(int age) {
		ArrayList<Person> ret = new ArrayList<Person>();
		for (Person person : ret) {
			if (person.getAge() > age) {
				ret.add(person);
			}
		}
		return ret;
	}
}
