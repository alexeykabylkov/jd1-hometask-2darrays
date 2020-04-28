package by.htp.jd1.hometask;

/*17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): */

public class Task17 {

	public static void main(String[] args) {
		
		int n = 6;
		int [][] mat = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if (i==n-1) {mat[i][j]=1;}
				else if (i==n-n) {mat[i][j]=1;}
				else if (j==n-1) {mat[i][j]=1;}
				else if (j==n-n) {mat[i][j]=1;}
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

}
