package ddit.chap05.sec02;

import java.util.Arrays;

public class ArrayExample04 {
	public static void main(String[] args) {
		int[] arr = { 120, 730, 50, 440, 290, 300, 510, 620, 29, 930 };
		int[] res = arrayMethod01(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));

		arrayMethod02(arr);
		arrayMethod03();
	}

	public static int[] arrayMethod01(int[] target) {
		// �ּ����޹�� ������

		int[] res = new int[target.length];
		for (int i = 0; i < target.length; i++) {
			// int idx = target.length - 1;
			res[target.length - 1 - i] = target[i];
		}
		return res;

	}

	public static void arrayMethod02(int[] arr) {

		int tmax = arr[0]; // �ӽ� �ִ밪
		int tmin = arr[0]; // �ӽ� �ּҰ�

		for (int i = 1; i < arr.length; i++) {
			if (tmax < arr[i]) {
				tmax = arr[i];
			} else if (tmin > arr[i]) {
				tmin = arr[i];
			}
		}
		System.out.println("�ִ밪: " + tmax);
		System.out.println("�ּҰ�: " + tmin);

	}

	public static void arrayMethod03() {
		String[] name = { "ȫ�浿", "�̼���", "������", "������", "������" };
//		System.out.println(Arrays.toString(name));
//		name[0] = name[name.length - 1];
//		System.out.println(Arrays.toString(name));

		String temp = name[0];
		name[0] = name[name.length - 1];
		name[name.length - 1] = temp;

		System.out.println(Arrays.toString(name));

	}
}
