package ddit.chap05.sec05;

public class SelectionSort {
	int[] source = { 27, 15, 92, 63, 57, 79, 80, 21 };

	public int[] selectionSort() {
		for (int i = 0; i < source.length - 1; i++) {
			for (int j = i + 1; j < source.length; j++) {
				if (source[i] > source[j]) {
					int temp = source[i];
					source[i] = source[j];
					source[j] = temp;
				}
			}
			System.out.print((i + 1) + "번째 과정: ");
			for (int x : source) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		return source;
	}
}
