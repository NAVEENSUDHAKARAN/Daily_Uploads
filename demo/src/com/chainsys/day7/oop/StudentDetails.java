package com.chainsys.day7.oop;

public class StudentDetails {

	int id;
	String name;
	int age;
	boolean isPresent;
	
	public StudentDetails() {
		
	}
	
	public StudentDetails(int id, String name, int age, boolean isPresent) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.isPresent = isPresent;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isPresent() {
		return isPresent;
	}
	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}
	
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", age=" + age + ", isPresent=" + isPresent + "]";
	}
	
	
	
}
