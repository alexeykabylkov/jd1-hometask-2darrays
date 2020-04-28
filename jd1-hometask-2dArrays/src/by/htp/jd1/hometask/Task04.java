package by.htp.jd1.hometask;

import java.util.Random;

/*4. Дана матрица. Вывести на экран первую и последнюю строки. */

public class Task04 {

	public static void main(String[] args) {
		
		
		int [][] mat = new int [4][5];
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
				if (i==0) {
					System.out.print(mat[i][j] + " ");
				}
				if (i==mat.length-1) {
					System.out.print(mat[i][j] + " ");
				}
			}
			System.out.println();
		}


	}

}
