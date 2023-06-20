package ddit.chap06.sec06.study;

public class CylinderExample {
	public static void main(String[] args) {

		Cylinder cylinder = new Cylinder(new Circle(2.8), 5.6);
		cylinder.getVolume();
	}
}
