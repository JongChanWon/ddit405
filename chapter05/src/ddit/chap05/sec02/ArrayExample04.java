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
		// 주소전달방식 때문에

		int[] res = new int[target.length];
		for (int i = 0; i < target.length; i++) {
			// int idx = target.length - 1;
			res[target.length - 1 - i] = target[i];
		}
		return res;

	}

	public static void arrayMethod02(int[] arr) {

		int tmax = arr[0]; // 임시 최대값
		int tmin = arr[0]; // 임시 최소값

		for (int i = 1; i < arr.length; i++) {
			if (tmax < arr[i]) {
				tmax = arr[i];
			} else if (tmin > arr[i]) {
				tmin = arr[i];
			}
		}
		System.out.println("최대값: " + tmax);
		System.out.println("최소값: " + tmin);

	}

	public static void arrayMethod03() {
		String[] name = { "홍길동", "이성계", "정몽주", "성문삼", "강감찬" };
//		System.out.println(Arrays.toString(name));
//		name[0] = name[name.length - 1];
//		System.out.println(Arrays.toString(name));

		String temp = name[0];
		name[0] = name[name.length - 1];
		name[name.length - 1] = temp;

		System.out.println(Arrays.toString(name));

	}
}
