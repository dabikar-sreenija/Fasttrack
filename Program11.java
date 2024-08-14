package com.day2;

public class Program11 {
	// Static method in program11 class which will be hidden in subclass
    public static void display() {
        System.out.println("Static or class method from 11");
    }
     
     // Non-static method which will be overridden in program12 class
     public void print()  {
         System.out.println("Non-static or Instance method from 11");
    }
}
