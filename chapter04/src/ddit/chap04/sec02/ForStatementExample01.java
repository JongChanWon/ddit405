package ddit.chap04.sec02;

public class ForStatementExample01 {
	public static void main(String[] args) {
		// for문 에서 쓰일 수 있는 연산자(비교연산자, 논리연산자)
		// 무한루프...
//		for (;;) {
//			System.out.println("looping...");
//		}
		// 이중for문에서 안쪽for문은 열을 담당.. 바깥쪽은 행을 담당

//		예제1] 1~100 사이의 정수를 모두 출력하시오.
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println();

//		예제2] 1~100 사이의 모든 수를 더한 값을 출력하시오
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합: " + sum + "\n");

//		예제3] 1~100 사이에 존재하는 짝수와 홀수의 합을 출력하시오
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				oddSum += i;
			} else {
				evenSum += i;
			}
		}
		System.out.println("홀수합: " + oddSum + "\n짝수합: " + evenSum + "\n");

//		예제4] 알파벳 A~Z 를 한줄에 출력하시오.
		System.out.println("알파벳 A~Z");

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		System.out.println();

//		예제5] 1/1 + 1/2 + 1/3 + ... + 1/10 = 의 결과를 출력하시오.
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

//		예제6] +1 -2 +3 -4 +5 -6 +7 -8 +9 -10 = -5
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
		System.out.println("홀수 합: " + oddSum + "\n짝수 합: " + evenSum);
		System.out.println("홀짝 합: " + (oddSum + evenSum));

		ForStatementExample01 fse = new ForStatementExample01();
		fse.forMethod();
	}

	public void forMethod() {
		// 서기 1년 1월 1일부터 23.6.8일까지의 합
		int y = 2023;
		int d = 8;
		int month = 6;
		int days = 0;

		for (int year = 1; year < y; year++) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				// 윤년: 366
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
					// 윤년: 366
					days = days + 29;
				} else {
					days = days + 28;
				}
				break;
			}
		}
		days = days + d;
		System.out.println("서기 1년 1월 1일 부터 오늘까지의 날짜수는 " + days + "입니다.");
		switch (days % 7) {
		case 1:
			System.out.println("월요일 입니다.");
			break;
		case 2:
			System.out.println("화요일 입니다.");
			break;
		case 3:
			System.out.println("수요일 입니다.");
			break;
		case 4:
			System.out.println("목요일 입니다.");
			break;
		case 5:
			System.out.println("금요일 입니다.");
			break;
		case 6:
			System.out.println("토요일 입니다.");
			break;
		case 7:
			System.out.println("일요일 입니다.");
			break;

		}
	}
}
