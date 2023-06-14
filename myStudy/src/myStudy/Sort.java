package myStudy;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] num = bubbleSort.bubbleSort();

		System.out.print("정렬 끝: ");
		for (int x : num) {
			System.out.print(x + " ");
		}

	}
}

class BubbleSort {
	int[] num = { 54, 31, 45, 3, 56, 88, 90, 10 };
	boolean flag = true;

	public int[] bubbleSort() {
		for (int i = 0; i < num.length - 1; i++) {
			flag = true;
			for (int j = 0; j < num.length - 1 - i; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					flag = false;
				}
			}
			if (flag)
				break;
			System.out.println((i + 1) + "회전: " + Arrays.toString(num));
		}
		return num;
	}
}