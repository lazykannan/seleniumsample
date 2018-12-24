package com.hdfc1;

public class Hdfc implements Rbi {

	public static void main(String[] args) {
	
		
		Hdfc h = new Hdfc();
		h.deposit();
		h.withdrawal();
		
	}

	@Override
	public void withdrawal() {
		System.out.println("withdrawal implementation");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit implementation");
		
	}
}

	
	


