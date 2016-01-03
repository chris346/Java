
public class Main {

	public static void main(String[] args) {
	
	int row = 2;
	int col = 5;
	
	int[][] x = new int [row][col];
	
	x[0][1] = 1;
	System.out.println(x[0][1]);
	
	
	int[][] y = {{1,2,3}, {4,5,6}, {7,8,9}}; 
	System.out.println(y[0][1]);
	
	for(int i = 0; i<3; i++){
		for(int j = 0; j<3; j++){
		System.out.print(y[i][j] + " ");
		}
		System.out.println();
	}
	
	}
}


