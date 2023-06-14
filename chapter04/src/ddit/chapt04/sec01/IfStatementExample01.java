package ddit.chapt04.sec01;

import java.util.Scanner;

public class IfStatementExample01 {
	public static void main(String[] args) {
		// 관계 연산자, 논리연산자만 if 조건문에 쓰일 수 있음
		IfStatement is = new IfStatement();
		// is.method1();
		is.method2();
	}
}

class IfStatement {
	Scanner sc = new Scanner(System.in);
	boolean flag = false;

	public void method1() {
		// 예제1) 키보드로 정수를 입력 받아서 60점 이상이면 "합격"을 출력하세요
		while (!flag) {
			System.out.print("점수입력: ");
			int score = sc.nextInt();

			if (score >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
			System.out.println();
		}
	}

	public void method2() {
		// 예제2) 컴퓨터가 1~50사이의 난수를 발생
		// 사용자는 1~50사이의 숫자를 키보드로 입력받아 컴퓨터와 발생시킨 난수와 비교해서 같은 값을 찾아라
		// 컴퓨터가 발생시킨 난수를 맞추는 게임
		// 컴퓨터가 발생시킨 난수 > 사용자가 입력한 수 => "더 큰수를 입력하세요..."
		// 컴퓨터가 발생시킨 난수 < 사용자가 입력한 수 => "더 작은수를 입력하세요..."
		// 컴퓨터가 발생시킨 난수 = 사용자가 입력한 수 => "정답입니다"
		int com = (int) (Math.random() * 50 + 1);
		int count = 0; // 시도횟수

		while (!flag) {
			System.out.print("숫자 입력(1~50): ");
			int me = sc.nextInt();
			count++;

			if (com > me) {
				System.out.println("더 큰수를 입력하세요");
			} else if (com < me) {
				System.out.println("더 작은수를 입력하세요");
			} else {
				System.out.println("정답입니다");
				System.out.println("시도횟수: " + count);
				break;
			}
		}

	}
}