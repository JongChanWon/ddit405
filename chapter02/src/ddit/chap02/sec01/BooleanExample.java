package ddit.chap02.sec01;

import java.util.Scanner;

public class BooleanExample {
	public static void main(String[] args) {
		boolean flag = true;
		int age = 0;

		System.out.println(flag);
		Scanner sc = new Scanner(System.in);
		// 객체 생성 , 멤버변수 초기화가 목적
		// new로 인해서 heap에 저장
		// 생성자에 의 해 초기화
		// 생성자 메소드는 대문자

//		키보드로 자료를 입력받는 방법 (Scanner class 사용)
//		1) Scanner class 객체 생성 => new 연산자 사용
//		2) 메시지를 출력
		System.out.print("나이입력: ");
//		3) 입력받은 자료 저장(scanner클래스 메서드 사용)
		age = sc.nextInt();
		System.out.println(age);

	}
}
