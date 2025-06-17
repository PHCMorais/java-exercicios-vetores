package entities;

public class Person {
	private String name;
	private int age;
	private double height;
	
	//construtores
	
	public Person (String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	//getters and setters	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
}




