package ddit.chap06.sec01;

public class CircleExample {
	public static void main(String[] args) {
		Circle c = new Circle(20);

		double area = c.getArea(20);
		double circum = c.getCircumference(30);

		System.out.println("넓이: " + area);
		System.out.println("둘레: " + circum);
	}
}

class Circle {
	private double radius; // 직접초기화
	private final double PI = 3.1415926; // = 오른쪽에만 쓸 수 있음

	Circle() {
	}

	Circle(double radius) {
		this.radius = radius;
	}

	// 반지름*반지름*3.14 넓이
	// 지름*3.14 둘레

	public double getArea(double radius) {
		double area = radius * radius * PI;

		return area;
	}

	public double getCircumference(double radius) {
		double circum = radius * PI;
		return circum;
	}
}
