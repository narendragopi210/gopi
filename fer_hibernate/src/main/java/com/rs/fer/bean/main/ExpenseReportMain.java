package com.rs.fer.bean.main;

import com.rs.fer.service.FERService;
import com.rs.fer.service.FERServiceImpl;
import com.rs.fer.bean.Expense;
import java.util.List;

public class ExpenseReportMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FERService ferService = new FERServiceImpl();

		int userId = 1;
		String expenseType = "shopping";
		String fromDate = "9th FEB";
		String toDate = "9th FEB";

		List<Expense> expense = ferService.expenseReport(userId, expenseType, fromDate, toDate);
		if (expense == null) {

			System.out.println("no record found");
		} else {
			System.out.println("expense:" + expense.get(16).getDate());
			for (Expense expense1 : expense) {
				System.out.println("expensereport: " + expense1.getExpensetype() + " , " + expense1.getDate() + " , "
						+ expense1.getPrice() + " , " + expense1.getNoofItems() + " , " + expense1.getTotal() + " , "
						+ expense1.getBywhom() + " , " + expense1.getUserid());
			}

		}
	}
}
