package by.htp.jd1.hometask;

import java.util.Random;

/*11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, 
 * вторая строка слева направо, третья строка справа налево и так далее. */

public class Task11 {

	public static void main(String[] args) {
		
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
				if (i%2==0) {
					System.out.print(mat[i][(mat[i].length-1)-j] + " ");
				}else {
					System.out.print(mat[i][j] + " ");
				}
			}
			System.out.println();
		}
		

	}

}
