package com.codeinsight.projects.college.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.codeinsight.projects.college.dao.ICourseDao;
import com.codeinsight.projects.college.model.Course;
@Repository
public class CourseDaoImpl implements ICourseDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public int saveCourse(Course course) {
		return (Integer) hibernateTemplate.save(course);
	}

	public void updateCourse(Course course) {
		hibernateTemplate.update(course);
	}

	public void deleteCourse(int courseId) {
		Course course=new Course();
		course.setCourseId(courseId);
		hibernateTemplate.delete(course);
	}

	public Course getCourseById(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Course> getAllCourses() {
		return hibernateTemplate.loadAll(Course.class);
	}
	
}
