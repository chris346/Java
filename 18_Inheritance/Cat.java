
public class Cat extends Animal{
	public Cat(String name, int age ){
		super(name, age);
	}
	
	public String speak(){
		return "I am an cat";
	}
	
	public String toString(){
		return "My name is " + getName() + " My age is " + getAge() + " My type is Cat";
	}
}
