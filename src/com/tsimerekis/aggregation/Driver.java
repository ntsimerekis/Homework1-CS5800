package com.tsimerekis.aggregation;

public class Driver {

	public static void main(String[] args) {
		final Instructor instructor = new Instructor("Nima", "Davarpanah", "8-49");
		final Textbook textbook = new Textbook("Robert", "Marin", "Clean Code: A Handbook of Agile Software Craftsmanship","Appress");
		
		final Course course = new Course("Advanced Software Engineering", instructor, textbook);
		
		System.out.println(course);
		System.out.println("Now with a second textbook and instructor");
		
		course.addInstructor(new Instructor("Nicholas", "Tsimerekis", "8-50"));
		course.addTextbook(new Textbook("Brian", "Kerningham", "The C Programming Language", "Prentice Hall"));
		
		System.out.println(course);
	}

}
