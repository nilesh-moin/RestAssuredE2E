package com.java.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodChainingDemo {
	public static void main(String[] args) {
//		Receive List of Fruits names & add a custom message to each fruit
		List<String> fruitNames = Arrays.asList("Apple", "Orange", "Bananas", "Grapes", "WaterMelon");
//		expected output: 
//		Apple Fruit,  Orange Fruit, Bananas Fruit, Grapes Fruit, WaterMelon Fruit
		
//		Normal way
		List<String> customName = new ArrayList<>();		
		for(String s: fruitNames) {
			String newName =  s + " Fruit";
			customName.add(newName);
		}
		
		System.out.println("Before ----> "+ fruitNames);
		System.out.println("After ----> "+ customName);
		
		System.out.println("**** Using String API ************");
		Stream<String> fruitNamesStream = fruitNames.stream();
		Stream<String> fruitNamesStreamMap = fruitNamesStream.map(e -> e + " Fruit");
		List<String> custNames = fruitNamesStreamMap.collect(Collectors.toList());
		System.out.println(custNames);
		
		System.out.println("**** Using String API & method chaining ************");
		List<String> custNames1 = fruitNames.stream().map(e -> e + " Fruit").collect(Collectors.toList());
		System.out.println(custNames1);
		
	}

}
