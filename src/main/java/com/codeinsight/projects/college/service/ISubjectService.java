package com.codeinsight.projects.college.service;

import java.util.List;

import com.codeinsight.projects.college.model.Subject;

public interface ISubjectService {
	
	int saveSubject(Subject subject);
	void updateSubject(Subject subject);
	void deleteSubject(int subjectId);
	Subject getSubjectById(int subjectId);
	List<Subject> getAllSubjects();
}
