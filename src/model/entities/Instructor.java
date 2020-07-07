package model.entities;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Instructor {
	
	private String name;
	
	private Set<Course> courses;

	public Instructor() {
		courses = new LinkedHashSet<>();
	}
	public Instructor(String name) {
		this.name = name;
		
		courses = new LinkedHashSet<>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<Course> getCourses() {
		return courses;
	}
	public void addCourse(Course course) {
		getCourses().add(course);
	}
	public void removeCourse(Course course) {
		getCourses().remove(course);
	}
	
	public Integer totalStudents() {
		Set<Student> totalStudents;
		
		totalStudents = new HashSet<>();
		for (Course c: getCourses())
			totalStudents.addAll(c.getStudents());
		return totalStudents.size();
	}
	
}
