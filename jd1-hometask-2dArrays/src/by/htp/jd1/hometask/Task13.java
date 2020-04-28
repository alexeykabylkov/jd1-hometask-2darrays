package by.htp.jd1.hometask;

/*13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): */

public class Task13 {

	public static void main(String[] args) {
		
		int [][] mat = new int[6][6];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = j+1;
				
				//System.out.print(mat[i][j] + " ");
			}
			//System.out.println();
		}
		
		System.out.println("/////////////////////////");
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if (i%2!=0) {
					System.out.print(mat[i][(mat[i].length-1)-j] + " ");
				}else {
					System.out.print(mat[i][j] + " ");
				}
				//System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		/*if (i%2!=0) {
			System.out.print(mat[i][(mat[i].length-1)-j] + " ");
		}else {
			System.out.print(mat[i][j] + " ");
		}*/
		

	}

}
