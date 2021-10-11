package lab_4;

public class Geometry {
	protected String name;
	
	public Geometry() {}
	
	public Geometry(String pName) {
		name = pName;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
