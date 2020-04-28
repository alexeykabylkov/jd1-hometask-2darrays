package by.htp.jd1.hometask;

import java.util.Random;

/*5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами. */

public class Task05 {

	public static void main(String[] args) {
		
		
		int [][] mat = new int [7][7];
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
				if (i%2==0) {
					System.out.print(mat[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

}
