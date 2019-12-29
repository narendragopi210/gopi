package com.rs.fer.bean.main;

import com.rs.fer.bean.User;
import com.rs.fer.bean.Address;
import com.rs.fer.service.FERService;
import com.rs.fer.service.FERServiceImpl;

public class UpdatePersonalInfoMain {
	public static void main(String[] args) {
		FERService ferService = new FERServiceImpl();
		User user = new User();
		user.setFirstName("jaya");
		user.setMiddleName("sarika");
		user.setLastName("pathuri");
		user.setUserName("sarika");
		user.setPassword("sarika");
		user.setEmail("jayasarika@gmail.com");
		user.setMobile("6309770662");
		user.setId(1);
		Address address = new Address();
		address.setAddressLine1("nandigama1");
		address.setAddressLine2("nandigama2");
		address.setArea("ntr");
		address.setStreet("nehrunagar");
		address.setCountry("India");
		address.setState("AP");
		address.setPincode(521185);
		address.setUserId(1);
		boolean isUpdate = ferService.updatePersonalInfo(user, address);
		if (isUpdate) {
			System.out.println("personal info updated successfully");
		} else {
			System.out.println("personal info updated failure....please check");

		}

	}

}
