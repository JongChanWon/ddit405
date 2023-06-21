package ddit.chap07.sec01;

public class Circle extends Shape { // �ڽ�
	int radius;
	Point center;

	Circle() {
		center = new Point();
	}

	Circle(int radius, String color, String kind, Point point) {
		super(color, kind);
		this.radius = radius;
		this.center = point;

	}

	public void getArea() {
		double area = radius * radius * 3.1415926;
		System.out.println("���� ����: " + area);
		System.out.println("���� �߽�: " + center);
		System.out.println("���� ��ġ: " + center.getLocation());
	}
}
