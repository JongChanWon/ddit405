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
		// 반환타입이 없는 메서드(void)는 println() 안에 쓸 수 없다.
	}

	public void switchMethod1() {
		// 예제1] 키보드로 회원의 등급(1~3)을 입력받아 1이면 "vip 회원입니다.

		System.out.print("회원 등급 코드: ");
		int grade = sc.nextInt();

		switch (grade) {
		case 1:
			System.out.println("vip 회원입니다.");
			break;
		case 2:
			System.out.println("우수 회원입니다.");
			break;
		case 3:
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("등급코드가 잘못입력되었습니다.");
			break;
		}
	}

	public void switchMethod2() {
		// 예제2] 화면에 "[1]. 회원 신규 등록" "[2]. 회원 정보 수정" "[3]. 회원정보 삭제"

		System.out.println("[1]. 회원 신규 등록");
		System.out.println("[2]. 회원 정보 수정");
		System.out.println("[3]. 회원 정보 삭제");
		int select = sc.nextInt();
		switch (select) {
		case 1:
			System.out.println("등록 되었습니다.");
			break;
		case 2:
			System.out.println("수정 되었습니다.");
			break;
		case 3:
			System.out.println("삭제 되었습니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			break;
		}
	}

	public void switchMethod3() {
		// 문제1] 1~12월을 입력 받아 1,3,5,7,8,10,12월이면 "31일까지 있는 달 입니다"

		System.out.println("개월을 입력해주세요");
		int month = sc.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일까지 있는 달 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일까지 있는 달 입니다.");
			break;
		case 2:
			System.out.println("28 혹은 29일 까지 있는 달 입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			break;
		}

	}

	public void switchMethod4() {
		// 문제2] 점수 하나를 입력 받아 그 값이 100~96 이면 "A"
		System.out.print("점수 입력: ");
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
		System.out.println("점수 " + score + "의 등급은 " + grade + "입니다.");
	}

}
