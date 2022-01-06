package com.training.mars;

import java.util.Scanner;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Account sa = new SavingsAccount();
//		System.out.println(sa.showBalance());
//		Account ca = new CheckingAccount();
//		System.out.println(ca.showBalance());
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("What type of account would you like to open?");

	    String accountType = myObj.nextLine();  // Read user input
	    System.out.println("You are opening a " + accountType + " account.");  // Output user input
	}

}
