package com.day2;

public class Program16 {

	public static void foo() {
		String A="dummpy";
		System.out.println("Test.foo() called "+A);
	}

	
	  public void foo(int a) { 
		  a=6;
	  System.out.println("Test.foo(int) called "+a);
	  }
	 
	
	public static void main(String args[]) {
		Program16.foo();
		
		Program16 t1 = new Program16();
		t1.foo(1);
	}
}
