package lab_5;

public class Triangle extends Geometry implements IDrawable {
	protected double a;
	protected double b;
	protected double c;
	
	public Triangle() {
		super("Треугольник");
	}
	
	public Triangle(double pa, double pb, double pc) {
		super("Треугольник");
		a = pa;
		b = pb;
		c = pc;
	}
	
	public double getPerimeter() {
		return a + b + c;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\na=" + a + " b=" + b + " c=" + c;
	}
	
	public String Descript() {
		return "Фигура: треугольник, a = " + a + " b = " + b + " c = " + c;
	}

	public void Draw() {
		String str = 
				"    /\\    \n" +
				"   /  \\   \n" +
				"  /    \\  \n" +
				" /      \\ \n" +
				"/        \\\n" +
				"----------\n";

		System.out.println(str);
	}
}
