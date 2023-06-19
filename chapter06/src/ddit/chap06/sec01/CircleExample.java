package ddit.chap06.sec01;

public class CircleExample {
	public static void main(String[] args) {
		Circle c = new Circle(20);

		double area = c.getArea(20);
		double circum = c.getCircumference(30);

		System.out.println("����: " + area);
		System.out.println("�ѷ�: " + circum);
	}
}

class Circle {
	private double radius; // �����ʱ�ȭ
	private final double PI = 3.1415926; // = �����ʿ��� �� �� ����

	Circle() {
	}

	Circle(double radius) {
		this.radius = radius;
	}

	// ������*������*3.14 ����
	// ����*3.14 �ѷ�

	public double getArea(double radius) {
		double area = radius * radius * PI;

		return area;
	}

	public double getCircumference(double radius) {
		double circum = radius * PI;
		return circum;
	}
}
