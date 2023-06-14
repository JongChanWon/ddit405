package ddit.chapt04.sec01;

import java.util.Scanner;

public class Assignment02 {
	public static void main(String[] args) {
		example_01();
		example_02();
		example_03();
	}

	public static void example_01() {
//		문제1] +1 -2 +3 -4 +5 -6 +7 -8 +9 -10 = -5
		int oddSum = 0;
		int evenSum = 0;
		String str = "";

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				if (i != 1) {
					str += " +" + i;
				} else {
					str += "" + i;
				}
				oddSum += i;
			} else {
				if (i == 10) {
					str += " -" + i + " = ";
				} else {
					str += " -" + i;
				}
				evenSum -= i;
			}
		}
		System.out.println(str + (oddSum + evenSum));
	}

	public static void example_02() {
//		문제 2] 키보드로 단어를 입력 받아 단어에 포함된 모음(a,e,i,o,u)의 수를 출력하시오.
		// ex) scanner 라는 단어를 입력하면 a,e 모음수 => 2개
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int count = 0;
		char ch = ' ';

		for (int i = 0; i < word.length(); i++) {
			ch = word.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("모음: " + ch);
				count++;
			}
		}
		System.out.println("모음 개수: " + count);
		sc.close();
	}

	public static void example_03() {
//		문제 3] 1-50 사이에 존재하는 fibonacci 수열을 출력하시오
//    	** fibonacci 수열 : 첫 수와 두번째수가 1로 주어지고 그 다음부터
//      전 두 수의 합이 현재수가 되는 수열
//      => 자료 검색알고리즘에 사용(피노나치 검색)
		int num1 = 1; // 전전 수
		int num2 = 1; // 전 수
		int sum = 0; // 현재 수
		// System.out.prinf("형식지정문자열" , 변수); []는 생략 할 수 있음 "%[-][m][.m]d|s|f" 가 올수 있음
		// [-]오른쪽 왼쪽 정렬 변경, [m] 자리수(출력공간의 크기), [.m] 소수점 이하의 자리수, d 10진수(정수) | s 문자열 | 실수
		// 1, 1, 2, 3, 5, 8, 13, 21, 34
		// System.out.printf("%5d%6.2f", 20, 6.2);
		System.out.printf("%1d%2d", 1, 1);
		for (int i = 1; i <= 50; i++) {
			sum = num1 + num2;
			if (sum > 50) {
				break;
			} else {
				if (sum >= 10) {
					System.out.printf("%3d", sum);
				} else {

					System.out.printf("%2d", sum);
				}
				num1 = num2;
				num2 = sum;
			}
		}
	}
}