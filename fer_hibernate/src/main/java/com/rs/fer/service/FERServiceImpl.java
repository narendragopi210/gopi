
package com.rs.fer.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rs.fer.bean.Address;
import com.rs.fer.bean.Expense;
import com.rs.fer.bean.PersonalInfo;
import com.rs.fer.bean.User;
import com.rs.fer.hibernateutil.HBUtil;

public class FERServiceImpl implements FERService {
	boolean isReg = false;

	public boolean registration(User user) {
		Session session = HBUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {

			transaction = session.beginTransaction();
			int i = (Integer) session.save(user);
			transaction.commit();
			System.out.println("no of rec inserted:" + i);

			return true;

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return isReg;
	}

	public boolean login(String userName, String password) {

		boolean isLogin = false;
		Session session = HBUtil.getSessionFactory().openSession();

		try {
			Query query = session.createQuery("from User u where u.userName=? and u.password=?");
			query.setParameter(0, userName);
			query.setParameter(1, password);

			List<User> list = query.list();

			Iterator<User> itr = list.iterator();
			while (itr.hasNext()) {
				return true;
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return isLogin;
	}

	public boolean addExpense(Expense expense) {
		boolean addExpense = false;
		Session session = HBUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();

			int i = (Integer) session.save(expense);
			transaction.commit();
			System.out.println("inserted rec:" + i);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return addExpense;

	}

	public boolean editExpense(Expense expense) {
		boolean isEdit = false;
		Session session = HBUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.update(expense);
			transaction.commit();

			System.out.println(expense.getId() + " , " + expense.getExpensetype() + " , " + expense.getDate() + " , "
					+ expense.getNoofItems() + " , " + expense.getPrice() + expense.getBywhom() + " , "
					+ expense.getTotal());
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return isEdit;

	}

	public boolean deleteExpense(int expenseId) {
		boolean isDel = false;
		Session session = HBUtil.getSessionFactory().openSession();
		try {
			Query query = session.createQuery("delete from Expense e where e.id=?");
			query.setParameter(0, expenseId);
			query.executeUpdate();
			return true;

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return isDel;

	}

	public boolean resetPassword(int userId, String currentPassword, String newPassword) {
		Session session = HBUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			User user = (User) session.load(User.class, userId);

			if (currentPassword.equals(user.getPassword())) {
				user.setPassword(newPassword);
				transaction.commit();
				return true;
			}

		} catch (

		HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;

	}

	public Expense getExpense(int expenseid) {

		Session session = HBUtil.getSessionFactory().openSession();
		Expense expense = null;

		try {

			expense = (Expense) session.get(Expense.class, expenseid);

			System.out.println(expense.getId() + " , " + expense.getExpensetype() + " , " + expense.getDate() + " , "
					+ expense.getPrice() + " , " + expense.getTotal() + " , " + expense.getBywhom() + " , "
					+ expense.getUserid());

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return expense;
	}

	public List<Expense> getExpenses(int userId) {
		Session session = HBUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<Expense> expenses = new ArrayList<Expense>();

		try {

			transaction = session.beginTransaction();

			Query query = session.createQuery("from Expense where userId=?");
			query.setParameter(1,1);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return expenses;

	}

	public List<Expense> expenseReport(int userId, String expenseType, String fromDate, String toDate) {
		Session session = HBUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<Expense> expenses = new ArrayList<Expense>();
		try {
			transaction = session.beginTransaction();

			Query query = session.createQuery("from Expense where userId=? and expenseType=? between ? and ?");
			query.setParameter(0, userId);
			query.setParameter(1, expenseType);
			query.setParameter(2, fromDate);
			query.setParameter(3, toDate);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return expenses;
	}

	public PersonalInfo getPersonalInfo(int userId) {
		return null;
	}

	public boolean updatePersonalInfo(User user, Address address) {
		boolean recordCount = false;
		Session session = HBUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.update(user);
			session.saveOrUpdate(address);
			transaction.commit();

			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return recordCount;
	}

}
