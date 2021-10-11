package lab_4;

public class Square extends Quadrangle {
	private double a;
	
	public Square(double pa) {
		super("Квадрат");
		a = pa;
	}
	
	@Override
	public double getPerimeter() {
		return 4*a;
	}
	
	@Override
	public String toString() {
		return name + "\na = " + a;
	}
	
	public double getSquare() {
		return a*a;
	}
}
