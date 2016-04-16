package j23;

public class area_triangle extends area_shapes {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("this is triangle");
	}

	@Override
	void getarea() {
		// TODO Auto-generated method stub
		System.out.println("area is (l*b)/2");
	}

	public static void main(String args[]) {
		area_triangle t1 = new area_triangle();
		t1.draw();
		t1.getarea();
	}

}
