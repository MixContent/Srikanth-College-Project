package com.codeinsight.projects.college.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeinsight.projects.college.dao.IUserDao;
import com.codeinsight.projects.college.model.User;
import com.codeinsight.projects.college.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	public int saveUser(User user) {
		return userDao.saveUser(user);
	}

	
	public void updateUser(User user) {
		userDao.updateUser(user);
	}


	public void deleteUser(String userId) {
		userDao.deleteUser(userId);
	}


	public User getUserById(String userId) {
		return userDao.getUserById(userId);
	}


	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

}
