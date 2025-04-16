package com.tnsif.basic;

public class basicdemo {

public class Encapsulationdemo {
	
	int serialnumber;    // declaration
	String name;       // data members
	int age;
	
	public void show() {    // method (member function)
	System.out.println("serialnumber "+serialnumber +  " name "+ name +  " age "+age);	
	}
	
	public static void main(String[] args) {
		Encapsulationdemo e=new Encapsulationdemo();
		e.serialnumber=7;
		e.name="rashmi";
		e.age=25;
		
		e.show();
	}
	

}
