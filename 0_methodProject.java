


public class Main {

	public static void main(String[] args) {
		int [] x = {1,5,7,15,24,12,14,13,4,2,23};
		int [] y = {3,5,7,9};
		System.out.println("The sum of even numbers is " + evenSum(x));
		System.out.println("The sum of odd numbers is " + oddSum(x));
		System.out.println("The min numbers is " + findMin(x));
		System.out.println("The max numbers is " + findMax(x));
		
		if(hasEven(x))
			System.out.println("The min even number is " + findMinEven(x));
		else 
			System.out.println("There are no even numbers");
		
		if(hasEven(x))
			System.out.println("The max even number is " + findMaxEven(x));
		else 
			System.out.println("There are no even numbers");
		
		if(hasOdd(x))
			System.out.println("The min odd number is " + findMinOdd(x));
		else 
			System.out.println("There are no odd numbers");
		
		if(hasOdd(x))
			System.out.println("The max odd number is " + findMaxOdd(x));
		else 
			System.out.println("There are no odd numbers");

		System.out.println("The average of even numbers is " + averageEven(x));
		System.out.println("The average of odd numbers is " + averageOdd(x));
		
	}
		public static int evenSum(int [] x){
			int sum = 0;
			for(int i = 0; i < x.length; i++){
				if(x[i] % 2 ==0) {
					sum = sum + x[i];
				}
			}
			return sum;
		}
	
		public static int oddSum(int [] x){
			int sum = 0;
			for(int i = 0; i < x.length; i++){
				if(x[i] % 2 ==1) {
					sum = sum + x[i];
				}
			}
			return sum;
		}
		//did myself
		public static int findMin(int [] x) {
			int minNum = x[0];
				for(int i = 0; i < x.length; i++){
					if(x[i]<minNum){
						minNum = x[i];
					}
				}
				return minNum;
		}
		//did myself
		public static int findMax(int [] x) {
			int maxNum = x[0];
				for(int i = 0; i < x.length; i++){
					if(x[i]>maxNum){
						maxNum = x[i];
					}
				}
				return maxNum;
		}
		
		public static boolean hasEven(int [] x) {
			for(int i = 0; i < x.length; i++) {
				if(x[i]%2 == 0)
					return true;
			}
			return false;
		}
	
		public static boolean hasOdd(int [] x) {
			for(int i = 0; i < x.length; i++) {
				if(x[i]%2 == 1)
					return true;
			}
			return false;
		}
		
		public static int findMinEven(int [] x){
			boolean flag = false;
			int min = 0;
			
			for( int i = 0; i < x.length; i++){
				if(flag == false){
					if(x[i]%2 == 0){
						min = x[i];
						flag = true;
					}
				}else if(x[i]%2 == 0 && x[i] < min){
					min = x[i];
				}
			}
			return min;
		}
	
		public static int findMaxEven(int [] x){
			boolean flag = false;
			int max = 0;
			
			for( int i = 0; i < x.length; i++){
				if(flag == false){
					if(x[i]%2 == 0){
						max = x[i];
						flag = true;
					}
				}
				else if(x[i]%2 == 0 && x[i] > max){
					max = x[i];
				}
			}
			return max;
		}
	
		public static int findMinOdd(int [] x){
			boolean flag = false;
			int min = 0;
			
			for( int i = 0; i < x.length; i++){
				if(flag == false){
					if(x[i]%2 == 1){
						min = x[i];
						flag = true;
					}
				}else if(x[i]%2 == 1 && x[i] < min){
					min = x[i];
				}
			}
			return min;
		}
		
		public static int findMaxOdd(int [] x){
			boolean flag = false;
			int max = 0;
			
			for( int i = 0; i < x.length; i++){
				if(flag == false){
					if(x[i]%2 == 1){
						max = x[i];
						flag = true;
					}
				}
				else if(x[i]%2 == 1 && x[i] > max){
					max = x[i];
				}
			}
			return max;
		}
		
		public static double averageEven(int [] x){
			int count = 0;
			for(int i=0; i<x.length; i++){
				if(x[i]%2 == 0){
					count++;
				}
			}
			//evenSum is initially an int. Must be casted as a double because return value of the method is a double
			return (double)evenSum(x)/count;
			
		}
		
		public static double averageOdd(int [] x){
			int count = 0;
			for(int i=0; i<x.length; i++){
				if(x[i]%2 == 1){
					count++;
				}
			}
			//oddSum is casted as double
			return (double)oddSum(x)/count;
			
		}
}
	
