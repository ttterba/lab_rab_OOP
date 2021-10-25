package lab_5;

public class Rhombus extends Quadrangle implements IDrawable {
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

	public String Descript() {
		return "Фигура: ромб, a = " + a;
	}

	public void Draw() {
		String str = 
				"    /\\    \n" +
				"   /  \\   \n" +
				"  /    \\  \n" +
				" /      \\ \n" +
				"/        \\\n" +
				"\\        /\n" +
				" \\      / \n" +
				"  \\    /  \n" +
				"   \\  /   \n" +
				"    \\/    \n";
		System.out.println(str);
	}
}
