package com.rs.fer.bean.main;

import com.rs.fer.service.FERService;
import com.rs.fer.service.FERServiceImpl;
import com.rs.fer.bean.Expense;

public class AddExpenseMain {
		public static void main(String[] args) {
			FERService ferService= new FERServiceImpl();
			Expense expense= new Expense();
				expense.setId(2);
				expense.setExpensetype("party");
				expense.setDate("9th FEB");
				expense.setPrice(500);
				expense.setNoofItems(4);
				expense.setTotal(2000);
				expense.setBywhom("s");
				expense.setUserid(1);

			  boolean isAdd=ferService.addExpense(expense);
			 if(isAdd){
			 System.out.println("Expenses added Successfully");
		}else{
		System.out.println("Expenses adding failed");
		}
		}

	}


