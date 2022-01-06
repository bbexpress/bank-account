package com.training.mars;

public class SavingsAccount extends Account{
	
	@Override
	public double showBalance() {
		return 1000;
	}

	@Override
	public void calculatePayment() {
		System.out.println("Logic for payment calculation");
		
	}
	
	//@Override
	public int showbal() {
		return 7000;
	}

}
