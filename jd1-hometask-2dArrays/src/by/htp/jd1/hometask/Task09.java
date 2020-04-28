package by.htp.jd1.hometask;

import java.util.Random;

/*9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали*/

public class Task09 {

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
				if (i==j) {
					System.out.print(mat[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
