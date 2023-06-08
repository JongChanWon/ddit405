package ddit.chap04.sec02;

public class ForStatementExample01 {
	public static void main(String[] args) {
		// for�� ���� ���� �� �ִ� ������(�񱳿�����, ��������)
		// ���ѷ���...
//		for (;;) {
//			System.out.println("looping...");
//		}
		// ����for������ ����for���� ���� ���.. �ٱ����� ���� ���

//		����1] 1~100 ������ ������ ��� ����Ͻÿ�.
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println();

//		����2] 1~100 ������ ��� ���� ���� ���� ����Ͻÿ�
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100������ ��: " + sum + "\n");

//		����3] 1~100 ���̿� �����ϴ� ¦���� Ȧ���� ���� ����Ͻÿ�
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				oddSum += i;
			} else {
				evenSum += i;
			}
		}
		System.out.println("Ȧ����: " + oddSum + "\n¦����: " + evenSum + "\n");

//		����4] ���ĺ� A~Z �� ���ٿ� ����Ͻÿ�.
		System.out.println("���ĺ� A~Z");

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		System.out.println();

//		����5] 1/1 + 1/2 + 1/3 + ... + 1/10 = �� ����� ����Ͻÿ�.
		// 1 + 0.5 + 0.3 + 0.25 + 0.2 + 0.16
		double sum1 = 0;
		String expr = "";
		for (int i = 1; i <= 10; i++) {
			sum1 += (1 / (double) i);

			if (i != 10) {
				expr += 1 + "/" + i + " + ";
			} else {
				expr += 1 + "/" + i + " = ";
			}
		}
		System.out.println(expr + sum1);

//		����6] +1 -2 +3 -4 +5 -6 +7 -8 +9 -10 = -5
		oddSum = 0;
		evenSum = 0;

		// (1 3 5 7 9) + (-2 -4 -6 -8 -10)
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				oddSum += i;
				System.out.println("odd =>" + oddSum);
			} else {
				evenSum -= i;
			}
		}
		System.out.println("Ȧ�� ��: " + oddSum + "\n¦�� ��: " + evenSum);
		System.out.println("Ȧ¦ ��: " + (oddSum + evenSum));

		ForStatementExample01 fse = new ForStatementExample01();
		fse.forMethod();
	}

	public void forMethod() {
		// ���� 1�� 1�� 1�Ϻ��� 23.6.8�ϱ����� ��
		int y = 2023;
		int d = 8;
		int month = 6;
		int days = 0;

		for (int year = 1; year < y; year++) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				// ����: 366
				days = days + 366;
			} else {
				days = days + 365;
			}
		}
		for (int m = 1; m < month; m++) {
			switch (m) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = days + 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = days + 30;
				break;
			case 2:
				if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
					// ����: 366
					days = days + 29;
				} else {
					days = days + 28;
				}
				break;
			}
		}
		days = days + d;
		System.out.println("���� 1�� 1�� 1�� ���� ���ñ����� ��¥���� " + days + "�Դϴ�.");
		switch (days % 7) {
		case 1:
			System.out.println("������ �Դϴ�.");
			break;
		case 2:
			System.out.println("ȭ���� �Դϴ�.");
			break;
		case 3:
			System.out.println("������ �Դϴ�.");
			break;
		case 4:
			System.out.println("����� �Դϴ�.");
			break;
		case 5:
			System.out.println("�ݿ��� �Դϴ�.");
			break;
		case 6:
			System.out.println("����� �Դϴ�.");
			break;
		case 7:
			System.out.println("�Ͽ��� �Դϴ�.");
			break;

		}
	}
}
