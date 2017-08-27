package com.codeinsight.projects.college.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codeinsight.projects.college.dao.IStudentDao;
import com.codeinsight.projects.college.model.Student;
import com.codeinsight.projects.college.service.IStudentService;

@Service
@Transactional(readOnly = false)
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao studentDao;

	public int saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}

	public void deleteStudent(int studentId) {
		studentDao.deleteStudent(studentId);
	}

	public Student getStudentById(int studentId) {
		return studentDao.getStudentById(studentId);
	}

	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

	/*
	 * public List<Student> getPassedOutStudents(String courseName) { return
	 * studentDao.getPassedOutStudents(courseName); }
	 * 
	 * public List<Student> getStudentsByCourse(String courseName) { return
	 * studentDao.getStudentsByCourse(courseName); }
	 * 
	 * public Student topStudentByCourse(String courseName) { return
	 * studentDao.topStudentByCourse(courseName); }
	 * 
	 * public List<Student> getFailedStudents(String courseName) { return
	 * studentDao.getFailedStudents(courseName); }
	 * 
	 * public List<Student> getStudentsByCity(String city) { return
	 * studentDao.getStudentsByCity(city); }
	 * 
	 * public List<Student> getStudentsByState(String state) { return
	 * studentDao.getStudentsByState(state); }
	 * 
	 * public List<Student> getStudentsByMinAge(int minAge) { return
	 * studentDao.getStudentsByMinAge(minAge); }
	 * 
	 * public List<Student> getStudentsByAgeRange(int minAge, int maxAge) {
	 * return studentDao.getStudentsByAgeRange(minAge, maxAge); }
	 */

}
