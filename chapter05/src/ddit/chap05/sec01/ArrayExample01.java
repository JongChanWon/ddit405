package ddit.chap05.sec01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample01 {
	public static void main(String[] args) {
//		int[] score = { 23, 24, 25, 27, 31, 55 };
//		int sum = 0;
//		for (int i = 0; i < score.length; i++) {
//			sum += score[i];
//			System.out.println(sum);
//		}
//		System.out.println(sum);

		// 예제1] 5개의 배열요소를 갖는 정수형 배열을 생성하시오.
		// int[] num = new int[5];
		int[] num = { 35, 70, 65, 23, 90 };

		System.out.println(Arrays.toString(num)); // 배열안에 어떤값이 들어가 있나 확인하기 위한 메서드
		System.out.println(num); // 주소값이 들어있음
		// 예제2] 예제1에서 생성된 배열에 다음 자료를 입력하시오. [데이터: 35,70,65,23,90]
//		num[0] = 35;
//		num[1] = 70;
//		num[2] = 65;
//		num[3] = 23;
//		num[4] = 90;

		for (int i = 0; i < num.length; i++) {
			System.out.print("기본 For문: " + num[i] + ", ");
		}
		System.out.println("num3: " + num[3]);
		System.out.println();
		for (int i : num) {
			System.out.print("향상된 for문: " + i + ","); // 순서화 되어서 저장되어있는 자료일때 사용
		}
		System.out.println();
		// 예제3] 45개의 요소를 갖는 정수형 배열을 선언하고 1부터45까지 차례대로 값을 저장하시오.
		int[] number = new int[45];

		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
		}
		System.out.println(Arrays.toString(number));
		System.out.println(number.length);

		String[] friends = { "임형택", "원종찬", "김영광" };

		for (int i = 0; i < friends.length; i++) {
			System.out.print(friends[i] + ", ");
		}

//		예제5] 3과목의 점수를 키보드로 입력받아 배열에 저장하고 총점과 평균을 구하시오
		Scanner sc = new Scanner(System.in);
		int[] subject = new int[3];
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < subject.length; i++) {
			int scores = Integer.parseInt(sc.nextLine());
			subject[i] = scores;
			sum += subject[i];

		}
		avg = sum / (double) subject.length;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);

//		예제6] 주사위를 50번 던져 나온 각각의 눈의 횟수(경우의 수)를 배열에 저장하고 출력하시오
//		1이 몇번 2가 몇번
		// dicebox[0]가 random수
//		int[] diceBox = new int[50];
//		int[] count = new int[6];

//		int countt = 0;
//		sum = 0;
//		for (int i = 0; i < diceBox.length; i++) {
//			int dice = (int) (Math.random() * 6 + 1);
//			diceBox[i] = dice;
//			if (diceBox[i] == dice) {
//				for (int j = 0; j < count.length; j++) {
//					count[j] = diceBox[i];
//					
//				}
//			}
//		}
//
//		System.out.println(Arrays.toString(diceBox));
//		System.out.println(Arrays.toString(count));

		int[] dice = new int[6];

		for (int i = 0; i < 50; i++) {
			int rnd = (int) (Math.random() * 6) + 1;
			dice[rnd - 1]++;
		}

		for (int i = 0; i < dice.length; i++) {
			System.out.println((i + 1) + "눈: " + dice[i]);
		}

	}
}
