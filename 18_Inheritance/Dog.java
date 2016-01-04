
public class Dog extends Animal {
	public Dog (String name, int age){
		super(name,age);
	}	
	public String speak(){
		return "I am a Dog";
	}
	
	public String toString(){
		return "My name is " + getName() + " My age is " + getAge() + " My type is Dog";
	}
}
