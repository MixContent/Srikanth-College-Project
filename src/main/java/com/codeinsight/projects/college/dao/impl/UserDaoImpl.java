package com.codeinsight.projects.college.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.codeinsight.projects.college.dao.IUserDao;
import com.codeinsight.projects.college.model.User;

@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public int saveUser(User user) {
		return (Integer) hibernateTemplate.save(user);
	}

	public void updateUser(User user) {
		hibernateTemplate.update(user);
	}

	public void deleteUser(String userId) {
		User user=new User();
		user.setUserId(userId);
		hibernateTemplate.delete(user);
	}

	public User getUserById(String userId) {
		return hibernateTemplate.get(User.class, userId);
	}

	public List<User> getAllUsers() {
		return hibernateTemplate.loadAll(User.class);
	}

}
