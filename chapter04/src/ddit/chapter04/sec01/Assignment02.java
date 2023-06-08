package ddit.chapter04.sec01;

import java.util.Scanner;

public class Assignment02 {
	public static void main(String[] args) {
		// example_01();
		// example_02();
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

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
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

		for (int i = 1; i <= 50; i++) {

		}

	}
}