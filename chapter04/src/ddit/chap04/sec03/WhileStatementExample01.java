package ddit.chap04.sec03;

import java.util.Scanner;

public class WhileStatementExample01 {
	public static void main(String[] args) {
//		gugudan();
//		moneyBox();
//		numberChop();
//		cafe();
		whileGugudan();
	}

	public static void gugudan() {
		int i = 2;
		int j = 0;
		while (i > 1 && i < 10) {
			System.out.println(i + "��");
			j = 1;
			while (j < 10) {
				System.out.println(i + "*" + j + "=" + i * j);
				j++;

			}
			System.out.println();
			i++;
		}

		System.out.println("==============For��===============");
		for (i = 2; i < 10; i++) {
			for (j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
		System.out.println("=================================");

	}

	public static void moneyBox() {
		int sum = 0; // ���� �Ѿ�
		int days = 0; // ����ϼ�
		int amount = 100;

		while (sum <= 1000000) {
			sum += amount;
			amount *= 2;
			days++;
		}
		System.out.println("����ϼ�: " + days + "��\n����ݾ�: " + sum + "��");
	}

	public static void numberChop() {
		int count = 0;
		while (count < 9) {
			count++;
			System.out.println(count + "��° �������� �߽��ϴ�. ���� ������ �ȳѾ� �����ϴ�.");
		}
		System.out.println(++count + "��° �������� �߽��ϴ�. ������ �Ѿ���ϴ�.");
	}

	public static void cafe() {
		Scanner sc = new Scanner(System.in);

		String menu = "1. �Ƹ޸�ī�� 2000��\n" + "2. ī��� 3500��\n" + "3. ī��Ḷ���߶� 5000��\n" + "4. �ڹ�Ĩ ������ġ�� 6500��\n" + "5. ����";
		int sum = 0; // �ֹ� �ݾ� �հ�
		int exit = 0; // ���α׷� ���� ����
		String bill = "     **������**\n";
		bill += "===================\n";

		while (true) {
			System.out.println(menu);
			System.out.print("��ð� ���� Ŀ�Ǹ� �������ּ���");
			int choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1:
				sum += 2000;
				bill += "1. �Ƹ޸�ī�� 2000��\n";
				break;
			case 2:
				sum += 3500;
				bill += "2. ī��� 3500��\n";
				break;
			case 3:
				sum += 5000;
				bill += "3. ī��Ḷ���߶� 5000��\n";
				break;
			case 4:
				sum += 6500;
				bill += "4. �ڹ�Ĩ ������ġ�� 6500��\n";
				break;

			case 5:
				exit = -1;
				break;
			default:
				System.out.println("�߸��� �����Դϴ�.");
				break;
			}
			if (exit == -1) {
				System.out.println("���α׷��� �����ϰڽ��ϴ�.");
				System.out.println();
				break; // while�� break
			}
		}
		bill += "===================\n";
		bill += "    �հ�: " + sum;
		System.out.println(bill + "��");
		System.out.println("===============================================================");

		for (int i = 2; i <= 9; i++) {
			System.out.print(i + "��\t");
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

	}

	public static void whileGugudan() {
		int i = 2;
		while (i < 10) {
			System.out.print(i + "��\t");

			i++;
		}
		System.out.println();
		i = 1;
		while (i < 10) {
			int j = 2;
			while (j < 10) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
			i++;
		}

	}
}
