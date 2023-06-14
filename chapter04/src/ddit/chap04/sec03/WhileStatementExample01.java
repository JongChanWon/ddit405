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
			System.out.println(i + "단");
			j = 1;
			while (j < 10) {
				System.out.println(i + "*" + j + "=" + i * j);
				j++;

			}
			System.out.println();
			i++;
		}

		System.out.println("==============For문===============");
		for (i = 2; i < 10; i++) {
			for (j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
		System.out.println("=================================");

	}

	public static void moneyBox() {
		int sum = 0; // 저축 총액
		int days = 0; // 경과일수
		int amount = 100;

		while (sum <= 1000000) {
			sum += amount;
			amount *= 2;
			days++;
		}
		System.out.println("경과일수: " + days + "일\n저축금액: " + sum + "원");
	}

	public static void numberChop() {
		int count = 0;
		while (count < 9) {
			count++;
			System.out.println(count + "번째 도끼질을 했습니다. 아직 나무는 안넘어 갔습니다.");
		}
		System.out.println(++count + "번째 도끼질을 했습니다. 나무가 넘어갔습니다.");
	}

	public static void cafe() {
		Scanner sc = new Scanner(System.in);

		String menu = "1. 아메리카노 2000원\n" + "2. 카페라떼 3500원\n" + "3. 카라멜마끼야또 5000원\n" + "4. 자바칩 프라프치노 6500원\n" + "5. 종료";
		int sum = 0; // 주문 금액 합계
		int exit = 0; // 프로그램 종료 상태
		String bill = "     **영수증**\n";
		bill += "===================\n";

		while (true) {
			System.out.println(menu);
			System.out.print("드시고 싶은 커피를 선택해주세요");
			int choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1:
				sum += 2000;
				bill += "1. 아메리카노 2000원\n";
				break;
			case 2:
				sum += 3500;
				bill += "2. 카페라떼 3500원\n";
				break;
			case 3:
				sum += 5000;
				bill += "3. 카라멜마끼야또 5000원\n";
				break;
			case 4:
				sum += 6500;
				bill += "4. 자바칩 프라프치노 6500원\n";
				break;

			case 5:
				exit = -1;
				break;
			default:
				System.out.println("잘못된 선택입니다.");
				break;
			}
			if (exit == -1) {
				System.out.println("프로그램을 종료하겠습니다.");
				System.out.println();
				break; // while문 break
			}
		}
		bill += "===================\n";
		bill += "    합계: " + sum;
		System.out.println(bill + "원");
		System.out.println("===============================================================");

		for (int i = 2; i <= 9; i++) {
			System.out.print(i + "단\t");
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
			System.out.print(i + "단\t");

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
