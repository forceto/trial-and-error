package crazyJava.chapter7;

public class User implements Cloneable{
	int age;
	Address address;
	public User(int age){
		this.age=age;
		address=new Address("earth");
	}
	public User clone() throws CloneNotSupportedException{
		return (User)super.clone();
	}

}
