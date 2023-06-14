package ddit.chap05.sec08;

import java.util.Random;

public class TwoDimHistogram {
	public static void main(String[] args) {
		int[] res = castDice();
		int rowCount = maxOfValues(res);
		insertChar(rowCount, res);
	}

	private static void insertChar(int rowCount, int[] res) { // 매개변수로 받아온 값 : 최대값, 6개의 난수배열
		char[][] histo = new char[rowCount][6];
		for (int j = 0; j < histo[0].length; j++) { // 0 행의 열의수
			for (int i = 0; i < res[j]; i++) {
				histo[i][j] = '*';
			}
		}
		printHistogram(histo);

	}

	private static void printHistogram(char[][] histo) {
		for (int i = histo.length - 1; i >= 0; i--) {
			System.out.printf("%-2d", (i + 1));
			for (int j = 0; j < histo[i].length; j++) {
				System.out.printf("%5s", histo[i][j]);
			}
			System.out.println();
		}
		System.out.println("=================================");
		System.out.println("      1    2    3    4    5    6");
	}

	private static int maxOfValues(int[] res) { // max값 구하는 메서드
		int max = res[0]; // 난수 배열 의 0번째 (난수6개)
		for (int i = 1; i < res.length; i++) {
			if (max < res[i]) {
				max = res[i];
			}
		}
		return max;
	}

	public static int[] castDice() { // 난수 뽑아내는 메서드
		int[] dice = new int[6];
		Random random = new Random();
		for (int i = 0; i < 50; i++) {
			int rnd = random.nextInt(6) + 1;
			dice[rnd - 1]++;

		}
		return dice;
	}
}
