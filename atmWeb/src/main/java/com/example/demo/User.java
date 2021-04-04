package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@Column
	private String user_email;
	
	@Column
	private String user_pass;
	
	@Column
	private String user_first;
	
	@Column
	private String user_last;
	
	@Column
	private int cnn;
	
	@Column
	private double balance;

	public String getUser_email() {
		return user_email;
	}

	public void setUser_name(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	public String getUser_first() {
		return user_first;
	}

	public void setUser_first(String user_first) {
		this.user_first = user_first;
	}

	public String getUser_last() {
		return user_last;
	}

	public void setUser_last(String user_last) {
		this.user_last = user_last;
	}

	public int getCnn() {
		return cnn;
	}

	public void setCnn(int cnn) {
		this.cnn = cnn;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
