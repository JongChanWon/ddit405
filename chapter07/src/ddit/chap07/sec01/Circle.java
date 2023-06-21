package ddit.chap07.sec01;

public class Circle extends Shape { // 자식
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
		System.out.println("원의 면적: " + area);
		System.out.println("원의 중심: " + center);
		System.out.println("점의 위치: " + center.getLocation());
	}
}
