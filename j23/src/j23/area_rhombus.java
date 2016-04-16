package j23;

public class area_rhombus extends area_shapes{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is rhombus");
	}

	@Override
	void getarea() {
		// TODO Auto-generated method stub
		System.err.println("area is (l*b)/2");
	}

	public static void main(String args[]) {
		area_rhombus t1 = new area_rhombus();
		t1.draw();
		t1.getarea();
	}
}
