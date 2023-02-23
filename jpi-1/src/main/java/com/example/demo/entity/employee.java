package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="order2")
public class employee
{
	@Id
	@GeneratedValue
	@Column(name="order_id")
	private int order_id;
	@Column(name="amount")
	private int amount;
	@Column(name="customer_id")
	private int customer_id;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public employee(int order_id, int amount, int customer_id) {
		super();
		this.order_id = order_id;
		this.amount = amount;
		this.customer_id = customer_id;
	}
}
	
	