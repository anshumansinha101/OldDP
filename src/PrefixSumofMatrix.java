
public class PrefixSumofMatrix {

	
	private static void prefixSum2D(int[][] m)
	{
		int r = m.length;
		int c = m[0].length;
		int m1[][] = new int[r][c]; 
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if(i == 0 && j == 0)
					m1[i][j] = m[i][j] ;
				
				if(i == 0 && j > 0)
					m1[i][j] = m[i][j-1]  ;
				if(i > 0 && j == 0)
					m1[i][j] = m[i-1][j]  ;
				
			}
		}
		
		
	}
	
	  // driver code 
    public static void main(String[] args) 
    { 
        int a[][] = { { 1, 1, 1, 1, 1 }, 
                      { 1, 1, 1, 1, 1 }, 
                      { 1, 1, 1, 1, 1 }, 
                      { 1, 1, 1, 1, 1 } }; 
        prefixSum2D(a); 
    } 
}
