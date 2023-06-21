package ddit.chap07.sec01;

public class ShapeExample {
	public static void main(String[] args) {
//		Shape s1 = new Shape(); // 부모
//		Shape s2 = new Shape("black", "unknown");
//		s2.draw();

		Circle c1 = new Circle(); // 자식
		c1.color = "magenta";
		c1.kind = "rectangle";
		c1.draw(); // 부모클래스를 상속해서 부모쪽 필드와 메서드를 쓸 수 있다0./

		Circle c2 = new Circle(10, "white", "원", new Point(300, 500));
		c2.draw();
		c2.getArea();
	}
}
