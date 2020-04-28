package by.htp.jd1.hometask;

import java.util.Random;

/*1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, 
 * чтобы в одной строке была ровно одна единица, и вывести на экран. */

public class Task01 {

	public static void main(String[] args) {
		int [][] mat = new int [3][4];
		Random rand = new Random();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = rand.nextInt(2);
				if (mat[i][j] == 1) {
					break;
				}
			}
			
		}
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
