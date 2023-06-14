package ddit.chap05.sec05;

public class SortExample {
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int num[][] = bubbleSort.bubbleSort();

		for (int[] x : num) {
			System.out.print(x + " ");
		}
//		SelectionSort selectionSort = new SelectionSort();
//		int[] num = selectionSort.selectionSort();
//		System.out.print("Selection Sort: ");
//		for (int x : num) {
//			System.out.print(x + " ");
//		}

	}
}
