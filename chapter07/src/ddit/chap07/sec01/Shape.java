package ddit.chap07.sec01;

// 부모클래스의 기본생성자를 호출 해야하는데(파라미터가 있는 생성자는 파라미터가 몇개 올지 모르니 상속 받을 수 없다) 부모클래스에 기본생성자가 없으면
// 자식클래스 에서 상속 받을 수 없어서 오류가 남(자식클래스의 기본생성자에서 super()를 받아서 써야함
public class Shape { // 부모
	String color;
	String kind;

	Shape() {
	}

	Shape(String color, String kind) {
		this.color = color;
		this.kind = kind;
	}

	public void draw() {
		System.out.println(color + "색상의 " + kind + "도형을 그리다.");
	}
}
