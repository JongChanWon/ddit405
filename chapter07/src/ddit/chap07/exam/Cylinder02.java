package ddit.chap07.exam;

public class Cylinder02 {
	public static void main(String[] args) {

		CylinderInfo02 cd2 = new CylinderInfo02(2.8, 5.6);
		System.out.println("원통의 부피: " + cd2.getVolume());

	}
}

class CylinderInfo02 extends Circle {
	private double high;
	private Circle circle;

	public CylinderInfo02() {
	}

	CylinderInfo02(double radius, double high) {
		super(radius);
		this.high = high;
		this.circle = new Circle(radius);

	}

	public double getVolume() {
		double volume = circle.getArea() * high;
		return volume;
	}
}
