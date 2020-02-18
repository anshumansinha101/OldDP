// A Dynamic Programming solution for subset 
// sum problem 

/**
 * THis is based on Bottom up approach. 
 * When ever there is no of combination. create another boolean 2 D array to track the status. 
 * 
 * @author asinha13
 *
 */
class SubsetSumProblemWithLessMemory { 
	
	// Returns true if there is a subset of 
	// set[] with sun equal to given sum 
	static boolean isSubsetSum(int set[], 
							int n, int sum) 
	{ 
		
		// Need to store the index from where on the 
		// value is true.
		int[] indexflag = new int[sum+1];
		indexflag[0] = 0;
		boolean[] setFlag = new boolean[sum+1];
		setFlag[0] = true;
		
		for(int i = 1 ; i <= sum ; i++)
		{
			for (int j = 0; j < n; j++) {
				int t1 =  i - set[j] ;
				System.out.println("i:" + i + " j:" + j + ", i - set[j]: " + t1 + ", indexflag[" + i + "]" + indexflag[i]);
				
				if(((i - j > 0 && indexflag[i-j] > 0 && indexflag[i] < j) || i - set[j] == 0)
						||(i - set[j] > 0 && indexflag[i - set[j]] == 1))
				{
					System.out.println("Setting setFlag[" + i + "]=TRUE" );
					setFlag[i] = true;	
					indexflag[i] = j;
				}
			}
		}
		
		for (int i = 0; i < setFlag.length; i++) {
			System.out.print(" " +  setFlag[i]);
		}
		
		return false;
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
