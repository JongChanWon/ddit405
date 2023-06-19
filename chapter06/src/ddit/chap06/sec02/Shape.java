package ddit.chap06.sec02;

public class Shape {
	String shapeKind;
	Point point;

	public Shape(String shapeKind, Point point) {

		this.shapeKind = shapeKind;
		this.point = point;
	}

	public Shape(Point point) {
		this("원", point);
	}

	@Override
	public String toString() {

		return point + "인 " + shapeKind;
	}

}

class Point {

	private int x;
	private int y;

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y; // 내가 저장될 힙의 주소
	}

	@Override
	public String toString() {
		return "원점이(" + x + ", " + y + ")";
	}
}