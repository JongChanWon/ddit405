package ddit.chapt04.sec01;

import java.util.Scanner;

public class Assignment01 {
	public static void main(String[] args) {
		// ��ǻ�Ϳ� ���������� �������ϴ� ���α׷��� �ۼ��Ͻÿ�..
		// 1. ��ǻ�ʹ� 1-3������ ������ �߻���Ų��.
		// 2. ����=>1, ����=>2, ��=>3�̸�
		// 3. ����ڴ� Ű����ȣ 1-3������ ���ڸ� �Է��Ͽ� ���ڸ� �����Ѵ�

		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int count = 0;

		while (!flag) {
			int com = (int) (Math.random() * 3 + 1);
			System.out.println("1.���� 2.���� 3.��!!");
			int me = sc.nextInt();

			int ���� = 1;
			int ���� = 2;
			int �� = 3;

			System.out.println("com: " + com);
			System.out.println("me: " + me + "\n");

			if (me < 4) {
				count++;
				if ((me == ���� && com == ����) || (me == ���� && com == ��) || (me == �� && com == ����)) {
					System.out.println("�����ϴ�");
				} else if (com == me) {
					System.out.println("�����ϴ�");
				} else {
					System.out.println("�̰���ϴ�");
					System.out.println("�õ�Ƚ��: " + count + "�� ���� �̰���ϴ�");
					break;
				}
				System.out.println();
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�!! 1~3������ ���ڸ� �Է����ּ���");
			}
		}
		sc.close();
	}
}
