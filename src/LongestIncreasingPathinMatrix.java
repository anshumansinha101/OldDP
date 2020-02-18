
public class LongestIncreasingPathinMatrix {

	private static int paths(int[][] m, int r, int c)
	{
		int[][] m1 = new int[r][c];
		for(int i = 0 ; i < r ; i++)
		{
			for(int j = 0 ; j < c ; j++)
			{
				m1[i][j] = 0;
			}
		}
		
		for(int i = 0 ; i < r ; i++)
		{
			for(int j = 0 ; j < c ; j++)
			{
				System.out.println("i:" + i + ", j:"  + j + ",m[i][j]:" + m[i][j]);
				if(i==0 && j ==0)
				{
					System.out.println("Hum yaha hai");
					m1[i][j] = 0;
				}
				
				if(j >= 1 && m[i][j-1] < m[i][j])
				{
					System.out.println("1");
					m1[i][j] = Math.max(m1[i][j], m1[i][j-1] + 1);
				}
				if(i>= 1 && m[i-1][j] < m[i][j])
				{
					System.out.println("2");
					m1[i][j] = Math.max(m1[i][j], m1[i-1][j] + 1);
				}
			}
		}
		
		Utility.printM(m1);
		return m1[r-1][c-1]+1;
	}
	
	 /* Driver program to test above function */
    public static void main(String[] args) 
    { 
        
          int mat[][] = { 
         
            { 1, 2, 3, 4 }, 
            { 2, 2, 3, 4 }, 
            { 3, 2, 3, 4 }, 
            { 4, 5, 6, 7 }, 
        }; 
        int n = 4, m = 4; 
        
        /* Case 2 
         * 
         */
    	/**int n = 2, m = 2; 
    	int mat[][]  = { { 1, 2 },
                { 3, 4 } };
        **/
        System.out.println(paths(mat, n, m)); 
    } 
}
