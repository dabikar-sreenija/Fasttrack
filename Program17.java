package com.day2;
public class Program17 {
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public Program17() {
		doors = "closed";
		engine = "on";
		driver= "seated";
		speed = 10;
	}
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") 
				&& speed >0) {
			return "car is running";
		}
		else{
			return "car is not running";
		}
	}
	public static void main(String[] args) {
		Program17 c1 = new Program17();
		System.out.println(c1.run());
	}



}
