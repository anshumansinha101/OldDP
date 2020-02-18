
public class Maximumsizesquaresubmatrix {

	private static void printMaxSubSquare(int[][] m) {
		int n1 = m.length;
		int n2 = m[0].length;
		System.out.println("n1: " + n1 + " n2:" + n2);
		printM(m);
		for (int i = 1; i <n1; i++) {
			for (int j = 1; j < n2; j++) 
			{
				System.out.println("i:" + i + ", j:" + j);
				System.out.println("m[i][j]" + m[i][j]);
				System.out.println("m[i-1][j]" + m[i-1][j]);
				System.out.println("m[i][j-1]" + m[i][j-1]);
				System.out.println("m[i-1][j-1]" + m[i-1][j-1]);
				
				if (m[i][j] >= 1 && m[i - 1][j] >= 1 && m[i][j - 1] >= 1 && m[i - 1][j - 1] >= 1) {
					
					m[i][j] = m[i - 1][j - 1] + 1;
					System.out.println("Setting m[" + i + "][" + j + "]=" + m[i][j] + " incremented value");
				} 
				else 
				{
					m[i][j] = m[i - 1][j - 1];
					System.out.println("Setting m[" + i + "][" + j + "]=" + m[i][j] + " previous value");
				}
				System.out.println("1");
			}
			System.out.println("Reached here ");
			printM(m);
		}
		printM(m);
	}

	private static void printM(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();
		}
	}

	// Driver program
	public static void main(String[] args) {
		int M[][] = { { 0, 1, 1, 0, 1 },
						{ 1, 1, 0, 1, 0 }, 
						{ 0, 1, 1, 1, 0 },
						{ 1, 1, 1, 1, 0 }, 
						{ 1, 1, 1, 1, 1 },
						{ 0, 0, 0, 0, 0 } };

		printMaxSubSquare(M);
	}
}
