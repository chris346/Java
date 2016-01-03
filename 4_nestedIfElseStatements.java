
public class Main {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		if(x>y) {
			if(x%2 == 0){
				System.out.println("x is bigger than y");
				System.out.println("x is even");
			}
			else {
				System.out.println("x is bigger than y");
				System.out.println("x is odd");
			}
			
		}else {
			if(x%2 == 0){
				System.out.println("x is not bigger than y");
				System.out.println("x is even");
			}
			else {
				System.out.println("x is not bigger than y");
				System.out.println("x is odd");
			}
		}
	}

}
