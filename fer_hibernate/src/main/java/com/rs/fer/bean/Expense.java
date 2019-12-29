package com.rs.fer.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="expense")
public class Expense {

	@Id
	@Column(updatable = false, nullable = false)
	@GeneratedValue
	private int id;
	@Column
	private String Expensetype;
	@Column
	private String Date;
	@Column
	private float Price;
	@Column
	private int NoofItems;
	@Column
	private float total;
	@Column
	private String byWhom;
	@Column
	private int userId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getExpensetype() {
		return Expensetype;
	}
	public void setExpensetype(String Expensetype) {
		this.Expensetype = Expensetype;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		this.Date = date;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		this.Price = price;
	}
	public int getNoofItems() {
		return NoofItems;
	}
	public void setNoofItems(int NoofItems) {
		this.NoofItems = NoofItems;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getBywhom() {
		return byWhom;
	}
	public void setBywhom(String byWhom) {
		this.byWhom = byWhom;
	}
	public int getUserid() {
		return userId;
	}
	public void setUserid(int userid) {
		this.userId = userid;
	}
	
	
}
