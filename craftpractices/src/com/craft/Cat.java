package com.craft;

public class Cat {
	static String family = "Abyssinian Cat";
	int age = 12; //static variable
	//all objects has a single copy

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		cat1.family = "Felidae";
		
		
		System.out.println(cat1.family);
		System.out.println(cat2.family);


	}

}
