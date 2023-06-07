package ddit.chapter03.sec01;

import java.util.Scanner;

public class UnaryOperatorExample {
	public static void main(String[] args) {
		// 단항연산자: ++, --(증감연산자)
		// +, -(부호연산자)
		// !(NOT: 논리부정 연산자)
		// IncreDecrementOperator();
		logicalNot();
	}

	public static void IncreDecrementOperator() {
		// ++, --: 1씩 증가(감소)
		// 1)전위식(prefix) 표기법
		// ++(--)변수
		// ex) int num = 0;
		// int res = ++num; => num의 값을 1증가 시키고 그 값을 res에 할당
		// 2)후위식(postfix) 표기법
		// 변수++(--)
		// ex) int num = 0;
		// int res = ++num; => num의 값을 res에 할당하고 num 값이 1증가

		System.out.println("1.prefix");
		int val = 100;
		int res = ++val;
		System.out.println("val= " + val + "\nres= " + res);

		val = 100;
		res = val++;
		System.out.println("2.postfix");
		System.out.println("val= " + val + "\nres= " + res);
	}

	public static void logicalNot() {
		// 논리부정(true=>false, false=>true)
		Scanner sc = new Scanner(System.in);
		System.out.print("나이입력: ");
		int age = sc.nextInt();

		if (!(age < 18)) {
			System.out.println("성년");
		} else {
			System.out.println("미성년");
		}
	}

}
