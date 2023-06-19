package myStudy2;

import myStudy.AccessModifier;

public class AccessModifier2 {
//	public static void main(String[] args) {
//		AccessModifier am = new AccessModifier(); // ia만 접근가능(public)
////		AccessModi amodi = new AccessModi(); // ia만 접근가능
//		// new AccessModi().ie;
//
//	}
}

class AccessModi extends AccessModifier { // A/M의 자식클래스
	// myStudy에있는 AccessModifier 클래스에 있는
	// ia, ib, ie, ig 접근 가능

	int a = AccessModi.ie;

	// 매개변수가 있는 생성자를 생성했을때 다른 클래스에서 객체를 생성하고 싶으면 기본생성자를 생성 해줘야한다.
	// 매개변수가 있는 생성자도 없고 기본생성자가 없을땐 기본생성자를 생성하지 않아도 다른클래스에서 new를 통해 객체를 생성 할 수 있다
	// 기본생성자는 안보이지만 자동으로 생성 되기 때문에

	// static final 정적 상수
	AccessModi(int a) {
		this.a = a;
	}

	public AccessModi() {
		// TODO Auto-generated constructor stub
	}

	public void Access() {
		int c = this.a;
		System.out.println(this);
	}

	public static void main(String[] args) {
		AccessModi amodi = new AccessModi();
		int bb = AccessModi.ie; // static 변수

		int bb1 = AccessModifier.getIh();
		System.out.println("bb1: " + bb1);

		amodi.Access();
		int a = amodi.ia;
		int b1 = AccessModifier.ie;
		int b = amodi.ie; // static변수는 객체생성을 해주지 않고 불러와야함

		System.out.println(bb);

	}
}