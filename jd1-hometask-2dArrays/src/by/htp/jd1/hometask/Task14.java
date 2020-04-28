package by.htp.jd1.hometask;

/*14. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): */

public class Task14 {

	public static void main(String[] args) {
		
		int [][] mat = new int[6][6];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(i==(mat.length-1)-j) {
					mat[i][j] = mat.length-j;
					
				}
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

}
