package ddit.chap05.sec05;

import java.util.Arrays;

public class BubbleSort {
//	tree => left-root-right
	int[][] source = { { 27, 13 }, { 35, 31 }, { 19, 15 }, { 8, 23 }, { 60, 56 }, { 33, 67 }, { 20, 98 } };

	// 7행2열
	public int[][] bubbleSort() {
		boolean flag = true;
		for (int i = 0; i < source.length - 1; i++) {
			flag = true;
			for (int j = 0; j < source.length - 1 - i; j++) {
				if (source[j][0] > source[j + 1][0]) {
					int[] temp = source[j];
					source[j] = source[j + 1];
					source[j + 1] = temp;
					flag = false;
					//
				}
			}
			if (flag)
				break;
			System.out.println((i + 1) + "회전: " + Arrays.deepToString(source));

		}
		return source;
	}
}

//1회전: [[27, 13], [19, 15], [8, 23], [35, 31], [33, 67], [20, 98], [60, 56]]
//2회전: [[19, 15], [8, 23], [27, 13], [33, 67], [20, 98], [35, 31], [60, 56]]
//3회전: [[8, 23], [19, 15], [27, 13], [20, 98], [33, 67], [35, 31], [60, 56]]
//4회전: [[8, 23], [19, 15], [20, 98], [27, 13], [33, 67], [35, 31], [60, 56]]