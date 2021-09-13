package lab_1;

public class Starter {

	public static void main(String[] args) {
		//Вариант со статическим методом
		//MyTask.DoTask();
		
		//Вариант с применением методов уровня экземпляра
		MyTask2 ob = new MyTask2();
		ob.InputNumbers();
		ob.PrintResult();
	}

}
