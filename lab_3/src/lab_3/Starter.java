package lab_3;

import matrix.Matrix;

public class Starter {

	public static void main(String[] args) {
		Matrix m1 = new Matrix();
		m1.InputMatrix();
		
		System.out.println("\n����� �������� �������:");
		m1.PrintMatrix();
		
		System.out.println("\n����� ��������:");
		m1.PrintMin();
		
		System.out.println("\n����� ���������:");
		m1.PrintMax();
		
		System.out.println("\n����� ����������������� �������:");
		m1.PrintTransparentMatrix();

	}

}
