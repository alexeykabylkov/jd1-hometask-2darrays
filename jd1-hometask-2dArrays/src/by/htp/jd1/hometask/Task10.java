package by.htp.jd1.hometask;

import java.util.Random;

/*10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы. */

public class Task10 {

	public static void main(String[] args) {
		int p = 3;
		int k = 2;
		
		int [][] mat = new int [5][5];
		Random rand = new Random();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = rand.nextInt(9);
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
				if(i==k) {
					System.out.print(mat[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(j==p) {
					System.out.print(mat[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

}
