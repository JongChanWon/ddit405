package ddit.chapter04.sec01;

import java.util.Scanner;

public class Assignment02 {
	public static void main(String[] args) {
		// example_01();
		// example_02();
		example_03();
	}

	public static void example_01() {
//		����1] +1 -2 +3 -4 +5 -6 +7 -8 +9 -10 = -5
		int oddSum = 0;
		int evenSum = 0;
		String str = "";

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				if (i != 1) {
					str += " +" + i;
				} else {
					str += "" + i;
				}
				oddSum += i;
			} else {
				if (i == 10) {
					str += " -" + i + " = ";
				} else {
					str += " -" + i;

				}
				evenSum -= i;
			}
		}
		System.out.println(str + (oddSum + evenSum));

	}

	public static void example_02() {
//		���� 2] Ű����� �ܾ �Է� �޾� �ܾ ���Ե� ����(a,e,i,o,u)�� ���� ����Ͻÿ�.
		// ex) scanner ��� �ܾ �Է��ϸ� a,e ������ => 2��
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("���� ����: " + count);
		sc.close();
	}

	public static void example_03() {
//		���� 3] 1-50 ���̿� �����ϴ� fibonacci ������ ����Ͻÿ�
//    	** fibonacci ���� : ù ���� �ι�°���� 1�� �־����� �� ��������
//      �� �� ���� ���� ������� �Ǵ� ����
//      => �ڷ� �˻��˰��� ���(�ǳ볪ġ �˻�)

		for (int i = 1; i <= 50; i++) {

		}

	}
}