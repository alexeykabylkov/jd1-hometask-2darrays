package by.htp.jd1.hometask;

/*12. Получить квадратную матрицу порядка n: */

public class Task12 {

	public static void main(String[] args) {
		
		int [][] mat = new int[9][9];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if (i==j) {
					mat[i][j] = i;
				}
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
