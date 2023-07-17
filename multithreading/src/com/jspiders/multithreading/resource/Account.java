package com.jspiders.multithreading.resource;

public class Account {
	private int balance;

	public Account(int balance) {
		this.balance = balance;
	}
	public int cheakBalance() {
		return balance;
	}
	public void deposit(int amount) {
		System.out.println("trying to deposit "+amount+" rs.");
		balance+=amount;
		System.out.println("deposite successful");
		System.out.println("total balance : "+cheakBalance());
	}
	public void withdraw(int amount) {
		System.out.println("trying to withdraw "+amount+" rs.");
		if(amount<=balance) {
			balance -= amount;
			System.out.println("withdraw successful");
			System.out.println("total balance : "+cheakBalance());
		}
		else {
			System.out.println("insufficient balance");
		}
	}
	

}
