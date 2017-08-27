package com.codeinsight.projects.college.dao;

import java.util.List;

import com.codeinsight.projects.college.model.Subject;

public interface ISubjectDao {
	int saveSubject(Subject subject);
	void updateSubject(Subject subject);
	void deleteSubject(int subjectId);
	Subject getSubjectById(int subjectId);
	List<Subject> getAllSubjects();
}
