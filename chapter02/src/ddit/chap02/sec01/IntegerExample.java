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
		// b1�� �ִ� ������ ���� �����
		System.out.println("b++ => " + ++b1);
		System.out.println("b++ => " + b1++);
		System.out.println("b++ => " + b1++);
	}

	public static void shortType() {
		short sh1 = 100;
		short res = (short) (sh1 + 150); // cast
		// short res = sh1 + 150; intŸ������ ��ȯ��µ� short�� ������� ����϶�� �ϴ� ������ ��
		System.out.println(res);
	}

	public static void intType() {
		int num = 100;
		short s = 200;
		byte b = 55;

		int result = num + s + b; // �ڵ����� int�� ����ȯ
		System.out.println(result);
	}

	public static void longType() {
		// long: ���� literal ���� L �̳� l�� �߰����༭ Ÿ���� �� �� ����
		long val1 = 1000000000000000000L;
		System.out.println(val1);

	}
}
