package lab_6;

public class Starter {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Director director = new Director();
		Cashier cashier = new Cashier();
		
		ControlPanel.WriteMonthlyPayment(manager);
		ControlPanel.WriteMonthlyPayment(director);
		ControlPanel.WriteMonthlyPayment(cashier);
		
		ControlPanel.WriteTotalInfo(manager);
		ControlPanel.WriteTotalInfo(director);
		ControlPanel.WriteTotalInfo(cashier);
	}

}
