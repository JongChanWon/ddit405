package ddit.chap06.sec06.study;

public class Rectangle {
	double width; // ����
	double length; // ����

	// �簢�� �ѷ�: (�Ѻ�����+�ٸ�������)*2
	// �簢�� ����: ����*����

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
