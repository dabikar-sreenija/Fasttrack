package com.day2;

public class Program8 {
	public static void main(String args[]) 
	{
	 
	Program7 id = new Program7();
	 //Instance method is being called using the object of the class
	id.callme();
	 //Static variable is accessed with the class name
	System.out.println("The value of a = " + Program7.a);
	System.out.println();

	}


}
