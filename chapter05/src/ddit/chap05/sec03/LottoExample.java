package ddit.chap05.sec03;

import java.util.Scanner;

public class LottoExample {
	public static void main(String[] args) {
		Lotto lo = new Lotto();
		// �ʱ�ȭ�� ������� l1�� �־��� (new Lotto();)
		// lo.suffle();
		lo.buyLotto();
	}
}

class Lotto {
	// �������: �ζ� Ŭ������ �����ɶ� ����� �ζ�Ŭ������ �Ҹ�ɶ� ���� �Ҹ��
	// �޼��� �ۿ��� ����Ǿ����
	// ������� �ʱ�ȭ ���: =������, �ʱ�ȭ ���, ������ �޼���
	int[] lotto = new int[45]; // 45���� ������

	Lotto() { // ������ �޼���(��ü�ʱ�ȭ) ��ü ������� �ʱ�ȭ!!
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (i + 1);
		}
	}

	public void suffle() {
		for (int i = 0; i < 1000000; i++) {
			int rnd = (int) (Math.random() * lotto.length);
			int temp = lotto[0]; // lotto�� 0��° �ּҸ� temp�� �־���
			lotto[0] = lotto[rnd];
			lotto[rnd] = temp;

		}
	}

	public void buyLotto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �׼��� 1000������ �Է�: ");
		int money = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < money / 1000; i++) {
			suffle();
			for (int j = 0; j < 6; j++) {
				System.out.printf("%5d", lotto[j]);
			}
			System.out.println();
		}

	}

}