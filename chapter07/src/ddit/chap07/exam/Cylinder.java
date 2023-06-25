package ddit.chap07.exam;

public class Cylinder {
	public static void main(String[] args) {
		// �� ������ ���� ��ü ������ �����ϵ��� �����ڸ� ����
		// . Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
		CylinderInfo cInfo = new CylinderInfo(new Circle(2.8), 5.6);
		System.out.println("������ ����: " + cInfo.getVolume());

	}
}

class CylinderInfo extends Circle {
	private double high;
	private Circle circle;

	public CylinderInfo() {
	}

	CylinderInfo(Circle circle, double high) {
		super(circle.radius);
		this.circle = circle;
		this.high = high;

	}

	public double getVolume() {

		return circle.getArea() * high;
	}
}
