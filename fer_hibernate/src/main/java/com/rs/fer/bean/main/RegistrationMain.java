package com.rs.fer.bean.main;

import com.rs.fer.service.FERService;
import com.rs.fer.service.FERServiceImpl;
import com.rs.fer.bean.User;

public class RegistrationMain {

	public static void main(String[] args) {
		FERService ferService = new FERServiceImpl();
		User user = new User();
		user.setFirstName("m");
		user.setMiddleName("m");
		user.setLastName("s");
		user.setUserName("m");
		user.setPassword("m");
		user.setEmail("m@gmail.com");
		user.setMobile("99999999");

		boolean isRegister = ferService.registration(user);
		if (isRegister) {
			System.out.println("Registration completed Successfully");
		} else {
			System.out.println("Registration failed");
		}
	}
}
