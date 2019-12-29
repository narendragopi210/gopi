package com.rs.fer.bean.main;

import java.util.Iterator;
import java.util.List;

import com.rs.fer.service.FERService;
import com.rs.fer.service.FERServiceImpl;
import com.rs.fer.bean.Expense;



public class GetExpensesMain {

	public static void main(String[] args) {
		FERService ferService =  new FERServiceImpl();
		
		List<Expense> expenses = ferService.getExpenses(2);
		Iterator<Expense> iterator = expenses.iterator();
		Expense expense = null;
		
		while(iterator.hasNext()) {
			expense = iterator.next();
			
			System.out.println(expense.getId()+" , "+expense.getExpensetype()+" , "+expense.getDate()+" , "+expense.getPrice()+" , "
			+expense.getTotal()+" , "+expense.getNoofItems()+" , "+expense.getBywhom());
		}
		
	}
		
}
