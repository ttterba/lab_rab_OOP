package lab_4;

public class Rhombus extends Quadrangle {
	private double a;
	
	public Rhombus(double pa) {
		super("Ромб");
		a = pa;
	}
	
	@Override
	public String toString() {
		return name + "\na = " + a;
	}
	
	@Override
	public double getPerimeter() {
		return 4*a;
	}
}
