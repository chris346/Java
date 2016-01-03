import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 1; i > 0; i++){
			System.out.println("Please enter your score >");
			
			int score = scan.nextInt();
			String grade;
			
			if(score >= 90){
				grade = "A";
			} else if(score>=80) {
				grade = "B";
			} else if(score>=70) {
				grade = "C";
			} else if(score>=60) {
				grade = "D";
			} else{
				grade = "F";
			} 
			
			switch(grade){
			case "A":
				System.out.println("Excellent. You got a A");
				break;
			case "B":
				System.out.println("Good. You got a B");
				break;
			case "C":
				System.out.println("Okay. You got a C");
				break;
			case "D":
				System.out.println("Poor. You got a D");
				break;
			case "F":
				System.out.println("Fail. You got a F");
				break;
			}
			System.out.println();
			
		}	
	}
	
	
}
