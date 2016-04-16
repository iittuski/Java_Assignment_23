package j23;

public class area_sqaure extends area_shapes{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is sqaure");
	}

	@Override
	void getarea() {
		// TODO Auto-generated method stub
		System.out.println("area is l*b");
	}
	public static void main(String args[]) {
		area_sqaure t1 = new area_sqaure();
		t1.draw();
		t1.getarea();
	}

}
