package com.day2;

public class Program14 {
	public static void foo() {
		System.out.println("Test.foo() called ");
	}
	public static void foo(int a) {
		a=10;
		System.out.println("Test.foo(int) called "+a);
	}
	
	public static void foo(float b) {
		b=3.14f;
		System.out.println("float value is displayed"+b);
	}
	public static void main(String args[])
	{
		Program14.foo();
		Program14.foo(10);
	    Program14.foo(3.14f);
	}
}
	
