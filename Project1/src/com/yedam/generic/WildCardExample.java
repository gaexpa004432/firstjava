package com.yedam.generic;

import java.util.Arrays;

//<?> < ? extends class ?의 하위 클래스> < ? super class ?상위클래스 가능>
//person 	-> worker
//			-> student -> highStudent
// 각 코스별  저장된 객체 출력
public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		
		System.out.println(course.getName() + " " + Arrays.toString(course.getStudents()));
	
		}

	public static void registerStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerStudentSuper(Course<? super Student> course) {
		System.out.println(course.getName() + " " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<Person>("일반인", 5);
		coursePerson.add(new Person("일반인"));
		coursePerson.add(new Worker("직장인"));
		coursePerson.add(new Student("학생"));
		coursePerson.add(new HighStudent("고등학생"));

		Course<Worker> courseWorker = new Course<Worker>("직장인", 5);
		courseWorker.add(new Worker("일반인"));

		Course<Student> courseStudent = new Course<Student>("학생", 5);
		courseStudent.add(new Student("학생"));
		courseStudent.add(new HighStudent("고등학생"));

		Course<HighStudent> courseHighStudent = new Course<HighStudent>("고등학생", 5);
		courseHighStudent.add(new HighStudent("고등학생 "));

		registerCourse(coursePerson);
		registerCourse(courseWorker);
		registerCourse(courseStudent);
		registerCourse(courseHighStudent);
		
		// Course<? extends class> 하위클래스만 가능
		registerStudent(courseStudent);
		registerStudent(courseHighStudent);
		
		// Course<? super class> 상위클래스만 가능
		registerStudentSuper(courseStudent);
		registerStudentSuper(coursePerson);
	}

}
