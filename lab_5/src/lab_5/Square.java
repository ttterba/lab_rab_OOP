package lab_5;

public class Square extends Quadrangle implements IDrawable {
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
	
	public String Descript() {
		return "Фигура: квадрат, a = " + a;
	}

	public void Draw() {
		String str = 
				"-----------\n" +
				"|         |\n" +
				"|         |\n" +
				"|         |\n" +
				"|         |\n" +
				"-----------\n";
				
		System.out.println(str);
	}
}
