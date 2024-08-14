package com.day2;

public class Program13 {
	public static void main(String args[ ])  {
	       Program11 obj = new Program12();
	        
	       // As per overriding rules this should call to class program12 static
	       // overridden method. Since static method can not be overridden, it
	       // calls program 11 display()
	       obj.display(); 
	        
	       // Here overriding works and Derive's print() is called
	       obj.print();    
	    }

}


