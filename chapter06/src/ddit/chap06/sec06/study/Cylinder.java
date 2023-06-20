package ddit.chap06.sec06.study;

public class Cylinder {
	double high;
	Circle circle;

	Cylinder(Circle circle, double high) {
		this.circle = circle;
		this.high = high;
	}

	public double getHigh() {

		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public double getVolume() {

		double volume = circle.getArea() * high;
		System.out.println(volume);
		return volume;
	}
}
