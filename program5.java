package com.day2;
import java.util.Scanner;
public class program5 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=input.next();
		System.out.println("name:"+name);
		System.out.println("enter your age");
		int A=input.nextInt();
		System.out.println("Age:"+A);
		System.out.println("enter your salary");
		double B=input.nextDouble();
		System.out.println("salary:"+B);
		input.close();
	}

}
