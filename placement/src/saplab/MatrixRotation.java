package saplab;

import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		int n = scanner.nextInt();
		int matrix[][] = new int[n][n];
		for(int i = 0 ; i < n ; i ++) {
			for(int j = 0 ; j < n ; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		int rotatedMatrix[][] = new int[n][n];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				rotatedMatrix[j][i] = matrix[i][j];
			}
		}
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j ++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j ++) {
				System.out.print(rotatedMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}
	
}
