package com.rs.fer.bean.main;


import com.rs.fer.service.FERService;
import com.rs.fer.service.FERServiceImpl;
import com.rs.fer.bean.Expense;



public class GetExpenseMain {

	public static void main(String[] args) {
		
	FERService ferService= new FERServiceImpl();
	
	
	
	
		Expense expense= new Expense();		 
		expense=ferService.getExpense(3);			
			if(expense !=null){
			System.out.println("Expense Fetched Successfully");
			}else{
			System.out.println("Expense Fetching Failed");
			}
	}
}
