package by.htp.jd1.hometask;

import java.util.Random;

/*6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего. */

public class Task06 {

	public static void main(String[] args) {
		
		int [][] mat = new int [5][5];
		Random rand = new Random();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = rand.nextInt(10);
			}
			
		}
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("/////////////////");
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if (j%2!=0 && mat[0][j]>mat[mat.length-1][j]) {
					System.out.print(mat[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

}
