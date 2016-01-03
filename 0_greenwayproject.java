//Christopher Igaya
//CS200 Programming in Java
//Jan 1, 2016

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//a two dimensional array is declared and instantiated
		int [ ] [ ] salary = {{49920, 45519, 54619},
				{50831, 47373, 48339},
				{39430,	36824, 44260},
				{54697,	51229, 44390},
				{41751,	36966, 39732},
				{36110,	40332, 44073},
				{41928,	53294, 53308},
				{48460,	44907, 35459},
				{39714,	36050, 52448},
				{49271,	51574, 38364},
				{51713,	39758, 39990},
				{38903,	53847, 47373}};
		
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a company:\n 1 for Alhermit \n 2 for Logway\n 3 for Felter");
		int company = scan.nextInt() - 1;
		
		//prints out the average wage
		double averageWage = average(company, salary);
		System.out.println("The average wage for company number " + (company + 1) + " is " + averageWage);
		
		//Prints out the total of all salaries
		double totalWage = total(company, salary);
		System.out.println("The total wages for company number " + (company + 1) + " is " + totalWage);
		
		//Prints out the total of all employees
		double totalEmployed = employees(company, salary);
		System.out.println("The total number of employees for company number " + (company + 1) + " is " + totalEmployed);
	}
	
	//This method finds the average wages of the chosen company
	public static double average(int x, int [][]wages) {
		double avg = 0;
		int sum = 0;
		
		for(int i = 0; i<wages[x].length; i++){
				sum = sum+wages[x][i];
				avg = sum/wages[x].length;
		}
		
		return avg;
	}
	
	//This method finds the total of all the wages in the chosen company
	public static int total(int x, int [][]wages) {
		int sum = 0;
		
		for(int i = 0; i<wages[x].length; i++){
				sum = sum+wages[x][i];
		}
		return sum;
	}
	
	//This method finds the total number of employees of the chosen company
	public static int employees(int x, int [][]wages){
		int totalEmployees = wages.length;
		return totalEmployees;
	}
	
	
}
