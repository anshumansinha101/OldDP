// A Dynamic Programming solution for subset 
// sum problem 

/**
 * THis is based on Bottom up approach. 
 * When ever there is no of combination. create another boolean 2 D array to track the status. 
 * 
 * @author asinha13
 *https://www.geeksforgeeks.org/subset-sum-problem-osum-space/
 */
class GFG { 
	
	// Returns true if there is a subset of 
	// set[] with sun equal to given sum 
	static boolean isSubsetSum(int set[], 
							int n, int sum) 
	{ 
		// The value of subset[i][j] will be 
		// true if there is a subset of 
		// set[0..j-1] with sum equal to i 
		
		/** this matrix has one more than sum as 
		 * row and one more than size of set as column. 
		 */
		boolean subset[][] = 
					new boolean[sum+1][n+1]; 
	
		// If sum is 0, then answer is true 
		/** Every row is for the sum if there exists a subset
		 * 
		 */
		for (int i = 0; i <= n; i++) 
			subset[0][i] = true; 
	
		// If sum is not 0 and set is empty, 
		// then answer is false 
		/** When column is 0 that means no more members in set are available. 
		 * 
		 */
		for (int i = 1; i <= sum; i++) 
			subset[i][0] = false; 
	
		System.out.println("subset");
		// Fill the subset table in botton 
		// up manner
		/** 
		 * starting from sum 1 to sum 
		 * starting from element 1 to no of elements.  
		 */
		for (int i = 1; i <= sum; i++) 
		{ 
			for (int j = 1; j <= n; j++) 
			{ 
				/** copy the last column value for the that ... if that is a subset or not
				 * copy the previous state to the current state
				 */
				System.out.println("Checking for sum=" + i + " and elements=" + j + " with value=" + set[j-1]) ;
				subset[i][j] = subset[i][j-1];
				System.out.println("subset[" + i +"][" + j + "]=" + subset[i][j] );
				
				// sum value is gt eq set value. Recursive call can be applied. 
				/**
				 * for this cell it is true if this cell is true OR the cell whi
				 */
				if (i >= set[j-1]) 
				{
					subset[i][j] = subset[i][j] || 
							subset[i - set[j-1]][j-1]; 
					/** 
					 * This check is there to see if the remaining value has a subset. 
					 */
					int temp = i - set[j-1];
					System.out.println("i - set[j-1]=" +  temp);
					System.out.println("Checking for sum i:" + i + " at number of elements j:" + j + " is " + subset[i][j]);
				}
				else
					System.out.println("Sum is less than element value");
			} 
		} 
	
		 // uncomment this code to print table 
		for (int i = 0; i <= sum; i++) 
		{ 
			System.out.print ("Sum=" + i + "  " );
		for (int j = 0; j <= n; j++) 
		{	System.out.print ( subset[i][j] + "  "); }
		System.out.println();
		} 
		
		return subset[sum][n]; 
	} 

	/* Driver program to test above function */
	public static void main (String args[]) 
	{ 
		int set[] = {3, 34, 4, 12, 5, 2}; 
		int sum = 9; 
		int n = set.length; 
		if (isSubsetSum(set, n, sum) == true) 
			System.out.println("Found a subset"
						+ " with given sum"); 
		else
			System.out.println("No subset with"
							+ " given sum"); 
	} 
} 

/* This code is contributed by Rajat Mishra */
