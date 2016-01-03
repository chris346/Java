
public class Main {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int sum = add(x,y);
		System.out.println(sum);
		
		String firstName = "Chris";
		String lastName = "Igaya";
		String fullName = addStrings(firstName, lastName);
		System.out.println(fullName);
	}	
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static String addStrings(String a, String b){
		return a + " " + b;
	}
}


