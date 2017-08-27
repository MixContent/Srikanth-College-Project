package com.codeinsight.projects.college.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codeinsight.projects.college.dao.ISubjectDao;
import com.codeinsight.projects.college.model.Subject;
import com.codeinsight.projects.college.service.ISubjectService;

public class SubjectServiceImpl implements ISubjectService {

	@Autowired
	private ISubjectDao subjectDao;
	
	public int saveSubject(Subject subject) {
		return subjectDao.saveSubject(subject);
	}

	public void updateSubject(Subject subject) {
		subjectDao.updateSubject(subject);
	}

	public void deleteSubject(int subjectId) {
		subjectDao.deleteSubject(subjectId);
	}

	public Subject getSubjectById(int subjectId) {
		return subjectDao.getSubjectById(subjectId);
	}

	public List<Subject> getAllSubjects() {
		return subjectDao.getAllSubjects();
	}

}
