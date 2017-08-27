package com.codeinsight.projects.college.dao;

import java.util.List;

import com.codeinsight.projects.college.model.User;

public interface IUserDao {

	int saveUser(User user);
	void updateUser(User user);
	void deleteUser(String userId);
	User getUserById(String userId);
	List<User> getAllUsers();
}
