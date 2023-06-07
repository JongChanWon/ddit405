package ddit.chapter03.sec01;

import java.util.Scanner;

public class UnaryOperatorExample {
	public static void main(String[] args) {
		// ���׿�����: ++, --(����������)
		// +, -(��ȣ������)
		// !(NOT: ������ ������)
		// IncreDecrementOperator();
		logicalNot();
	}

	public static void IncreDecrementOperator() {
		// ++, --: 1�� ����(����)
		// 1)������(prefix) ǥ���
		// ++(--)����
		// ex) int num = 0;
		// int res = ++num; => num�� ���� 1���� ��Ű�� �� ���� res�� �Ҵ�
		// 2)������(postfix) ǥ���
		// ����++(--)
		// ex) int num = 0;
		// int res = ++num; => num�� ���� res�� �Ҵ��ϰ� num ���� 1����

		System.out.println("1.prefix");
		int val = 100;
		int res = ++val;
		System.out.println("val= " + val + "\nres= " + res);

		val = 100;
		res = val++;
		System.out.println("2.postfix");
		System.out.println("val= " + val + "\nres= " + res);
	}

	public static void logicalNot() {
		// ������(true=>false, false=>true)
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�: ");
		int age = sc.nextInt();

		if (!(age < 18)) {
			System.out.println("����");
		} else {
			System.out.println("�̼���");
		}
	}

}
