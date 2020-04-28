package by.htp.jd1.hometask;

import java.util.Random;

/*7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов. */

public class Task07 {

	public static void main(String[] args) {
		
		int sum = 0;
		int temp = 0;
		
		int [][] mat = new int [5][5];
		Random rand = new Random();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = rand.nextInt(9) * -1;
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
				if (mat[i][j]%2!=0 && mat[i][j]<0) {
					temp = Math.abs(mat[i][j]);
					sum = sum+temp;
				}
			}
		}
		
		System.out.println("sum = " + sum);

	}

}
