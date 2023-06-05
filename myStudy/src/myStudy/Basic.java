package myStudy;

import java.util.Scanner;

public class Basic {
	public static void main(String[] args) {
		// boolean stop = true;

		// while (!stop) {

		// }
		int pencils = 534;
		int students = 30;

		// 2
		int pencilsPerStudent = (pencils / students);
		int pencilsLeft = (pencils % students);

		System.out.println(pencilsPerStudent);
		System.out.println(pencilsLeft);

		// 3
		// int로 강제 형변환 시켜서

		int var1 = 5;
		int var2 = 2;

		double var3 = var1 / (double) var2;
		int var4 = (int) (var3 * (double) var2); // 2.5*2
		System.out.println(var4);

		int value = 356;
		System.out.println(value);

		float var5 = 10f;
		System.out.println(var5 / 100f);
		float var6 = var5 / 100;
		System.out.println(var6);
		if (var6 != 0.1) {
			System.out.println("10%입니다");
		} else {
			System.out.println("10%가 아닙니다");
		}

		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double) lengthBottom * height;
		System.out.println(area);

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째수: ");
		double d1 = Double.parseDouble(sc.next());
		System.out.print("두번째수: ");
		double d2 = Double.parseDouble(sc.next());

		double sum = d1 / d2;

		System.out.println("결과: " + sum);

		byte b = 5;
		b = (byte) -b;
		System.out.println(b);

		int x = 10;
		int y = 20;
		x = ++x;
		// int z = (++x) + (y--);
		System.out.println(x);

		int num = (int) (Math.random() * 6) + 1;

		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;

		case 2:
			System.out.println("2번이 나왔습니다.");
			break;

		case 3:
			System.out.println("3번이 나왔습니다.");
			break;

		case 4:
			System.out.println("4번이 나왔습니다.");
			break;

		case 5:
			System.out.println("5번이 나왔습니다.");
			break;

		default:
			System.out.println("6번이 나왔습니다.");
			break;
		}

	}
}
