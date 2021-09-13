package lab_1;

import java.util.Scanner;

public class MyTask2 {

	private int N;
	double sum;
	
	public void InputNumbers() {
		
		//Считывание и суммирование вводимых чисел
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите количество чисел > ");
		N = sc.nextInt();
		
		sum = 0;
		for(int i = 0; i < N; i++) {
			System.out.print("Введите число " + String.valueOf(i+1) + " > ");
			sum += sc.nextDouble();
		}
		sc.close();
	}
	
	public void PrintResult() {
		//Расчет и вывод среднего арифмитического
		System.out.println("Среднее арифметическое равно: " + String.valueOf(sum/N));
	}
}
