package ddit.chap02.sec02;

import java.util.Random;
import java.util.Scanner;

public class TypeExample02 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

//		example01();

//		int ch = 0;
//		try {
//			ch = System.in.read();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		while ((char) ch != 'y') {
//			System.out.println("반복작업");
//		}
		// example02();
		example03();
	}

	public static void example01() {
		// 예제1) 키보드로 문자 한자를 입력 받아 그 문자에 해당하는 유니코드(ASCII코드)를 출력하는 프로그램

		System.out.print("문자입력: ");
		String scan = sc.next(); // 공백으로 구별되어지는 문자열을 취급
		String scan1 = sc.nextLine(); // 공백으로 구별되어지는 문자열을 취급

		char a = scan.charAt(0);
		// char scan1 = sc.next().charAt(0);
		System.out.println((int) a);

		int num1 = sc.nextInt();
		int num2 = Integer.parseInt(sc.nextLine());

	}

	public static void example02() {
		// 예제2) 키보드로 3과목의 점수를 입력 받아 총점과 평균을 구하시오. 단, 평균은 실수로 출력하시오.
//		System.out.print("국어점수: ");
//		int sub1 = sc.nextInt();
//		System.out.print("수학점수: ");
//		int sub2 = sc.nextInt();
//		System.out.print("영어점수: ");
//		int sub3 = sc.nextInt();
//
//		int sum = sub1 + sub2 + sub3;
//		double avg = (double) sum / 3;
//
//		System.out.println("총점: " + sum + "\n" + "평균: " + avg);

		// 키보드로 실수하나를 입력받아 소수점 2자리에서 반올림하시오

//		double a = sc.nextDouble();
		double num = Double.parseDouble(sc.nextLine());
		System.out.println(((int) (num * 10 + 0.5)) / 10.0);
	}

	public static void example03() {
		// Math.random() => min~max사이의 정수형 난수 - (int)(Math.random()*max)+min
		// 예제3) 주사위를 던졌을때 나오는 눈의 값을 출력하시오. =>Math class와 Random Class를 이용
		int i = 0;
		for (i = 0; i < 50; i++) {
			int dice = (int) (Math.random() * 6 + 1);
			System.out.println("발생된 눈: " + dice);
		}

		System.out.println("------------------------------");

		Random rn = new Random();
		// 범위 지정 (min~max)정수형 난수
		// int rnd = rn.nextInt(max) + min;

		for (i = 0; i < 50; i++) {
			int rnd = rn.nextInt(6) + 1;
			System.out.println("발생된 눈1: " + rnd);
		}
	}
}