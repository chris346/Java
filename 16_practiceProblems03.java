import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//Use a for loop to find all even even numbers from 1 to 100 and put out its average
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i<= 100; i = i+2) {
			sum = sum+i;
			count++;
		}
		double result = sum/count;
		
		System.out.println("The sum from the for loop is " + sum);
		System.out.println("The average from the for loop is " + result);
	
		//Use a while loop to find all even even numbers from 1 to 100 and put out its average
		int sum2 = 0;
		int count2 = 0;
		int j = 0;
		while( j<=100) {
			sum2 = sum2 +j;
			count2++;
			j = j + 2;
		}
		
		double result2 = sum2/count2;
		System.out.println("The sum from the while loop is " + sum2);
		System.out.println("The average from the while loop is " + result2);	
	}
}
