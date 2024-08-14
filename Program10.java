package com.day2;

public class Program10 {
	public static void main(String args[]) 
	{
	 //Static method is being called using the name of the class
	Program9.callme();
	 //Static variable is accessed with the class name
	System.out.println("The value of b = " + Program9.a);
	}

}
