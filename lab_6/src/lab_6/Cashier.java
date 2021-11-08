package lab_6;

public class Cashier extends Employee implements IPayable {

	public Cashier() {
		HourlyPayment = 10.0;
		Position = "Кассир";
	}
	
	
	@Override
	public Double getMonthSalary() {
		return 42 * 15 * HourlyPayment;
	}
	
}
