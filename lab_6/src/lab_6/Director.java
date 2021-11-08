package lab_6;

public class Director extends Employee implements IPayable {

	public Director() {
		HourlyPayment = 24.0;
		Position = "Директор";
	}
	
	
	@Override
	public Double getMonthSalary() {
		return 32 * 24 * HourlyPayment;
	}
	
}
