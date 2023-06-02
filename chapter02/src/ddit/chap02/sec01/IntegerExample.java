package ddit.chap02.sec01;

public class IntegerExample {

	public static void main(String[] args) {
		IntegerExample ie = new IntegerExample();
		ie.byteType();
		shortType();
		intType();
		longType();
	}

	public void byteType() {
		byte b1 = 127;

		System.out.println("b1 = " + b1);
		// b1에 있는 데이터 값이 저장됨
		System.out.println("b++ => " + ++b1);
		System.out.println("b++ => " + b1++);
		System.out.println("b++ => " + b1++);
	}

	public static void shortType() {
		short sh1 = 100;
		short res = (short) (sh1 + 150); // cast
		// short res = sh1 + 150; int타입으로 변환됬는데 short로 결과값을 출력하라고 하니 에러가 남
		System.out.println(res);
	}

	public static void intType() {
		int num = 100;
		short s = 200;
		byte b = 55;

		int result = num + s + b; // 자동으로 int로 형변환
		System.out.println(result);
	}

	public static void longType() {
		// long: 숫자 literal 끝에 L 이나 l을 추가해줘서 타입을 알 수 있음
		long val1 = 1000000000000000000L;
		System.out.println(val1);

	}
}
