package com.hdfc1;

public class ChildClassForAbstractClass  extends Firstabstractclass{

	public static void main(String[] args) {
		ChildClassForAbstractClass c1= new ChildClassForAbstractClass();
		c1.m1();
		c1.m2();
		c1.m3();
	}

	@Override
	public void m2() {
System.out.println("m2 implementation");		
	}

	@Override
	public void m3() {
System.out.println("m3 implementation");		
	}

}
