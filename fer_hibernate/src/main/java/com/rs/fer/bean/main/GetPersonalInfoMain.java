package com.rs.fer.bean.main;

import com.rs.fer.bean.PersonalInfo;
import com.rs.fer.bean.User;
import com.rs.fer.service.FERService;
import com.rs.fer.service.FERServiceImpl;

public class GetPersonalInfoMain {

	public static void main(String[] args) {
		FERService ferService = new FERServiceImpl();

		PersonalInfo info = ferService.getPersonalInfo(1);
		if (info != null) {
			System.out.println("username:" + info.getUser().getUserName());
		} else {
			System.out.println("please enter valid user id:");
		}

	}

}
