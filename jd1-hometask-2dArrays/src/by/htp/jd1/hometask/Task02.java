package by.htp.jd1.hometask;

/*2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9]. */
import java.util.Random;


public class Task02 {

	public static void main(String[] args) {
		
		int [][] mat = new int [2][3];
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

	}

}
