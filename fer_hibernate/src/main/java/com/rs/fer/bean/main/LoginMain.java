package com.rs.fer.bean.main;
import com.rs.fer.service.FERService;
import com.rs.fer.service.FERServiceImpl;

public class LoginMain {

public static void main(String[] args) {
		
		
		FERService ferService = new FERServiceImpl();
		String userName = "m";
		String password = "m";
		
		boolean isLogin =  ferService.login(userName,password);
		
		if(isLogin){
		System.out.println("login successfully");
		}else{
		System.out.println("user is unauthorized ");
		
	}

}
}

