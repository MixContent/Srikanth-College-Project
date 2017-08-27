package com.codeinsight.projects.college.service;

import java.util.List;

import com.codeinsight.projects.college.model.User;

public interface IUserService {

	int saveUser(User user);
	void updateUser(User user);
	void deleteUser(String userId);
	User getUserById(String userId);
	List<User> getAllUsers();
}
