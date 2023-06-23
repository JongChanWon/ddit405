package ddit.chap07.exam;

public class Circle {
	public double radius;
	public double PI = 3.141592;

	Circle() {

	}

	Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {

		return radius * radius * PI;
	}
}
