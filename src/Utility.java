
public class Utility {

	public static void printM(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
