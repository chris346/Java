
public class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String speak(){
		return "I am an animal";
	}
	
	public String toString(){
		return "My name is " + name + " My age is " + age + " My type is Animal";
	}
}
