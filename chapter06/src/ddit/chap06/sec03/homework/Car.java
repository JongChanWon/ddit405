package ddit.chap06.sec03.homework;

import java.util.Scanner;

/*�䱸����1] �ڵ��� Ŭ������ �����Ͻÿ�.
�ڵ��� Ŭ������ ����(gas) �Ӽ��� ������ ������ �ܺο��� ������ �� ����.
����� �ʿ��� �� ������ �� ������ ���� ���Ḧ Ȯ���� �� �ִ� ����� ��ư�� �ִ�.
�ڵ����� ���ᰡ ���� ������ ������ �� �ְ� �����Ҷ����� ������ ���� ������ ���ҵǸ�
���ᰡ �������� ������ ������ �� ����.*/
public class Car {
	Scanner sc = new Scanner(System.in);
	// ����, setter, ����� Ȯ���ϴ� �޼���
	private int gas;

	public void setGas(int gas) {
		this.gas = gas;
	}

	// ���� �ʿ��Ҷ� ���� ����, ���� ���� Ȯ�α��
	public void driveCar() {
		if (gas <= 0) {
			System.out.println("������ ��� ������ �� �� �����ϴ�. ���� �Ϸ� ����!!");
			gasStation();
		} else if (gas > 0 && gas <= 50) {
			System.out.println("���� �ϼŵ� �˴ϴ�. ���� ����� " + gas + "L");
//			for (int drive = 1; drive <= gas; drive++) {
			// 1Ű�� �������� gas = 1������
			while (true) {
				System.out.print("������ �Ÿ��� �Է����ּ���: ");
				int moveCar = sc.nextInt();
				if (moveCar == gas) {
					gas = 0;
					System.out.println("���� ����: " + gas + "�Դϴ�. ������ �ʿ��ؿ�");
					gasStation();
				} else if (moveCar < gas && moveCar != 0) {
					// �Է��� �Ÿ���ŭ ���� ����
					// gas = moveCar;

					gas -= moveCar;
					System.out.println(moveCar + "km �̵��ؼ�" + "����" + gas + "L ���ҽ��ϴ�.");
				} else {
					if (moveCar == 0) {
						System.out.println("�߸��Է��ϼ̽��ϴ�" + moveCar + "km�� �� �� �����ϴ�.");
					} else {
						System.out.println("�߸� �Է��ϼ̽��ϴ�. " + gas + "L�� ���� �ִ� �Ÿ��� �ƴմϴ�.");
					}
				}
			}
//			}
		}
	}

	private void gasStation() {

		int limit = 50; // ���� limit

		while (true) {
			System.out.print("������ ���� �Է����ּ���: ");
			int charge = Integer.parseInt(sc.next());

			if (charge > limit) {
				System.out.println("50L �� �����Դϴ�. �ٽ� �Է����ּ���");

			} else if (charge <= limit) {
				System.out.println(charge + "L �� ���� �Ǿ����ϴ�.");
				gas = charge;
				if (gas > 50) {
					System.out.println("������ �Ϸ� �Ǿ����ϴ�. ���� ������: " + gas + "L \n50L �ʰ��ؼ� ä�� �� �����ϴ�.");
//					driveCar();
//					return;
				}
				driveCar();
			}
		}
//		// 100 �����ϸ� ���� 10����
//		// �����ϸ� 5������
//		System.out.print("����������: ");
//		int charge = Integer.parseInt(sc.nextLine());
//
//		for (int i = 0; i < limit; i++) {
//
//		}
//
//	} else {

	}

	@Override
	public String toString() {
		return "���� ������ [gas=" + gas + "]";
	}

}
