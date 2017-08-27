package com.codeinsight.projects.college.service;

import java.util.List;

import com.codeinsight.projects.college.model.Course;

public interface ICourseService {

	int saveCourse(Course course);
	void updateCourse(Course course);
	void deleteCourse(int courseId);
	Course getCourseById(int courseId);
	List<Course> getAllCourses();
}
