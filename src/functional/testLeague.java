package functional;

import static org.junit.Assert.*;

import org.junit.Test;

public class testLeague {

	@Test
	public void testAddAndGet() {
		Person john = new Person(15, "John", "Snow", 1);
		League league = new League();
		assertTrue(league.getStudents().isEmpty());
		league.addStudent(john);
		assertEquals(league.getStudents().size(), 1);
	}
	
	@Test
	public void testMoveStudentsToUpperLevel() {
		Person john = new Person(15, "John", "Snow", 1);
		Person noone = new Person(16, "Ed", "Ward", 2);
		Person third = new Person(15, "Third", "Students", 3);
		League league = new League();
		league.addStudent(john);
		league.addStudent(noone);
		league.addStudent(third);
		assertEquals(league.getStudents().size(), 3);
		league.moveAllStudentsToUpperLevel();
		assertEquals(2, john.getLevel());
		assertEquals(3, noone.getLevel());
		assertEquals(4, third.getLevel());
	}
	@Test
	public void testRemoveGrads(){
		Person donacdumb = new Person(16, "Jhon", "Doe", 9);
		Person john = new Person(15, "John", "Snow", 1);
		Person noone = new Person(16, "Ed", "Ward", 9);
		Person third = new Person(15, "Third", "Students", 3);
		League league = new League();
		league.addStudent(donacdumb);
		league.addStudent(john);
		league.addStudent(noone);
		league.addStudent(third);
		assertEquals(league.getStudents().size(), 4);
		league.removeGrads();
		assertEquals(league.getStudents().size(), 2);
		assertFalse(league.getStudents().contains(noone));
	}
	
}
