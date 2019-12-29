package com.rs.fer.bean.main;

import com.rs.fer.service.FERService;
import com.rs.fer.service.FERServiceImpl;
import com.rs.fer.bean.User;

public class ResetPasswordMain {

	public static void main(String[] args) {
		FERService ferService = new FERServiceImpl();

		int userId = 1;
		String currentPassword = "sarika";
		String newPassword = "jaya1";

		boolean isResetPassword = ferService.resetPassword(userId, currentPassword, newPassword);
		if (isResetPassword) {
			System.out.println("Password reseted successfully");
		} else {
			System.out.println("Password reseting failed");

		}

	}

}
