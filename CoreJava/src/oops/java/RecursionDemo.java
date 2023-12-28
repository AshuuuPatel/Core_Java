package oops.java;

class RecursionDemo {
	
	int calculateFactorial(int n) {
		if (n == 1) {
			return 1;
		} 
		else {
			return (n * calculateFactorial(n-1));
		}
	}
	
	public static void main(String[] args) {
	
	}
}
