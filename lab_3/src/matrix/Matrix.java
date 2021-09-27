package matrix;

import java.util.Scanner;

public class Matrix {
	private double[][] matrix;
	int M;
	int N;
	public void InputMatrix() {
		Scanner s = new Scanner(System.in);
		System.out.print("Введите количество строк M > ");
		M = s.nextInt();
		System.out.print("Введите количество столбцов N > ");
		N = s.nextInt();
		matrix = new double[M][N];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("Введите a" + (i+1) + (j+1) + " > ");
				matrix[i][j] = s.nextDouble();
			}
		}
		s.close();
	}
	
	public void PrintMatrix() {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void PrintMin() {
		double result = Double.MAX_VALUE;
		int row = -1;
		int col = -1;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (matrix[i][j] <= result) {
					result = matrix[i][j];
					row = i;
					col = j;
				}
			}
		}
		System.out.println("Минимальный элемент: a" + (row+1) + (col+1) + " = " + result);
	}
	
	public void PrintMax() {
		double result = Double.MIN_VALUE;
		int row = -1;
		int col = -1;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (matrix[i][j] >= result) {
					result = matrix[i][j];
					row = i;
					col = j;
				}
			}
		}
		System.out.println("Максимальный элемент: a" + (row+1) + (col+1) + " = " + result);
	}
	
	public void PrintTransparentMatrix() {
		for (int j = 0; j < N; j++) {
			for (int i = 0; i < M; i++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
