
public class BiggestSubMatrixHavingValue1 {

	private static int[][]  aux;
	
	private void subMatrix(int[][] mat)
	{
		aux = new int[mat.length-1][mat[0].length-1];
		/** Add 0 in all row and columns **/
		aux[0] = mat[0];
		for(int j = 0 ; j < mat.length; j++)
		{
			aux[0][j] = mat[0][j];
		}
	}
	
	
	public static void main(String[] args) {
		int[][] arrA = { { 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 0 }, { 0, 0, 1, 1, 1, 0 },
				{ 1, 1, 1, 1, 1, 1 } };
		BiggestSubMatrixHavingValue1 i = new BiggestSubMatrixHavingValue1();
		i.subMatrix(arrA, 5, 6);
	}
}
