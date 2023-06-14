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
			System.out.print(i + "��° ����: ");
			for (int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

	static void selectionSort(int[] arr) {
		// �ּҰ� ���ؼ� ���ʳ��� ��
		// �տ��� ���� �񱳴�󿡼� ���ܵ�
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