package ddit.chap02.sec01;

import java.util.Scanner;

public class BooleanExample {
	public static void main(String[] args) {
		boolean flag = true;
		int age = 0;

		System.out.println(flag);
		Scanner sc = new Scanner(System.in);
		// ��ü ���� , ������� �ʱ�ȭ�� ����
		// new�� ���ؼ� heap�� ����
		// �����ڿ� �� �� �ʱ�ȭ
		// ������ �޼ҵ�� �빮��

//		Ű����� �ڷḦ �Է¹޴� ��� (Scanner class ���)
//		1) Scanner class ��ü ���� => new ������ ���
//		2) �޽����� ���
		System.out.print("�����Է�: ");
//		3) �Է¹��� �ڷ� ����(scannerŬ���� �޼��� ���)
		age = sc.nextInt();
		System.out.println(age);

	}
}
