package by.htp.jd1.hometask;

import java.util.Random;

/*8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива*/

public class Task08 {

	public static void main(String[] args) {
		
		int count = 0;
		
		int [][] mat = new int [5][5];
		Random rand = new Random();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = rand.nextInt(9);
				if (mat[i][j] == 7) {
					count+=1;
				}
			}
			
		}
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("/////////////////");
		System.out.println("count = " + count);

	}

}
