package com.training.mars;

public abstract class Account implements Payment{
	
	String name;
	long acctNo;
	double balance;
	
	public String getName() {
		return name;
	}
	
	public abstract double showBalance();


}
