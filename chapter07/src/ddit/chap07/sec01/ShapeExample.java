package ddit.chap07.sec01;

public class ShapeExample {
	public static void main(String[] args) {
//		Shape s1 = new Shape(); // �θ�
//		Shape s2 = new Shape("black", "unknown");
//		s2.draw();

		Circle c1 = new Circle(); // �ڽ�
		c1.color = "magenta";
		c1.kind = "rectangle";
		c1.draw(); // �θ�Ŭ������ ����ؼ� �θ��� �ʵ�� �޼��带 �� �� �ִ�0./

		Circle c2 = new Circle(10, "white", "��", new Point(300, 500));
		c2.draw();
		c2.getArea();
	}
}
