package com.day1;

import java.util.Scanner;

public class Program2 {
	public static void main(String[]args){
		Scanner s1=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s1.nextInt();
		s1.close();
		if(num%2==0) {
			System.out.println(num+"is even");
		}
		else {
			System.out.println(num+"is odd");
		}
	}

}
