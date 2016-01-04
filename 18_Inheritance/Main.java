


public class Main {
	public static void main(String[] args) {
		
		Dog dog = new Dog("Rover", 3);
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		
		Cat cat = new Cat("Kitty", 2);
		System.out.println(cat.getName());
		System.out.println(cat.getAge());
		
		Animal animal = new Animal ("Christina", 15);
		System.out.println(animal.getName());
		System.out.println(animal.getAge());
		//This prints out speak() from child class because of method overriding
		//If there is to overriding method in child class,
		//the method will default to parent class. this is polymorphism
		
		System.out.println(cat.speak());
		System.out.println(dog.speak());
		
		Animal [] animals = new Animal[3];
		animals[0] = dog;
		animals[1] = cat;
		animals[2] = animal;
		
		for(int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
	}
}
	
