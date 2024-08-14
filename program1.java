package com.day2;
import java.util.Scanner;
public class program1 {
public static void main(String args[]) {
	Scanner input=new Scanner(System.in);//created the object to scanner 
	System.out.println("enter a name:");//take input from user
	String name=input.nextLine();
	System.out.println("my name is:"+name);
	input.close();
}
}
