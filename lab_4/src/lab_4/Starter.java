package lab_4;

public class Starter {

	public static void main(String[] args) {
		
		Geometry g1 = new Geometry("фигура1");
		Quadrangle q1 = new Quadrangle("четырехугольник1");
		Quadrangle q2 = new Quadrangle(3, 4, 5, 6, "четырехугольник2");
		Square s1 = new Square(4);
		Rhombus r1 = new Rhombus(5);
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle(3, 4, 5);
		
		System.out.println(g1.toString());
		
		System.out.println(q1.toString());
		System.out.println(q1.getPerimeter());
		
		System.out.println(q2.toString());
		System.out.println(q2.getPerimeter());
		
		System.out.println(s1.toString());
		System.out.println(s1.getPerimeter());
		System.out.println(s1.getSquare());
		
		System.out.println(r1.toString());
		System.out.println(r1.getPerimeter());
		
		System.out.println(t1.toString());
		System.out.println(t1.getPerimeter());
		
		System.out.println(t2.toString());
		System.out.println(t2.getPerimeter());

	}

}
