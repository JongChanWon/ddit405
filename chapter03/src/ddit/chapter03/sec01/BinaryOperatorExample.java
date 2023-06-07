package ddit.chapter03.sec01;

import java.util.Scanner;

public class BinaryOperatorExample {
	static Scanner sc = new Scanner(System.in);
	static boolean flag = false;

	public static void main(String[] args) {
		// ��Ģ������: +, -, /, *, %
		// fourProngedOperator();
		// ���迬����: >, <, ==, >=, <=, !=(<>)
		// relationalOperator();
		// ��������: !(not), &&(and), ||(or) ==> ����� ��or����
		// logicalOperator();
		// �Ҵ翬����: =
		// ���չ���������: ��������ڿ� �Ҵ翬���ڰ� ����
		// => ����� ���� ������ '=' �����ʿ� ����Ǿ����
		// ex) sum = sum + 3 == sum += 3, sum = sum + (cnt*3) == sum += (cnt*3)
		// ��Ʈ������: &(��Ʈ�� and), |(��Ʈ��or), ^(��Ʈ�� ex-or) ==> ����� ����
		// ##��ȣ��Ʈ�� ������ �ȵ�
		// bitWiser();
		// �̵�������: >>(right shift), <<(left shift)
		// >>>( "")
		shiftOperator();

	}

	public static void fourProngedOperator() { // ��Ģ������
		// �� �ϳ��� �Է¹޾� ¦���� Ȧ���� �����Ͻÿ�.
		System.out.println("���ڸ� �Է��� �ּ���.");

		int num = sc.nextInt();
		if (!(num % 2 == 0)) {
			System.out.println("Ȧ��");
		} else {
			System.out.println("¦��");
		}
	}

	public static void relationalOperator() {
		// ���迬����: ����Ŀ� ���Ǿ� ����� ��, ������ ��ȯ
		// if, while, for� ���
		while (!flag) {
			System.out.print("�����Է�: ");
			char ch = sc.next().charAt(0);

			if (ch >= 97 && ch < 'z') {
				System.out.println("�� �ҹ��ڸ� �Է��Ͽ���");
			} else if (ch >= 'A' && ch <= 'Z') {
				System.out.println("�� �빮�ڸ� �Է��Ͽ���");
			} else if (ch >= 48 && ch < 58) {
				System.out.println("���ڸ� �Է��Ͽ���");
			} else {
				System.out.println("Ư�����ڸ� �Է��Ͽ���");
			}
			System.out.println();
		}
	}

	public static void logicalOperator() {
		// Ű����� �⵵�� �Է¹޾� ����� ����� �����ϴ� ���α׷��ۼ�
		// ����: 4�ǹ���̸鼭 100�� ����� �ƴ� �� �Ǵ� 400�� ����� �Ǵ� ��
		while (!flag) {
			System.out.print("�⵵ �Է�: ");
			int year = sc.nextInt();

			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("����");
			} else {
				System.out.println("���");
			}
		}
	}

	public static void bitWiser() {
		int num1 = 115;
		int num2 = 36;
		char c = 'A' + 1;

		System.out.println(c);
		System.out.println("��Ʈ�� &: " + (num1 & num2));
		System.out.println("��Ʈ�� |: " + (num1 | num2));
		System.out.println("��Ʈ�� ^: " + (num1 ^ num2));

	}

	public static void shiftOperator() {
		// ������ >> �̵���ų ��Ʈ��
		// ������ / 2�� ����(�̵���ų ��Ʈ��)

		// ������ << �̵���ų ��Ʈ�� (�����ʿ� �߻��� ������� 0�� ä����) => ��ȣ��Ʈ�� �̵����� ����
		// ������ * 2�� ����(�̵���ų ��Ʈ��)

		// ������ >>> �̵���ų ��Ʈ��(��ȣ���� �����ؼ� 3ĭ �̵�)
		// ���� ��������� 0�� ä����, ��ȣ��Ʈ������ �̵��� ����
		int num1 = 115;
		byte num2 = (byte) -27;

		System.out.println(num2 >>> (byte) 2);

	}
}
