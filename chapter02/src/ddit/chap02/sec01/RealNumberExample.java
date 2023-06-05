package ddit.chap02.sec01;

public class RealNumberExample {
	public static void main(String[] args) {
		floatType();
		doubleType();
	}

	public static void floatType() {

		float a = (float) 3.1d;
		float f = 3.1415926F;
		long l = 1000000L;
		float res = f * l;
		System.out.println("결과: " + res);
	}

	public static void doubleType() {
		double a = 3.1f;
		float b = 3.1f;
		System.out.println(a); // 변환오차
		System.out.println(b);

	}
}
