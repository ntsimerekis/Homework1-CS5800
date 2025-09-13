package com.tsimerekis.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private String courseName;
	private List<Instructor> instructors = new ArrayList<Instructor>();
	private List<Textbook> textbooks = new ArrayList<Textbook>();
	
	public Course(String courseName, Instructor instructor, Textbook textbook) {
		this.courseName = courseName;
		instructors.add(instructor);
		textbooks.add(textbook);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Instructor> getInstructors() {
		return new ArrayList<Instructor>(instructors);
	}

	public void addInstructor(Instructor instructor) {
		instructors.add(instructor);
	}
	
	public void removeInstructor(Instructor instructor) {
		instructors.remove(instructor);
	}

	public List<Textbook> getTextbooks() {
		return new ArrayList<Textbook>(textbooks);
	}

	public void addTextbook(Textbook textbook) {
		textbooks.add(textbook);
	}
	
	public void removeTextbook(Textbook textbook) {
		textbooks.remove(textbook);
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("----Course ")
		  .append(courseName)
		  .append(" ----")
		  .append(System.lineSeparator())
		  .append("Instructor(s):")
		  .append(System.lineSeparator());
		
		instructors.forEach((i) -> {sb.append(i).append(System.lineSeparator()); });
		
		sb.append("Textbooks:")
		  .append(System.lineSeparator());
		
		textbooks.forEach((t) -> {sb.append(t).append(System.lineSeparator());});
		
		sb.append("---------------------------------------------");
				  	
		return sb.toString();
	}
	
}
