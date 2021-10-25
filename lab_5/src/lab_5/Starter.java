package lab_5;

import java.util.Vector;

public class Starter {

	public static void main(String[] args) {
		

		Square s1 = new Square(4);
		Rhombus r1 = new Rhombus(5);
		Triangle t1 = new Triangle(3, 4, 5);
		
		Vector<IDrawable> allDrawables = new Vector<IDrawable>();
		
		allDrawables.add(r1);
		allDrawables.add(t1);
		allDrawables.add(s1);
		
		for (IDrawable s : allDrawables) {
			System.out.println(s.Descript());
			s.Draw();
		}

	}

}
