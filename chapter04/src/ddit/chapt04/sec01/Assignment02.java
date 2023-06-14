package ddit.chapt04.sec01;

import java.util.Scanner;

public class Assignment02 {
	public static void main(String[] args) {
		example_01();
		example_02();
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
		char ch = ' ';

		for (int i = 0; i < word.length(); i++) {
			ch = word.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("����: " + ch);
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
		int num1 = 1; // ���� ��
		int num2 = 1; // �� ��
		int sum = 0; // ���� ��
		// System.out.prinf("�����������ڿ�" , ����); []�� ���� �� �� ���� "%[-][m][.m]d|s|f" �� �ü� ����
		// [-]������ ���� ���� ����, [m] �ڸ���(��°����� ũ��), [.m] �Ҽ��� ������ �ڸ���, d 10����(����) | s ���ڿ� | �Ǽ�
		// 1, 1, 2, 3, 5, 8, 13, 21, 34
		// System.out.printf("%5d%6.2f", 20, 6.2);
		System.out.printf("%1d%2d", 1, 1);
		for (int i = 1; i <= 50; i++) {
			sum = num1 + num2;
			if (sum > 50) {
				break;
			} else {
				if (sum >= 10) {
					System.out.printf("%3d", sum);
				} else {

					System.out.printf("%2d", sum);
				}
				num1 = num2;
				num2 = sum;
			}
		}
	}
}