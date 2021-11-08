package lab_6;

public class ControlPanel {
	
	public static <T extends IPayable> void WriteMonthlyPayment(T p) {
		
		System.out.println(p.getMonthSalary() + " USD");
		
	}
	
	public static <T extends Employee & IPayable> void WriteTotalInfo(T emp) {
		System.out.println("\n\nДолжность: " + emp.Position + 
				"\nСтавка в час: " + emp.HourlyPayment +
				" USD\nМесячная зарплата: " + emp.getMonthSalary() + " USD");
	}
	
}
