package com.codeinsight.projects.college.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeinsight.projects.college.dao.IAddressDao;
import com.codeinsight.projects.college.model.Address;
import com.codeinsight.projects.college.service.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService{

	@Autowired
	private IAddressDao addressDao;

	public int saveAddress(Address address) {
		return addressDao.saveAddress(address);
	}

	public void updateAddress(Address address) {
		addressDao.updateAddress(address);
	}

	public Address getAddressByStudentId(int studentId) {
		return addressDao.getAddressByStudentId(studentId);
	}

	public List<Address> getAllAddresses() {
		return addressDao.getAllAddresses();
	}
	
}
