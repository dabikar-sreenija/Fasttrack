package com.day2;

public class Program15 {
	public  void foo() {
		String A = "Sree";
		System.out.println("Test.foo() called "+A);
	}
	public  void foo(int a) {
		a=13;
		System.out.println("Test.foo(int) called "+a);
	}
	public static void main(String args[])
	{
		Program15 t1 = new Program15();
		t1.foo();
		t1.foo(10);
	}


}
