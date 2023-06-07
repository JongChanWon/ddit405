package ddit.chapter03.sec01;

import java.util.Scanner;

public class TrinominalOperatorExample {
	public static void main(String[] args) {
		// 삼항 연산자 (조건식)? 값1 : 값2
		// 조건식의 결과가 참이면 값1 반환, 거짓이면 값2 반환

		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();
		char grade = (score >= 90 ? 'A' : (score >= 80 ? 'B' : (score >= 70 ? 'C' : (score >= 60 ? 'D' : 'F'))));
		System.out.println(grade);
		int a = 0b00010100;
		System.out.println(a);
	}
}
