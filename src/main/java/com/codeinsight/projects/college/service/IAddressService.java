package com.codeinsight.projects.college.service;

import java.util.List;

import com.codeinsight.projects.college.model.Address;

public interface IAddressService {

	int saveAddress(Address address);
	void updateAddress(Address address);
	/**
	 * Address can't be deleted because for 
	 * one student one address will be alloted
	 * void deleteAddress(int addressId) is invalid 
	 * 
	 * @return
	 */
	Address getAddressByStudentId(int studentId);
	List<Address> getAllAddresses();
}
