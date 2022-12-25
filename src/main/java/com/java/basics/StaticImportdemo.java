package com.java.basics;

import static com.java.basics.Utilities.*;
import static java.lang.System.out;;

public class StaticImportdemo {

	public static void main(String[] args) {
//		When methods are not static we need to access it by class object reference 
//		Utilities uObj = new Utilities();
//		uObj.printMyMessage();
//		uObj.add(10, 20);
		
//		Static method can be access using class Name
//		Utilities.printMyMessage();
//		Utilities.add(10, 20);
		
//		Accessing method by using Static import
		printMyMessage();
		add(30, 40);
		
		System.out.println("Without Static import");
		out.println("With Static import");

	}
}
