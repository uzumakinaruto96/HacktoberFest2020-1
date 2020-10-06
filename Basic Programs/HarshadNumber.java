// Java program to check if a number is Harshad 
// Number or not 

public class GFG { 
	// method to check Harshad Number 
	static boolean checkHarshad(int n) 
	{ 
		// calculate sum of digits 
		int sum = 0; 
		for (int temp = n; temp > 0; temp /= 10) 
			sum += temp % 10; 

		// Return true if sum of digits is multiple 
		// of n 
		return (n % sum == 0); 
	} 

	// Driver program to test above functions 
	public static void main(String[] args) 
	{ 
		System.out.println(checkHarshad(12) ? "Yes" : "No"); 
		System.out.println(checkHarshad(15) ? "Yes" : "No"); 
	} 
} 
