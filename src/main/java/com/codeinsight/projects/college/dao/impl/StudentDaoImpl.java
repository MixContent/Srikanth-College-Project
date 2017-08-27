package com.codeinsight.projects.college.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.codeinsight.projects.college.dao.IStudentDao;
import com.codeinsight.projects.college.model.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public int saveStudent(Student student) {
		return (Integer) hibernateTemplate.save(student);
	}

	public void updateStudent(Student student) {
		hibernateTemplate.update(student);
	}

	public void deleteStudent(int studentId) {
		Student student=new Student();
		student.setStudentId(studentId);
		hibernateTemplate.delete(student);
	}


	public Student getStudentById(int studentId) {
		return hibernateTemplate.get(Student.class,studentId);
	}
	
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudents() {
		String hqlQuery = "from Student student";
		return (List<Student>) hibernateTemplate.find(hqlQuery);
	}

	/*
	public List<Student> getPassedOutStudents(String courseName) {
		String hqlQuery = "select student from Student student, StudentMarks mark where student.studentRollNo= mark.studentRollNo and courseName=:courseName and passStatus=:passStatus";
		return (List<Student>) hibernateTemplate.find(hqlQuery, courseName);
	}

	public List<Student> getStudentsByCourse(String courseName) {
		String hqlQuery = "select student from Student student, StudentMarks mark where student.studentRollNo= mark.studentRollNo and courseName=:courseName";
		return (List<Student>) hibernateTemplate.find(hqlQuery, courseName);
	}

	public Student topStudentByCourse(String courseName) {
		String hqlQuery = "select student from Student student, StudentMarks mark where student.studentRollNo= mark.studentRollNo and courseName=:courseName";
		return (Student) hibernateTemplate.find(hqlQuery, courseName);
	}

	public List<Student> getFailedStudents(String courseName) {
		String hqlQuery = "select student from Student student, StudentMarks mark where student.studentRollNo= mark.studentRollNo and courseName=:courseName";
		return (List<Student>) hibernateTemplate.find(hqlQuery, courseName);
	}

	public List<Student> getStudentsByCity(String city) {
		String hqlQuery = "select student from Student student, StudentMarks mark where student.studentRollNo= mark.studentRollNo and courseName=:courseName";
		return (List<Student>) hibernateTemplate.find(hqlQuery, city);
	}

	public List<Student> getStudentsByState(String state) {
		String hqlQuery = "select student from Student student, StudentMarks mark where student.studentRollNo= mark.studentRollNo and courseName=:courseName";
		return (List<Student>) hibernateTemplate.find(hqlQuery, state);
	}

	public List<Student> getStudentsByMinAge(int minAge) {
		String hqlQuery = "select student from Student student, StudentMarks mark where student.studentAge>:minAge";
		return (List<Student>) hibernateTemplate.find(hqlQuery, minAge);
	}

	public List<Student> getStudentsByAgeRange(int minAge, int maxAge) {
		String hqlQuery = "select student from Student student, StudentMarks mark where student.studentAge>:minAge and student.studentAge>:maxAge";
		return (List<Student>) hibernateTemplate.find(hqlQuery, minAge, maxAge);
	}
	
*/	
}
