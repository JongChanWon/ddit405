package chap01.sec01;

import java.util.Random;

public class HelloWorld {

	public static void main(String[] args) {
		Random rm = new Random();
		int a = rm.nextInt();
		System.out.println(a);
		int age = 33;

		if (a > age) {
			System.out.println("�����̰� ���");
		} else {
			System.out.println("�ϳ��̰� ���");
		}

		String st = new String("dd");
		System.out.println(st);
	}
}