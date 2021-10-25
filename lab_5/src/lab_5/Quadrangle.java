package lab_5;

public class Quadrangle extends Geometry {
	protected double a;
	protected double b;
	protected double c;
	protected double d;
	
	public Quadrangle(String pName) {
		super(pName);
	}
	
	public Quadrangle(double pa, double pb, double pc, double pd, String pName) {
		super(pName);
		a = pa;
		b = pb;
		c = pc;
		d = pd;
	}
	
	public double getPerimeter() {
		return a + b + c +d;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\na=" + a + " b=" + b + " c=" + c + " d=" + d;
	}
}
