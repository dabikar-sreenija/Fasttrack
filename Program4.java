package com.day1;
import java.util.Scanner;
public class Program4 {
	public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s1.nextInt();
        boolean Prime = true;
        s1.close();

        if (num <= 1) {
            Prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    Prime = false;
                    break;
                }
            }
        }

        if (Prime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}




