package myStudy;

import java.util.Calendar;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);

		while (true) {
			Scanner sc = new Scanner(System.in);
			int selection = Integer.parseInt(sc.nextLine());
			switch (selection) {
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
			default:
				System.out.println("�߸������̽��ϴ�. �ٽ� �Է���");
				break;
			}
			if (today == Week.SUNDAY) {
				System.out.println("�౸ ����");
			} else {
				System.out.println("�ڹٰ��� ����");
			}
		}
	}
}
