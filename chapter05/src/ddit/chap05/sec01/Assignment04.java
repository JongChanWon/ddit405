package ddit.chap05.sec01;

import java.util.Arrays;

public class Assignment04 {

	public static void main(String[] args) {
//		example01();
//		example02();
		example03();
	}

	static void example01() {
//		문제 1] 정수 5개를 저장하고 역순으로 인쇄    
		int[] num = { 23, 33, 45, 12, 31 };
		for (int i = 4; 0 <= i && i <= num.length - 1; i--) {
			System.out.print(num[i] + " ");
		}
	}

	static void example02() {
//		문제 2] 저장된 10개의 점수 중 최대값과 최소값을 구하시오
		int[] num = { 33, 12, 83, 14, 25, 36, 37, 91, 39, 40 };
		int maxNum = num[0];
		int minNum = num[0];

		for (int i = 0; i < num.length; i++) { // 인덱스 0~9까지

			if (maxNum < num[i]) {
				maxNum = num[i];
			} else if (minNum > num[i]) {
				minNum = num[i];
			}
		}
		System.out.println("최대값: " + maxNum);
		System.out.println("최소값: " + minNum);
	}

	static void example03() {
//		문제 3] 5명의 이름을 배열에 저장한 후 첫 번째 이름과 마지막 이름을 서로 바꾸시오
		String[] name = { "원종찬", "변현철", "박진영", "홍종욱", "윤동호" };
		String tempName = "";
		for (int i = 0; i < name.length; i++) {
			tempName = name[0];
			name[0] = name[4];
			name[4] = tempName;

		}
		System.out.println(Arrays.toString(name));
	}
}
