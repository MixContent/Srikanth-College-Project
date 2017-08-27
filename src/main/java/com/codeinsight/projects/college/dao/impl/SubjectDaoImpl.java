package com.codeinsight.projects.college.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.codeinsight.projects.college.dao.ISubjectDao;
import com.codeinsight.projects.college.model.Subject;

@Repository
public class SubjectDaoImpl implements ISubjectDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public int saveSubject(Subject subject) {
		return (Integer) hibernateTemplate.save(subject);
	}

	public void updateSubject(Subject subject) {
		hibernateTemplate.update(subject);
	}

	public void deleteSubject(int subjectId) {
		Subject subject=new Subject();
		subject.setSubjectId(subjectId);
		hibernateTemplate.delete(subject);
	}

	public Subject getSubjectById(int subjectId) {
		return hibernateTemplate.get(Subject.class, subjectId);
	}

	public List<Subject> getAllSubjects() {
		return hibernateTemplate.loadAll(Subject.class);
	}

}
