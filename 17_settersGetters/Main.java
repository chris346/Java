


public class Main {
	public static void main(String[] args) {
		
		Animal animal = new Animal("Pedro", 5);
		System.out.println(animal.getName());
		System.out.println(animal.getAge());
	
		animal.setName("Kevin");
		System.out.println(animal.getName());
		animal.setAge(7);
		System.out.println(animal.getAge());
	}
}
	
