package lab_1;

import java.util.Scanner;

public class MyTask {
	public static void DoTask() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ���������� ����� > ");
		int N = sc.nextInt();
		
		double sum = 0;
		
		// ������������ ��������� �����
		for (int i = 0; i < N; i++) {
			System.out.print("������� ����� " + String.valueOf(i+1) + " > ");
			sum += sc.nextDouble();
		}
		
		//������ � ����� �������� ��������������
		System.out.println("������� �������������� �����: " + String.valueOf(sum/N));
		
		sc.close();
	}
}
