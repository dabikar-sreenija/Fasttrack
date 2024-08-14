package com.day2;
public class Program18 {
	private String doors;
	private String engine;
	private String driver;
	private int speed;
 
	//Parameterized constructor
	public Program18(String doors, String engine, String driver, int speed) {
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
 
	public String run() {
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") 
				&& speed >0) {
			return "car is running";
		}else {
			return "car is not running";
		}
	}
	public static void main(String[] args) {
		Program18 c2 = new Program18("closed"	, "on", "seated", 10);
		
		System.out.println(c2.run());
	}




}
