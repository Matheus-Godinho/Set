package model.entities;

import java.util.HashSet;
import java.util.Set;

public class Course {
	
	private Character name;
	
	private Set<Student> students;

	public Course() {
		students = new HashSet<>();
	}
	public Course(Character name) {
		this.name = name;
		
		students = new HashSet<>();
	}
	
	public Character getName() {
		return name;
	}
	public void setName(Character name) {
		this.name = name;
	}

	public Set<Student> getStudents() {
		return students;
	}
	public void addStudent(Student student) {
		getStudents().add(student);
	}
	public void removeStudent(Student student) {
		getStudents().remove(student);
	}

}

