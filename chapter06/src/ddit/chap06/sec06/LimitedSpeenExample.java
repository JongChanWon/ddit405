package ddit.chap06.sec06;

import java.util.Scanner;

// values() => enum��ҵ��� ������� enumŸ���� �迭�� ��ȯ��
// valueOf(String args) => ��ȣ���� String���� enum���� �����´�. ���̾����� exception

public class LimitedSpeenExample {
	public static void main(String[] args) {
		String str = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("1. ������");
		System.out.println("2. �ó�����");
		System.out.println("3. �ÿ�����");
		System.out.println("=============");
		System.out.print("��ȣ����: ");
		int num = sc.nextInt();

		if (num == 1) {
			str = "SchoolZone";
		} else if (num == 2) {
			str = "DownTown";
		} else if (num == 3) {
			str = "CountrySide";
		} else {
			System.out.println("��ȣ ���� �ٽ����ּ���");
			System.exit(0);
		}

		LimitedSpeed limitedSpeed = LimitedSpeed.valueOf(str);
		switch (limitedSpeed) {
		case SchoolZone:
			System.out.println(limitedSpeed.getValues() + "������ �ӵ��� �����ؾ� �մϴ�.");
			System.out.println(limitedSpeed.ordinal() + 1); // ordinal() => �ش� ���Ű�ü�� ���°���� �˷���
			break;
		case DownTown:
			System.out.println(limitedSpeed.getValues() + "������ �ӵ��� �����ؾ� �մϴ�.");
			System.out.println(limitedSpeed.ordinal() + 1);
			break;
		case CountrySide:
			System.out.println(limitedSpeed.getValues() + "������ �ӵ��� �����ؾ� �մϴ�.");
			System.out.println(limitedSpeed.ordinal() + 1);
			break;

		default:
			break;
		}
	}
}
