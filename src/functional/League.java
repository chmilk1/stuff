package functional;

import java.util.ArrayList;

public class League {
	ArrayList<Person> students = new ArrayList<Person>();

	public void addStudent(Person p) {
		students.add(p);
	}

	public ArrayList<Person> getStudents() {
		return students;
	}

	public ArrayList<Person> moveAllStudentsToUpperLevel() {
		students.forEach(a -> a.moveToUpperLevel());
		return students;
	}

	public ArrayList<Person> getStudentsAbove(int age) {
		ArrayList<Person> ret = new ArrayList<Person>();
		students.forEach(a -> {if(a.getAge() > age) ret.add(a);	});
		return ret;
	}
	public void removeGrads(){
		students.removeIf(i -> i.getLevel() > 8);
	}
}
