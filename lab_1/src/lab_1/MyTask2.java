package lab_1;

import java.util.Scanner;

public class MyTask2 {

	private int N;
	double sum;
	
	public void InputNumbers() {
		
		//������������ ��������� �����
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ���������� ����� > ");
		N = sc.nextInt();
		
		sum = 0;
		for(int i = 0; i < N; i++) {
			System.out.print("������� ����� " + String.valueOf(i+1) + " > ");
			sum += sc.nextDouble();
		}
		sc.close();
	}
	
	public void PrintResult() {
		//������ � ����� �������� ���������������
		System.out.println("������� �������������� �����: " + String.valueOf(sum/N));
	}
}
