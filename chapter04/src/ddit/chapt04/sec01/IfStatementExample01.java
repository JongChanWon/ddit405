package ddit.chapt04.sec01;

import java.util.Scanner;

public class IfStatementExample01 {
	public static void main(String[] args) {
		// ���� ������, �������ڸ� if ���ǹ��� ���� �� ����
		IfStatement is = new IfStatement();
		// is.method1();
		is.method2();
	}
}

class IfStatement {
	Scanner sc = new Scanner(System.in);
	boolean flag = false;

	public void method1() {
		// ����1) Ű����� ������ �Է� �޾Ƽ� 60�� �̻��̸� "�հ�"�� ����ϼ���
		while (!flag) {
			System.out.print("�����Է�: ");
			int score = sc.nextInt();

			if (score >= 60) {
				System.out.println("�հ�");
			} else {
				System.out.println("���հ�");
			}
			System.out.println();
		}
	}

	public void method2() {
		// ����2) ��ǻ�Ͱ� 1~50������ ������ �߻�
		// ����ڴ� 1~50������ ���ڸ� Ű����� �Է¹޾� ��ǻ�Ϳ� �߻���Ų ������ ���ؼ� ���� ���� ã�ƶ�
		// ��ǻ�Ͱ� �߻���Ų ������ ���ߴ� ����
		// ��ǻ�Ͱ� �߻���Ų ���� > ����ڰ� �Է��� �� => "�� ū���� �Է��ϼ���..."
		// ��ǻ�Ͱ� �߻���Ų ���� < ����ڰ� �Է��� �� => "�� �������� �Է��ϼ���..."
		// ��ǻ�Ͱ� �߻���Ų ���� = ����ڰ� �Է��� �� => "�����Դϴ�"
		int com = (int) (Math.random() * 50 + 1);
		int count = 0; // �õ�Ƚ��

		while (!flag) {
			System.out.print("���� �Է�(1~50): ");
			int me = sc.nextInt();
			count++;

			if (com > me) {
				System.out.println("�� ū���� �Է��ϼ���");
			} else if (com < me) {
				System.out.println("�� �������� �Է��ϼ���");
			} else {
				System.out.println("�����Դϴ�");
				System.out.println("�õ�Ƚ��: " + count);
				break;
			}
		}

	}
}