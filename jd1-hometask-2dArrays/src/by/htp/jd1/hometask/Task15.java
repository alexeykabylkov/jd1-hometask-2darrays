package by.htp.jd1.hometask;

/*15. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): */

public class Task15 {

	public static void main(String[] args) {
		
		int [][] mat = new int[6][6];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(i==j) {
					mat[i][j] = mat.length-j;
					
				}
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

}
