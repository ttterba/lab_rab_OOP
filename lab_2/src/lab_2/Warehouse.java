package lab_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Warehouse {
	ArrayList<Stock> inventory = new ArrayList<Stock>();
	
	public static Warehouse Initialization() {
		Warehouse res = new Warehouse();
		res.inventory.add(new Stock(Supplies.Песок, 1000, 1500, 50));
		res.inventory.add(new Stock(Supplies.Цемент, 2800, 4000, 50));
		res.inventory.add(new Stock(Supplies.Керамогранит, 5200, 8700, 50));
		
		System.out.println("Склад готов к работе!");
		return res;
	}
	
	public void MakeSale(Company seller, int stock_id, int saleAmount) {
		if (stock_id >= 0 && stock_id <= inventory.size()) {
			
			if (saleAmount > 0 && saleAmount <= inventory.get(stock_id).amount) {
				inventory.get(stock_id).amount -= saleAmount;
				double sum = inventory.get(stock_id).sellingPrice * saleAmount;
				seller.balance += sum;
				System.out.println("Продажа материала " + inventory.get(stock_id).name.toString() + 
						" на сумму " + sum + " руб. прошла успешно!");
			}
			else {
				System.out.println("Продажа не удалась! Такое количество материала недоступно.");
			}
			
		}
		else {
			System.out.println("Некорректный id!");
		}
	}
	
	public void PrintInventory() {
		System.out.println("\n-------------------------------------------------------------------------");
		for (int i = 0; i < inventory.size(); i++) {	
			System.out.println(inventory.get(i).name.toString() + " | id: " 
		+ i + " | Количество: " + inventory.get(i).amount + " | Себестоимость: "
		+ inventory.get(i).costPrice + " | Цена продажи: " + inventory.get(i).sellingPrice);
		}
		System.out.println("-------------------------------------------------------------------------\n");
	}
	
	public boolean RestoreStocks(Company buyer, int number) {
		double price = 0;
		for (Stock stock : inventory) {
			if (number > stock.amount)
			price += (number - stock.amount) * stock.costPrice;
		}
		if (buyer.balance >= price) {
			for (Stock stock : inventory) {
				if (number > stock.amount)
				stock.amount = number;
			}
			buyer.balance -= price;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void StartSession() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Идентификация компании:");
		System.out.print("Название > ");
		String nameC = sc.nextLine();
		System.out.print("Баланс > ");
		double balanceC = sc.nextDouble();
		Company client = new Company(nameC, balanceC);
		int operation = 0;
		do {
			System.out.print("Уважаемый " + client.name +
					", Выберите действие: \n  1 - Вывод товарно-материальных запасов\n" +
					"  2 - Совершить продажу\n  3 - Пополнить товарно-материальные запасы\n" +
					"  4 - Показать баланс\n  0 - выход\nВаш выбор > ");
			operation = sc.nextInt();
			switch (operation) {
			case 1: PrintInventory(); break;
			case 2:
				//Какой товар продать?
				System.out.println("\n-----------------------------------------");
				System.out.print("Код товара? > ");
				int code = sc.nextInt();
				System.out.print("Количество? > ");
				int count = sc.nextInt();
				MakeSale(client, code, count);
				System.out.println("-----------------------------------------\n");
				break;
			case 3:
				System.out.println("\n-----------------------------------------");
				System.out.print("До какого количества восставновить запасы? > ");
				int num = sc.nextInt();
				boolean flag = RestoreStocks(client, num);
				if (flag)
					System.out.println("Товарно-материальные запасы усепшно восстановлены");
				else 
					System.out.println("Недостаточно средств");
				System.out.println("-----------------------------------------\n");
				break;
			case 4:
				System.out.println("\n-----------------------------------------");
				System.out.println("Баланс: " + client.balance);
				System.out.println("-----------------------------------------\n");
				break;
			default: break;
			}
		} while (operation != 0);
		
		sc.close();
		System.out.println("Склад. Работа завершена!");
	}
}
