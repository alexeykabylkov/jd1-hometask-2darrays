package by.htp.jd1.hometask;

public class Task18 {

	public static void main(String[] args) {
		
		int n = 6;
		int [][] mat = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = i+1;
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

}
