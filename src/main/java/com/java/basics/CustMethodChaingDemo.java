package com.java.basics;

class MethodRepo {
//	Normal Step 1 
	public void printName(String name) {
		System.out.println("Name is: " + name);
	}

	public void printAge(int age) {
		System.out.println("Age is: " + age);
	}
	
//	Method chaining Step 2 by returning class object
	public MethodRepo printName1(String name) {
		System.out.println("Name is: " + name);
		return new MethodRepo();
	}

	public MethodRepo printAge1(int age) {
		System.out.println("Age is: " + age);
		return new MethodRepo();
	}
	
//	Method chaining Step 3 by returning same class object
//	In above code we are creating new object & returning but there is no use of new object every time
	public MethodRepo printName2(String name) {
		System.out.println("Name is: " + name);
		return this;
	}

	public MethodRepo printAge2(int age) {
		System.out.println("Age is: " + age);
		return this;
	}

}

public class CustMethodChaingDemo {
	public static void main(String[] args) {
//		Normal Step 1
		MethodRepo methodRepo = new MethodRepo();
		methodRepo.printName("Nilesh");
		methodRepo.printAge(32);
		
//		Method chaining Step 2
		MethodRepo methodRepo1 = new MethodRepo();
		methodRepo1.printName1("Nilesh Moin").printAge1(32);
		
//		Method chaining Step 3
		MethodRepo methodRepo2 = new MethodRepo();
		methodRepo2.printName2("Nilesh Moin Patil").printAge2(32);
		
	}

}
