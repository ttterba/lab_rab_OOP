package lab_6;

public class Manager extends Employee implements IPayable {

	public Manager() {
		HourlyPayment = 18.0;
		Position = "Менеджер";
	}
	
	
	@Override
	public Double getMonthSalary() {
		return 35 * 20 * HourlyPayment;
	}
	
}
