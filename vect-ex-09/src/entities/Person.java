package entities;

public class Person {
	private String name;
	private int age;

	//Construtor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getters and setters
	
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
}




	