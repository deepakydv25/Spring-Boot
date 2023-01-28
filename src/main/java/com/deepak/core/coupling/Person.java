package com.deepak.core.coupling;

public class Person {

	Animal animal = new Animal();
	
	public void playWithAnimal() {
		animal.play();
	}
	
}
