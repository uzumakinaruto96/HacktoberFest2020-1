// Java Program to compute GST 
// from original and net prices. 
import java.io.*; 

class GFG 
{ 
	static float Calculate_GST(float org_cost, 
								float N_price) 
	{ 
		// return value after calculate GST% 
		return (((N_price - org_cost) * 100) 
				/ org_cost); 
	} 
	
	// Driver code 
	public static void main (String[] args) 
	{ 
		float org_cost = 100; 
		float N_price = 120; 
		System.out.print(" GST = " + Calculate_GST 
						(org_cost, N_price) + "%"); 
	} 
} 

// This code is contributed 
// by asr
