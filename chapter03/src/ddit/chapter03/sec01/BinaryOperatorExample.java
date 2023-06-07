package ddit.chapter03.sec01;

import java.util.Scanner;

public class BinaryOperatorExample {
	static Scanner sc = new Scanner(System.in);
	static boolean flag = false;

	public static void main(String[] args) {
		// 사칙연산자: +, -, /, *, %
		// fourProngedOperator();
		// 관계연산자: >, <, ==, >=, <=, !=(<>)
		// relationalOperator();
		// 논리연산자: !(not), &&(and), ||(or) ==> 결과가 참or거짓
		// logicalOperator();
		// 할당연산자: =
		// 결합배정연산자: 산술연산자와 할당연산자가 결합
		// => 결과가 기억될 변수가 '=' 오른쪽에 기술되어야함
		// ex) sum = sum + 3 == sum += 3, sum = sum + (cnt*3) == sum += (cnt*3)
		// 비트연산자: &(비트별 and), |(비트별or), ^(비트별 ex-or) ==> 결과가 숫자
		// ##부호비트는 연산이 안됨
		// bitWiser();
		// 이동연산자: >>(right shift), <<(left shift)
		// >>>( "")
		shiftOperator();

	}

	public static void fourProngedOperator() { // 사칙연산자
		// 수 하나를 입력받아 짝수와 홀수를 구별하시오.
		System.out.println("숫자를 입력해 주세요.");

		int num = sc.nextInt();
		if (!(num % 2 == 0)) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
	}

	public static void relationalOperator() {
		// 관계연산자: 관계식에 사용되어 결과가 참, 거짓을 반환
		// if, while, for등에 사용
		while (!flag) {
			System.out.print("문자입력: ");
			char ch = sc.next().charAt(0);

			if (ch >= 97 && ch < 'z') {
				System.out.println("영 소문자를 입력하였음");
			} else if (ch >= 'A' && ch <= 'Z') {
				System.out.println("영 대문자를 입력하였음");
			} else if (ch >= 48 && ch < 58) {
				System.out.println("숫자를 입력하였음");
			} else {
				System.out.println("특수문자를 입력하였음");
			}
			System.out.println();
		}
	}

	public static void logicalOperator() {
		// 키보드로 년도를 입력받아 윤년과 평년을 구별하는 프로그램작성
		// 윤년: 4의배수이면서 100의 배수가 아닌 해 또는 400의 배수가 되는 해
		while (!flag) {
			System.out.print("년도 입력: ");
			int year = sc.nextInt();

			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("윤년");
			} else {
				System.out.println("평년");
			}
		}
	}

	public static void bitWiser() {
		int num1 = 115;
		int num2 = 36;
		char c = 'A' + 1;

		System.out.println(c);
		System.out.println("비트별 &: " + (num1 & num2));
		System.out.println("비트별 |: " + (num1 | num2));
		System.out.println("비트별 ^: " + (num1 ^ num2));

	}

	public static void shiftOperator() {
		// 데이터 >> 이동시킬 비트수
		// 데이터 / 2의 제곱(이동시킬 비트수)

		// 데이터 << 이동시킬 비트수 (오른쪽에 발생된 빈공간은 0이 채워짐) => 부호비트는 이동되지 않음
		// 데이터 * 2의 제곱(이동시킬 비트수)

		// 데이터 >>> 이동시킬 비트수(부호까지 포함해서 3칸 이동)
		// 왼쪽 빈공간에는 0이 채워짐, 부호비트까지도 이동에 참여
		int num1 = 115;
		byte num2 = (byte) -27;

		System.out.println(num2 >>> (byte) 2);

	}
}
