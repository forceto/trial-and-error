package chapter10;

public class Person {
	private String name;
	private int age;
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		if (age > 0 && age < 150) {
			this.age = age;
		} else {
			throw new AgeOutOfBoundsException("年龄不正确...");
		}
	}
	
}

class AgeOutOfBoundsException extends RuntimeException {

	public AgeOutOfBoundsException() {
		super();
		
	}

	public AgeOutOfBoundsException(String message) {
		super(message);
		
	}
	
}