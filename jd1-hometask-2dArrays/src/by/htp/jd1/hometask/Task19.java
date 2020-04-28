package by.htp.jd1.hometask;

/*19. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): */

public class Task19 {

	public static void main(String[] args) {
		
		int n = 6;
		int [][] mat = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j==n-1-i || j==i) {
					mat[i][j] = 1;
				} else if (i==n-n || i==n-1) {
					mat[i][j] = 1;
				} 
				

				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

}
