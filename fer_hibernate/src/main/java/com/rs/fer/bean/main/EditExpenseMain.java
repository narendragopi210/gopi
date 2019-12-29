package com.rs.fer.bean.main;

import com.rs.fer.service.FERService;
import com.rs.fer.service.FERServiceImpl;
import com.rs.fer.bean.Expense;

public class EditExpenseMain {

	public static void main(String[] args) {
		FERService ferService= new FERServiceImpl();
		Expense expense= new Expense();
		    expense.setExpensetype("party");
			expense.setDate("8th MAY");
			expense.setPrice(1000);
			expense.setNoofItems(6);
			expense.setTotal(6000);
			expense.setBywhom("sasi");
			expense.setUserid(1);
			expense.setId(15);
			
			
		boolean isEdit=ferService.editExpense(expense);
		 if(isEdit){
		 System.out.println("Expenses edited Successfully");
	}else{
	System.out.println("Expenses editing failed");
	}
	}
	}		
		 
