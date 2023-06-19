package ddit.chap06.sec02;

public class ShapeExam {
	public static void main(String[] args) {
		Shape s1 = new Shape("타원형", new Point(100, 100));
		System.out.println(s1);

		s1.shapeKind = "원";
		s1.point = new Point(300, 500);
		System.out.println(s1);

		Shape s2 = new Shape("삼각형", new Point());
		System.out.println(s2);

	}

}
