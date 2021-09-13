package lab_1;

import java.util.Scanner;

public class MyTask {
	public static void DoTask() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите количество чисел > ");
		int N = sc.nextInt();
		
		double sum = 0;

		
		// Считывание и суммирование вводимых чисел
		for (int i = 0; i < N; i++) {
			System.out.print("Введите число " + String.valueOf(i+1) + " > ");
			sum += sc.nextDouble();
		}
		
		//Расчет и вывод среднего арифмитического
		System.out.println("Среднее арифметическое равно " + String.valueOf(sum/N));
		
		sc.close();
	}
}
