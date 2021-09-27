package lab_3;

import matrix.Matrix;

public class Starter {

	public static void main(String[] args) {
		Matrix m1 = new Matrix();
		m1.InputMatrix();
		
		System.out.println("\nВывод исходной матрицы:");
		m1.PrintMatrix();
		
		System.out.println("\nВывод минимума:");
		m1.PrintMin();
		
		System.out.println("\nВывод максимума:");
		m1.PrintMax();
		
		System.out.println("\nВывод транспонированной матрицы:");
		m1.PrintTransparentMatrix();

	}

}
