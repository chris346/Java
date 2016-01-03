import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");
		String firstName = input.nextLine();
		System.out.println("Hello " + firstName);
		
		System.out.println("Please enter number 1");
		int number1 = input.nextInt();
		System.out.println("Please enter number 2");
		int number2 = input.nextInt();
		
		System.out.println("The sum of the two numbers is: " + (number1 + number2);
	}
}
