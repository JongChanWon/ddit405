package myStudy;

public class Test {
	public static void main(String[] args) {
		// 1. ���ǹ��� ����
		// if, switch case��

		// 2. O, X, O, X

		// 3. ����� B�Դϴ�.
		// 4. � ������ ���ϼ���? ��� ȸ�� ������ ������ �� �ֽ��ϴ�. �����մϴ�.
		// 5

		char grade = 'C';
		switch (grade) {
		case 'A':
			System.out.println("vvip");
		case 'B':
			System.out.println("vip");
			break;
		case 'C':
			System.out.println("���");
		case 'D':
			System.out.println("�Ϲ�");
			break;
		default:
			System.out.println("no ����");
		}
		System.out.println("����");

		int i = 2;
		for (i = 2; i <= 9; i++) {

			System.out.print(i + "��\t");

		}
		System.out.println();
		for (int j = 1; j <= 9; j++) {
			for (int j2 = 2; j2 <= 9; j2++) {

				System.out.print(j2 + "*" + j + "=" + j2 * j + "\t");
			}
			System.out.println();
		}
	}
}
