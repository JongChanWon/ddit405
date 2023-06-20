package ddit.chap06.sec06.study;

public class Rectangle {
	double width; // 가로
	double length; // 세로

	// 사각형 둘레: (한변길이+다른변길이)*2
	// 사각형 면적: 가로*세로

	Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double getArea() {

		return width * length;
	}

	public double getCircumference() {
		return (width + length) * 2;
	}
}
