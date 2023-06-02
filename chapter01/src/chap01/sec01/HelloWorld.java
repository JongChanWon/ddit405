package chap01.sec01;

import java.util.Random;

public class HelloWorld {

	public static void main(String[] args) {
		Random rm = new Random();
		int a = rm.nextInt();
		System.out.println(a);
		int age = 33;

		if (a > age) {
			System.out.println("내나이가 어때서");
		} else {
			System.out.println("니나이가 어때서");
		}

		String st = new String("dd");
		System.out.println(st);
	}
}