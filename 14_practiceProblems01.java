

public class Main {

	public static void main(String[] args) {
		
		//output the area of a square when a side is 3
		int squareSide = 3;
		System.out.println("the area of the square " + squareSide*2);
		
		//Output the area of a rectangle, width = 4 and height = 3
		int recWidth = 4;
		int recHeight = 3;
		System.out.println("the area of the rectangle is " + (recWidth*recHeight));
		
		//output the area of a triangle with height = 8, base = 2
		int triHeight = 8;
		int triBase = 2;
		System.out.println("The area of the triangle is " + (triHeight*triBase)/2);
		
		//Convert Fahrenheit to Celsius
		int f = 60;
		System.out.println("The temperature in Celsius is " + ((f-32)*5/9));
		
		//Convert Celsius to Fahrenheit
		int c = 20;
		System.out.println("The temperature in Fahrenheit is " + ((c*9)/5 + 32));
		
		//Convert inches to centimeters
		double inches = 20;
		System.out.println(inches + " inches in centimeters is " + (inches*2.54) + "cm");
		
		//Convert centimeters to inches
		double cm = inches*2.54;
		System.out.println(cm + "cm in inches is " + (cm*0.39) + " inches");
		
	}
}
