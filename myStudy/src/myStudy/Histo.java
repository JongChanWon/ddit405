package myStudy;

import java.util.Arrays;
import java.util.Random;

public class Histo {
	public static void main(String[] args) {
		HistoAct ha = new HistoAct();
		int[] dfd = ha.castDice();
		int rowCount = ha.maxOfValues(dfd);
		ha.insertChar(rowCount, dfd);

	}

}

class HistoAct {
	public int maxOfValues(int[] dfd) { // 최대값
		int max = dfd[0];
		for (int i = 0; i < dfd.length; i++) {
			if (max < dfd[i]) {
				max = dfd[i];
			}
		}
		return max;
	}

	public void insertChar(int rowCount, int[] dfd) {
		char[][] histo = new char[rowCount][6];
		for (int j = 0; j < histo[0].length; j++) {
			for (int i = 0; i < dfd[i]; i++) {
				histo[i][j] = '*';
			}
		}
		printHistogram(histo);

	}

	private void printHistogram(char[][] histo) {
		for (int i = histo.length - 1; i >= 0; i--) {
			System.out.printf("%-2d", (i + 1));
			for (int j = 0; j < histo[i].length; j++) {

			}
		}

	}

	public int[] castDice() {
		int[] dice = new int[6];// 6개의 배열공간
		Random rd = new Random();
		for (int i = 0; i < 50; i++) {
			int rnd = rd.nextInt(6) + 1;
			dice[rnd - 1]++;
			System.out.println(Arrays.toString(dice));
		}

		return dice;
	}
}