package com.day2;

public class Program12 extends Program11{
	// This method is hidden by display() in program11
    public static void display() {
         System.out.println("Static or class method from 12");
    }
     
    // This method overrides print() in program11
    public void print() {
         System.out.println("Non-static or Instance method from 12");
   }

}
