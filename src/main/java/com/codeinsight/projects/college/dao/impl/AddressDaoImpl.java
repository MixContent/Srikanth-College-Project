package com.codeinsight.projects.college.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.codeinsight.projects.college.dao.IAddressDao;
import com.codeinsight.projects.college.model.Address;

@Repository
public class AddressDaoImpl implements IAddressDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public int saveAddress(Address address) {
		return (Integer) hibernateTemplate.save(address);
	}

	public void updateAddress(Address address) {
		hibernateTemplate.update(address);
	}

	public Address getAddressByStudentId(int studentId) {
		return hibernateTemplate.get(Address.class, studentId);
	}

	public List<Address> getAllAddresses() {
		return hibernateTemplate.loadAll(Address.class);
	}

}
