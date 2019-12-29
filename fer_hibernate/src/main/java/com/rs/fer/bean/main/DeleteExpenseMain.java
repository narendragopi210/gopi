package com.rs.fer.bean.main;

import com.rs.fer.service.FERService;
import com.rs.fer.service.FERServiceImpl;
import com.rs.fer.bean.Expense;

public class DeleteExpenseMain {

	public static void main(String[] args) {

		FERService ferService = new FERServiceImpl();
		Expense expense = new Expense();
		expense.setId(1);
		boolean isDelete = ferService.deleteExpense(expense.getId());

		if (isDelete) {
			System.out.println("Expense deleted Successfully");
		} else {
			System.out.println("Expense deleting failed");
		}
	}
}
