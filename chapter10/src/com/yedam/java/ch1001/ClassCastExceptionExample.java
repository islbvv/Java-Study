package com.yedam.java.ch1001;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat);
	} // main

	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}

} // class

class Animal {

} // Animal

class Dog extends Animal {

} // Dog

class Cat extends Animal {

} // Cat
