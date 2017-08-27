package com.codeinsight.projects.college.service;

import java.util.List;

import com.codeinsight.projects.college.model.Student;

public interface IStudentService {
	int saveStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(int studentId);
	Student getStudentById(int studentId);
	List<Student> getAllStudents();
	
	/*
	List<Student> getPassedOutStudents(String courseName);
	List<Student> getStudentsByCourse(String courseName);
	Student topStudentByCourse(String courseName);
	List<Student> getFailedStudents(String courseName);
	List<Student> getStudentsByCity(String city);
	List<Student> getStudentsByState(String state);
	List<Student> getStudentsByMinAge(int minAge);
	List<Student> getStudentsByAgeRange(int minAge, int maxAge);
	*/
}