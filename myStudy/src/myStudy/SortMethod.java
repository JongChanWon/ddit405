package myStudy;

public class SortMethod {
	public static void main(String[] args) {
		int[] arr = { 3, 12, 54, 31, 11 };
		bubbleMethod(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	static void bubbleMethod(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (j + 1 < arr.length && arr[j] > arr[j + 1]) {
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
				}
			}
			System.out.print(i + "번째 과정: ");
			for (int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

	static void selectionSort(int[] arr) {
		// 최소값 구해서 왼쪽끝에 둠
		// 앞에서 부터 비교대상에서 제외됨
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
		}
	}
}