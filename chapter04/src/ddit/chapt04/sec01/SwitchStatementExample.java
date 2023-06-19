package ddit.chapt04.sec01;

import java.util.Scanner;

public class SwitchStatementExample {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// new SwitchStatementExample().switchMethod1();
		SwitchStatementExample sse = new SwitchStatementExample();
		// sse.switchMethod1();
		// sse.switchMethod2();
		// sse.switchMethod3();
		sse.switchMethod4();
		// System.out.println(sse.switchMethod1());
		// ��ȯŸ���� ���� �޼���(void)�� println() �ȿ� �� �� ����.
	}

	public void switchMethod1() {
		// ����1] Ű����� ȸ���� ���(1~3)�� �Է¹޾� 1�̸� "vip ȸ���Դϴ�.

		System.out.print("ȸ�� ��� �ڵ�: ");
		int grade = sc.nextInt();

		switch (grade) {
		case 1:
			System.out.println("vip ȸ���Դϴ�.");
			break;
		case 2:
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case 3:
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		default:
			System.out.println("����ڵ尡 �߸��ԷµǾ����ϴ�.");
			break;
		}
	}

	public void switchMethod2() {
		// ����2] ȭ�鿡 "[1]. ȸ�� �ű� ���" "[2]. ȸ�� ���� ����" "[3]. ȸ������ ����"

		System.out.println("[1]. ȸ�� �ű� ���");
		System.out.println("[2]. ȸ�� ���� ����");
		System.out.println("[3]. ȸ�� ���� ����");
		int select = sc.nextInt();
		switch (select) {
		case 1:
			System.out.println("��� �Ǿ����ϴ�.");
			break;
		case 2:
			System.out.println("���� �Ǿ����ϴ�.");
			break;
		case 3:
			System.out.println("���� �Ǿ����ϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			break;
		}
	}

	public void switchMethod3() {
		// ����1] 1~12���� �Է� �޾� 1,3,5,7,8,10,12���̸� "31�ϱ��� �ִ� �� �Դϴ�"

		System.out.println("������ �Է����ּ���");
		int month = sc.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31�ϱ��� �ִ� �� �Դϴ�.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30�ϱ��� �ִ� �� �Դϴ�.");
			break;
		case 2:
			System.out.println("28 Ȥ�� 29�� ���� �ִ� �� �Դϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			break;
		}

	}

	public void switchMethod4() {
		// ����2] ���� �ϳ��� �Է� �޾� �� ���� 100~96 �̸� "A"
		System.out.print("���� �Է�: ");
		int score = sc.nextInt();

		String grade = "";
		switch (score / 10) {
		case 10:
			grade = "A+";
			break;
		case 9:
			grade = "A";
			switch (score % 10) {
			case 0:
			case 1:
			case 2:
				grade = grade + "-";
				break;
			case 3:
			case 4:
			case 5:
				grade = grade + "0";
			default:
				grade = grade + "+";
				break;
			}
			break;
		case 8:
			grade = "B";
			switch (score % 10) {
			case 0:
			case 1:
			case 2:
				grade = grade + "-";
				break;
			case 3:
			case 4:
			case 5:
				grade = grade + "0";
			default:
				grade = grade + "+";
				break;
			}
			break;

		default:
			grade = "Fail";
			break;
		}
		System.out.println("���� " + score + "�� ����� " + grade + "�Դϴ�.");
	}

}
