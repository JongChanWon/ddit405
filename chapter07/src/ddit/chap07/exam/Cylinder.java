package ddit.chap07.exam;

public class Cylinder {
	public static void main(String[] args) {
		CylinderInfo cInfo = new CylinderInfo(new Circle(2.8), 5.6);
		System.out.println("원통의 부피: " + cInfo.getVolume());

	}
}

class CylinderInfo extends Circle {
	private double high;
	private Circle circle;

	public CylinderInfo() {
	}

	CylinderInfo(Circle circle, double high) {
		super(circle.radius);
		this.high = high;

	}

	public double getVolume() {

		double volume = super.getArea() * high;
		return volume;
	}
}
