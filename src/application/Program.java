package application;

import java.util.Scanner;

import model.entities.Course;
import model.entities.Instructor;
import model.entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Instructor instructor;
		Student student;
			int code;
		int n;
			
		instructor = new Instructor("Alex");
		instructor.addCourse(new Course('A'));
		instructor.addCourse(new Course('B'));
		instructor.addCourse(new Course('C'));
		for (Course c: instructor.getCourses()) {
			n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
					code = sc.nextInt();
				student = new Student(code);
				c.addStudent(student);
			}
		}
		
		System.out.printf("%d%n", instructor.totalStudents());
		
		sc.close();

	}

}