package com.codeinsight.projects.college.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codeinsight.projects.college.dao.ICourseDao;
import com.codeinsight.projects.college.model.Course;
import com.codeinsight.projects.college.service.ICourseService;

public class CourseServiceImpl implements ICourseService{

	@Autowired
	private ICourseDao courseDao;

	public int saveCourse(Course course) {
		return courseDao.saveCourse(course);
	}

	public void updateCourse(Course course) {
		courseDao.updateCourse(course);
	}

	public void deleteCourse(int courseId) {
		courseDao.deleteCourse(courseId);
	}

	public Course getCourseById(int courseId) {
		return courseDao.getCourseById(courseId);
	}

	public List<Course> getAllCourses() {
		return courseDao.getAllCourses();
	}
	
	
}
