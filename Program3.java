package com.day1;

import java.util.Scanner;

public class Program3 {
	public static void main(String[]args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s1.nextInt();
		s1.close();
		int factorial=1;
		for(int i=1;i<=num;i++) {
			factorial*=i;
		}
		System.out.println("factorial of" +num+ "is factorial");
	}

}
